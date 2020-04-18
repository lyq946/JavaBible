package com.lkp.demo.tomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: LKP
 * @date: 2020/4/18
 */
public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new ArrayList<>(5);

    static{
        servletMappingList.add(new ServletMapping("findGirlServlet", "/girl", "com.lkp.demo.tomcat.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("helloWorldServlet", "/world", "com.lkp.demo.tomcat" +
                ".HelloWorldServlet"));
    }

}
