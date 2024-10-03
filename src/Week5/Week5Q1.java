package Week5;

public class Week5Q1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Black");
        Cat cat = new Cat("Cat", "Black");
        Cow cow = new Cow("Bessie", "Cow", "White & Black");

        dog.makeNoise();
        cat.makeNoise();
        cow.makeNoise();

        // Print out the Color of each animal
        System.out.println("\nColors: " + (dog.color) + ", " + (cat.color) + ", and " + (cow.color));
        // TODO: PUT YOUR PRINT STATEMENTS HERE!

        /*
         * Expected outputs:
         * Woof
         * Meow
         * Moo
         * 
         * Colors:
         * Black
         * Black
         * White & Black
         */
    }

    public static class Animal {
        public String species;
        public String color;
        public String name;

        public Animal(String name, String species, String color) {
            this.name = name;
            this.species = species;
            this.color = color;
        }

        public Animal() {

        }

        public void makeNoise() {
            System.out.println("Noise");
        }

        public String getSpecies() {
            return species;
        }

        public String getColor() {
            return color;
        }
    }

    // TODO: Complete these classes to make this program work
    public static class Dog extends Animal {
        public Dog(String color) {
            this.color = color;
        }

        public void makeNoise() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal {
        public Cat(String species, String color) {
            this.species = species;
            this.color = color;
        }

        public void makeNoise() {
            System.out.println("Meow");
        }
    }

    public static class Cow extends Animal {
        public Cow(String name, String species, String color) {
            this.color = color;
            this.species = species;
            this.name = name;
        }

        public void makeNoise() {
            System.out.println("Moo");
        }

    }
}
