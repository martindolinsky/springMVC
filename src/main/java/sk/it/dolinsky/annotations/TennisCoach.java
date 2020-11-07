package sk.it.dolinsky.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Martin Dolinsky
 */
@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> Tennis coach inside default constructor");
	}

	//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}


//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> Tennis coach inside method setFortuneService()");
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">> Tennis coach inside method doSomeCrazyStuff()");
//		this.fortuneService = fortuneService;
//	}


	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside method doMyStartupStuff");
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside method doMyCleanupStuff");
	}


	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
}
