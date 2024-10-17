package Week6;

public interface ExampleIO {
    public static void coolFunction() {
        int num1 = 1;
        int num2 = 1;
        for (int i = 0; i < 6; i++) {
            num1 += num2;
        }
        System.out.println(num1);
    }

    public static double getValue(double x) {
        return x * x;
    }

    public default boolean canDrink() {
        return false;
    }
}
