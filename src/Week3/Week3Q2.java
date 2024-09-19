package Week3;

public class Week3Q2 {
    public static void main(String[] args){
        System.out.println(round(getArea(3, 3, 3, 7, 5, 5)));
        System.out.println(round(getArea(7, 11, 2, 2, 4, 13)));
        System.out.println(round(getArea(-3, -3, -3, -6, -7, -6)));
        

        /*
         * Expected Outputs:
         *  4
         *  18.5
         *  6
         */
    }

    //Create a function that returns the area of the resulting triangle.
    public static double getArea(double x1, double y1, double x2, double y2, double x3, double y3){
        //TODO: Complete the function!
        //A = sqrt(S(S-A)(S-B)(S-C))

        double a = Math.hypot((x2-x1), (y2-y1));
        double b = Math.hypot((x3-x2), (y3-y2));
        double c = Math.hypot((x3-x1), (y3-y1));

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        return area;
    }

    // Sasha's Rounding Complaint
    public static double round(double i){
        //39.9
        i *= 100;
        int n = (int) i;

        i = (double)n / 10;

        i += 0.5;
        i = (int) i;

        return i/10;
    }
    
}
