package oop;

public class Person {

    // Field
    // private means only members of this class can access these
    private String name;
    private int age;
    private String height;
    private String nationality;


    // Constructor - special method on the class , instructions you give java on how to make it
    public Person(String name, int age, String height, String nationality){
        // take 4 values and inject them into fields
        this.name = name;
        this.age = age;
        this.height = height;
        this.nationality = nationality;


    }
    public Person(){

    }
    // Properties - methods on the classes, that help you execute the behavior of the object.
    // command n - get menu - make getters and setters- enter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEntertainment(String entertainment){
        return this.name + " is going to go " + entertainment;
        // Tiffanny is going to go ride a rollercoaster
    }

    // three fall in the catagory of Class Members
}
