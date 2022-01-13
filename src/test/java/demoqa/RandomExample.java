package demoqa;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomExample {

    public static String getRandomPhone(int length) {
        String SALTCHARS = "1234567890";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < length) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            result.append(SALTCHARS.charAt(index));
        }
        return result.toString();
    }
}

