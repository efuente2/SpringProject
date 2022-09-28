package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Student student = (Student) context.getBean("Student");
        System.out.println("Name : " + student.getName() );
        System.out.println("Address : " + student.getAdd());
        System.out.println("ID : " + student.getId());
        System.out.println("Phone Numbers : " + student.getPh());
    }
    }

