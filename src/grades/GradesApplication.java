package grades;

import java.util.HashMap;


public class GradesApplication {

    public static void main(String[] args) {

        Student tiff = new Student("tiff");
        tiff.addGrade(78);
        tiff.addGrade(45);
        tiff.addGrade(89);
        tiff.addGrade(90);

        HashMap<String, Student> students = new HashMap<String, Student>();

        students.put("tiffy@github.com", tiff);

        for (String student: students.keySet())
        System.out.println(student);

    }
}
