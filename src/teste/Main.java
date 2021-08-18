package teste;

public class Main {
    public static void main(String[] args) {
            boolean test1 = areEqualByThreeDecimalPlaces(1.123, 1.1234);
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        double aBy1000 = a * 1000;
        double bBy1000 = b * 1000;

        if((int)aBy1000 == (int)bBy1000) {
            return true;
        } else {
            return false;
        }
    }
}
