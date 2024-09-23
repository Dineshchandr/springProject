package springioc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springioc.demo.Controller.MyController;

@SpringBootApplication
public class  DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ext=SpringApplication.run(DemoApplication.class, args);
		MyController myController=(MyController) ext.getBean("myController");
	String con=	myController.myOjb();

		System.out.println(con);
	}

}
