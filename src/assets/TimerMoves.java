package assets;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TimerMoves {

	TimerMoves() {

	}

	public static long  Time() {
		long time = System.currentTimeMillis();
		return time;

	}

	public static String computeTimer(long millis,long millis2) {
		millis = millis2 - millis;
		return String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(millis),
				TimeUnit.MILLISECONDS.toSeconds(millis)
						- TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
	}

}
