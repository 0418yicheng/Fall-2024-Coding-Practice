package Week3;

public class Week3Q2 {
    public static void main(String[] args) {
        System.out.println(getArea(3, 3, 3, 7, 5, 5));
        System.out.println(getArea(7, 11, 2, 2, 4, 13));
        System.out.println(getArea(-3, -3, -3, -6, -7, -6));

        /*
         * Expected Outputs:
         * 4
         * 18.5
         * 6
         */
    }

    // Create a function that returns the area of the resulting triangle.
    public static double getArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Math.hypot((x2 - x1), (y2 - y1));
        double b = Math.hypot((x3 - x1), (y3 - y1));
        double c = Math.hypot((x3 - x2), (y3 - y2));
        double s = (a + b + c) / 2;
        double answer = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return answer;
    }

}
