public class OverloadTest {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));//3
        System.out.println(add(1.0, 2.0));//3.0
    }
}