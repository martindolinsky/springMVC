package sk.it.dolinsky.annotations;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Martin Dolinsky
 */
@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
			"First",
			"Second",
			"Third"
	};

	private Random myRandom = new Random();

	@Override
	public String getDailyFortune() {
		int index = myRandom.nextInt(data.length);
		return data[index];
	}
}
