package guru.springframework.sfgDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgDI.controllers.ConstructorInjectedController;
import guru.springframework.sfgDI.controllers.MyController;
import guru.springframework.sfgDI.controllers.PropertyInjectedController;
import guru.springframework.sfgDI.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		/*Defines Spring Context */
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		/*Asking Spring to provide an isntance of the Spring Context BEAN */
		/*Notice 'new' is not here to define object, Spring framewrok assumes 'new' underneath */
		MyController myController = (MyController) ctx.getBean("myController");

		/*Use object to execute method, set to variable */
		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("-----Property");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-----Setter");

		SetterInjectedController setterinjectedcontroller = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterinjectedcontroller.getGreeting());

		System.out.println("-----Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

	}

}
