package com.cts.springday1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //1.instantiate spring core container
        BeanFactory factory=new
        		XmlBeanFactory(new FileSystemResource
        				("C:\\Users\\alka0\\workspace\\mvn-ecl-jv-spring\\src\\resources\\beans-dtd.xml"));
        System.out.println("Factory is ready..............");
        
        //2. ask for the  bean from factory reference
        Object obj=factory.getBean("bRef");
        B b=(B)obj;
        System.out.println(b.useMesage("1.2.3.......Spring IOC launched......"));
    }
}
