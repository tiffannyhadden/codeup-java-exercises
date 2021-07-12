package grades;

import util.Input;

import java.util.HashMap;

import java.util.Scanner;


public class GradesApplication {

    public static void main(String[] args) {
        Input input = new Input();

        Student tiff = new Student("tiff");
        tiff.addGrade(78);
        tiff.addGrade(45);
        tiff.addGrade(89);
        tiff.addGrade(90);

        Student corey = new Student("corey");
        corey.addGrade(88);
        corey.addGrade(39);
        corey.addGrade(99);
        corey.addGrade(70);

        Student mitch = new Student("mitch");
        mitch.addGrade(98);
        mitch.addGrade(99);
        mitch.addGrade(100);
        mitch.addGrade(96);

        Student amado = new Student("amado");
        amado.addGrade(95);
        amado.addGrade(97);
        amado.addGrade(101);
        amado.addGrade(97);

        HashMap<String, Student> students = new HashMap<String, Student>();

        students.put("tiffy@github.com", tiff);
        students.put("corcor@github.com", corey);
        students.put("mitchy@github.com", mitch);
        students.put("mado@github.com", amado);
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");


        // this code printing out the usernames
        for (String student : students.keySet()) {
            System.out.print(" | " + student + " | ");
        }

        // next step ask user for which of the username githubs would you like to know more about.
        // use scanner to get that info
        System.out.println("\n What student would you like to see more information on?");
        String userInput = input.getString();
        Student student = students.get(userInput); // instantiate
        // make if statement if userInput = an existing username then ...

        // if the userInput doesn't match a username, then say "hey this username doesn't exist" ,
        // but if the username DOES exist, then give more info (grade and name ) of that student
        // how do you compare the keys in the map to the userinput.
        if (student == null){
            System.out.printf("\nSorry no student found with that username of " + userInput + ".\n" );
//            System.out.println(userInput);
        } else {
            System.out.printf("\nName: %s - GitHub Username: %s \n", student.getName(), userInput);
            System.out.printf("\nCurrent Average: %.1f\n", student.getGradeAverage()); // get object and then get method in the student class


        }






    }
}
