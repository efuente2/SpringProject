package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Student Ernesto = (Student) context.getBean(Student.class);
        Student student = (Student) context.getBean("Student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Address : " + student.getAdd());
        System.out.println("ID : " + student.getId());
        System.out.println("Phone Numbers : " + student.getPh());
    }
    }

