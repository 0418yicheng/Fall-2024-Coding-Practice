package Week5;

public class Week5Q1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Black");
        Cat cat = new Cat(23, "Black");
        Cow cow = new Cow("Bessie",  10, "White & Black");

        dog.makeNoise();
        cat.makeNoise();
        cow.makeNoise();

        //Print out the Color of each animal
        System.out.println("\nColors: ");
        //TODO: PUT YOUR PRINT STATEMENTS HERE!

        /*
         * Expected outputs:
         *      Woof
         *      Meow
         *      Moo
         * 
         *      Colors:
         *      Black
         *      Black
         *      White & Black
         */
    }
    
    public static class Animal{
        private String species;
        private String color;
        
        public Animal(String species, String color){
            this.species = species;
            this.color = color;
        }
        public Animal(){

        }
        
        public void makeNoise(){
            System.out.println("Noise");
        }

        public String getSpecies(){
            return species;
        }
        public String getColor(){
            return color;
        }
    }

    //TODO: Complete these classes to make this program work
    public static class Dog{

    }

    public static class Cat{

    }

    public static class Cow{

    }
}

