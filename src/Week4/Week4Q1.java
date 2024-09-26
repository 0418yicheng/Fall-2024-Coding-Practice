package Week4;

public class Week4Q1 {
    public static void main(String[] args){
        /*
         * Create an instance of the Student class with the following parameters
         *      1) Name is Silly Ben
         *      2) Age is 22
         *      3) Gpa is -0.2
         */
        Student ben = new Student("Silly Ben", 22, -0.2);
         // Now, print out Silly Ben's name, age, and gpa. They should be the values indicated above
        System.out.println(ben.name);
        System.out.println(ben.age);
        System.out.println(ben.gpa);
         //Make Silly Ben take a test.
        ben.takeTest();
    }

    //Fix any errors that appear.
    public static class Student{
        String name;
        int age;
        double gpa;

        public Student(String name, int age, double gag){
            this.name = name;
            this.age = age; //<-- Add this. to the beginning
            this.gpa = gag; //<-- Either change this to gag or change the parameter name to gpa
        }
        
        public void takeTest(){
            System.out.println("Awwww, you failed.");
            gpa -= 10000;
            System.out.println(name + "'s gpa is now: " + gpa);
        }
    }
}
