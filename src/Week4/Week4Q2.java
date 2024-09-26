package Week4;

public class Week4Q2 {
    public static void main(String[] args){
        /*
         *  DO NOT start here
         *  Create an instance of a red toyota with 69 miles.
         *  Drive it.
         */
        Car toyota = new Car("Toyota", "Red", 69);
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
        String brand;
        String color;
        int mileage;

        public Car(String brand, String color, int mileage){
            this.brand = brand;
            this.color = color;
            this.mileage = mileage;
        }

        public void drive(){
            System.out.println("VROOOM!!");
            mileage += 1000;
        }
    }
}
