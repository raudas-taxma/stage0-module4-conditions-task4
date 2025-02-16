package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int temp = first >= second ? first : second;
        int max = temp >= third ? temp : third;
        System.out.println(max);
    }
}
