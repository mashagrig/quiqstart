package org.example.main;

import org.example.impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ModelT1000 t1000 = (ModelT1000)context.getBean("t1000");
        t1000.action();
    }
}
