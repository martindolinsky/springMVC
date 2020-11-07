package sk.it.dolinsky.annotations;

import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */
@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getDailyFortune() {
		return "Today is your lucky day";
	}
}
