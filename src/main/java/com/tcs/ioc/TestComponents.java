package com.tcs.ioc;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponents {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
                 System.out.println(context);


        Connection connection= (Connection)context.getBean("Connection");
        System.out.println(connection.getConnection());
        BusinessService service = (BusinessService)  context.getBean("business");

       service.callRepo();




        }
    }
