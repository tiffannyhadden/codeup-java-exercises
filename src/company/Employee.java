package company;


    //1. create and abstract class using the abstract keyword
// abstract classes cannot be instantiated
// instantiation- to create and instance (an object) of that class
//create a subclass from the abstract and then instantiate the subclass
    abstract class Employee {
        //define properties
    private String salary;
    private String name;

    //if you don't define method in abstract class, you must mark it
        //abstract

        public String doWork(){
            return "I am working";

        };

    }

