package Week3;

public class Week3Q2 {
    public static void main(String[] args){
        System.out.println(getArea(3, 3, 3, 7, 5, 5));
        System.out.println(getArea(7, 11, 2, 2, 4, 13));
        System.out.println(getArea(-3, -3, -3, -6, -7, -6));
        
        /*
         * Expected Outputs:
         *  4
         *  18.5
         *  6
         */
    }

    //Create a function that returns the area of the resulting triangle.
    public static double getArea(double x1, double y1, double x2, double y2, double x3, double y3){
        double sideA = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        double sideB = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        double sideC = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        //TODO: Complete the function!
        return 0;
    }
    
}
