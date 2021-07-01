package oop;

public class ObjectOrientedProgramming {

        public static void main(String[] args) {
            // tell me about a person
            //Person person = new Person("Tiffanny", 32, "short", "mix");

            Person tiffannyPerson = new Person();
            tiffannyPerson.setName("Tiffanny");

            System.out.println(tiffannyPerson.getEntertainment("ride rollercoasters"));
            tiffannyPerson.setName("Tiffanny");
            System.out.println(tiffannyPerson.getEntertainment("tubing the river"));
        }

}
