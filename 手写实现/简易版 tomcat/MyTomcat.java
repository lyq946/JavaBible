package com.lkp.demo.tomcat;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: LKP
 * @date: 2020/4/18
 */
public class MyTomcat {

    private int port = 8080;

    private Map<String, String> urlServletMap = new HashMap<String, String>();

    public MyTomcat(int port) {
        this.port = port;
    }

    public void start(){
        // 初始化 URL 与对应处理的 servlet 的关系
        initServletMapping();

        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("MyTomcat is start...");

            while(true){
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                OutputStream outputStream = socket.getOutputStream();

                MyRequest request = new MyRequest(inputStream);
                MyResponse response = new MyResponse(outputStream);

                // 请求分发
                dispatch(request, response);

                socket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 初始化servlet映射
     */
    private void initServletMapping(){
        for (ServletMapping servletMapping : ServletMappingConfig.servletMappingList) {
            urlServletMap.put(servletMapping.getUrl(), servletMapping.getClazz());
        }
    }

    /**
     * 请求分发
     * @param request
     * @param response
     */
    private void dispatch(MyRequest request, MyResponse response){
        String clazz = urlServletMap.get(request.getUrl());
        if(clazz == null){
            return;
        }
        // 反射
        try {
            Class<MyServlet> myServletClass = (Class<MyServlet>) Class.forName(clazz);
            MyServlet myServlet = myServletClass.newInstance();
            myServlet.service(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        MyTomcat tomcat = new MyTomcat(8080);
        tomcat.start();
    }
}

