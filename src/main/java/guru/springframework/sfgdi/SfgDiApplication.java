package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import controllers.ContructorInjectedController;
import controllers.I18nController;
import controllers.MyController;
import controllers.PropertyInjectedController;
import controllers.SetterInjectedController;


@SpringBootApplication
@ComponentScan("controllers") 
@ComponentScan("services")
public class SfgDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		System.out.println("---------------Primary Bean");
		System.out.println(myController.sayHello());
		
		
		System.out.println("---------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
	
		System.out.println("---------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
	
		
		System.out.println("---------------Constructor");
		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");
		System.out.println(contructorInjectedController.getGreeting());
	}

}
