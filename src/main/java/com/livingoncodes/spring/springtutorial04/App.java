//Spring frameworkで初めてコード


package com.livingoncodes.spring.springtutorial04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//クラス経路からbeans.xmlファイルを入力する
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/newpackage/beans.xml");
    	
    	Patient patient = (Patient) context.getBean("beans");
    	patient.speak();
    	
    	((ClassPathXmlApplicationContext) context).close();
    	
    	
		/*
		 * Patient obj = new Patient(); obj.speak();
		 */
    	
        //System.out.println( "Hello World!" );
    }
}
