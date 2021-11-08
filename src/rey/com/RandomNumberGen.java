package rey.com;

import java.util.Random;

public class RandomNumberGen {
    public static int getRandomNumber(){
        return new Random().nextInt();
    }

    public int getRandomNumber(int Limit){
        return new Random().nextInt(Limit);
    }
}
