package com.lkp.demo.tomcat;

import org.omg.CORBA.RepositoryIdHelper;

import java.lang.annotation.Repeatable;

/**
 * @author: LKP
 * @date: 2020/4/18
 */
public abstract class MyServlet {

    public abstract void doGet(MyRequest request, MyResponse response);

    public abstract void doPost(MyRequest request, MyResponse response);

    private static final String METHOD_POST = "POST";
    private static final String METHOD_GET = "GET";

    public void service(MyRequest request, MyResponse response){
        String method = request.getMethod();
        if(METHOD_POST.equalsIgnoreCase(method)){
            doPost(request, response);
        }else if(METHOD_GET.equalsIgnoreCase(method)){
            doGet(request, response);
        }
    }

}
