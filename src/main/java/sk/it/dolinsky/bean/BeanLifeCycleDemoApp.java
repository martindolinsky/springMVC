package sk.it.dolinsky.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import sk.it.dolinsky.ioc.Coach;

/**
 * @author Martin Dolinsky
 */
public class BeanLifeCycleDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		Coach theCoach = context.getBean("myCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());

		context.close();
	}

}
