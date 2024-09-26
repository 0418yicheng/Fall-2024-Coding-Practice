package Week4;

public class Week4Q2 {
    public static void main(String[] args) {
        Color c = new Color(255, 0, 0);
        Car ca = new Car("Mustang", c, 0);
        ca.Drive("BOOM", ca.mileage, 9999999);
    }

    /*
     * START HERE:
     * Create a class Car. It should have:
     * 1) Fields to store the car's brand, color, and mileage
     * 2) A constructor that sets all the values to user-inputted ones
     * 3) Make a function drive that prints a sound and increases the mileage
     */
    public static class Color {
        int red;
        int green;
        int blue;

        public Color(int red, int green, int blue) {
            this.red = red;
            this.blue = blue;
            this.green = green;
        }
    }

    public static class Car {
        String brand;
        Color color;
        int mileage;

        public Car(String brand, Color color, int mileage) {
            this.brand = brand;
            this.color = color;
            this.mileage = mileage;

        }

        public void Drive(String sound, int mileage, int mileageIncrease) {
            mileage += mileageIncrease;
            System.out.println(sound);
        }
    }
}
