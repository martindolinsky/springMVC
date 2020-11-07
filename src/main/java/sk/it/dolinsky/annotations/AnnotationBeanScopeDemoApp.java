package sk.it.dolinsky.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Martin Dolinsky
 */
public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

		Coach theCoach = context.getBean("tennisCoach", Coach.class);


		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);

		System.out.println("Same object " + result);
		System.out.println("Memory location theCoach " + theCoach);
		System.out.println("Memory location alphaCoach " + alphaCoach);

		context.close();
	}
}
