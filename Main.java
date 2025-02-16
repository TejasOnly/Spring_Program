package practice.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice.spring.beans.IPL;

public class Driver {
	public static void main(String[] args) {
		String Source_Path ="/practice/spring/resources/ApplicationContext.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(Source_Path);
		IPL ipl=(IPL) context.getBean("IPL");
		ipl.Display();
		
		
	}

}
