package com.SatyaSpring;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );

//        Tomcat tc = new Tomcat();
//        tc.setPort(8083);
//
//        Context context = tc.addContext("",null);
//        tc.addServlet(context,"HelloServlet",new HelloServlet());
//
//        context.addServletMappingDecoded("/hello","HelloServlet");
//
//        tc.start();
//        tc.getServer().await();
    }
}
