package net.designated.aopTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.designated.aopTest.beans.HelloPrinter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml");
 
		HelloPrinter obj = (HelloPrinter) context.getBean("helloBean");
		obj.printHello();
    }
}
