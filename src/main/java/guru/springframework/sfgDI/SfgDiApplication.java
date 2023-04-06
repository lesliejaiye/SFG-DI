package guru.springframework.sfgDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgDI.controllers.MyController;

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
	}

}
