package sk.it.dolinsky.ioc;

/**
 * @author Martin Dolinsky
 */
public class MyApp {

	public static void main(String[] args) {
		Coach theCoach = new TrackCoach();

		System.out.println(theCoach.getDailyWorkout());
	}
}
