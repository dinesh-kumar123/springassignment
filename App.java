package Springcore10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		{
	    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
			Customer obj=(Customer)context.getBean("customer");
			obj.customerDetails();
		
	        
	    }

	}

}
