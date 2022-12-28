package hexlet.code;

public class Utils {
    public static int randomGen(int minRandom, int maxRandom) {
        int randomNum = (int) (Math.random() * (maxRandom - minRandom + 1)) + minRandom;
        return randomNum;
    }
}
