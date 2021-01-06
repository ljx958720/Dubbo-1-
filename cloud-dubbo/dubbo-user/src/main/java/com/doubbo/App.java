package com.doubbo;


import com.ghy.server.ILoginService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ILoginService loginService=null;
        ApplicationContext context=new
                ClassPathXmlApplicationContext
                ("classpath:META-INF/spring/application.xml");
        loginService=context.getBean(ILoginService.class);
        System.out.println(loginService.login("admin","123456"));
    }
}
