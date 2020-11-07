package sk.it.dolinsky.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Martin Dolinsky
 */
public class AnnotationDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		Coach theCoach = context.getBean("tennisCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		context.close();
	}
}
