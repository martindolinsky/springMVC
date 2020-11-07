package sk.it.dolinsky.annotations;

import org.springframework.stereotype.Component;

/**
 * @author Martin Dolinsky
 */
@Component
public class DatabaseFortuneService implements FortuneService {


	@Override
	public String getDailyFortune() {
		return null;
	}
}
