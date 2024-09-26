package Week4;

public class Week4Q2 {
    public static void main(String[] args){
        /*
         *  DO NOT start here
         *  Create an instance of a red toyota with 69 miles.
         *  Drive it.
         */
        Color color = new Color(255, 0, 0);
        Car toyota = new Car(color, "toyota", 69);

        toyota.drive();
    }

    /*
     * START HERE:
     * Create a class Car. It should have:
     *      1) Fields to store the car's brand, color, and mileage
     *      2) A constructor that sets all the values to user-inputted ones
     *      3) Make a function drive that prints a sound and increases the mileage
     */

     public static class Car{
        public String brand;
        public double mileage;
        public Color color;
    
        public Car(Color color, String brand, double mileage){
            this.brand = brand;
            this.mileage = mileage;
            this.color = color;
        }
    
        public void drive(){
            System.out.println("Vrooom");
            mileage += mileage + 0.5;
        }
     }

     public static class Color{
        public int red;
        public int blue;
        public int green;

        public Color(int red, int blue, int green){
            this.red = Math.clamp(red, 0 , 255);
            this.blue = Math.clamp(blue, 0, 255);
            this.green = Math.clamp(green, 0, 255);
        }

        public int[] getRGB(){
            int[] rgb = {red, blue, green};
            return rgb;
        }
     }
}
