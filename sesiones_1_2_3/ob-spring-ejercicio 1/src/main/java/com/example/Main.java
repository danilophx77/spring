package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        //Saludo saludo = (Saludo) context.getBean("Saludo");
        //String texto = String.valueOf(saludo);
        //System.out.println(texto);

        notificationService notification= (notificationService)context.getBean("notification");






    }
}
