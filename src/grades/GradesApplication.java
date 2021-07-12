package grades;

import java.util.HashMap;


public class GradesApplication {

    public static void main(String[] args) {

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
        corey.addGrade(98);
        corey.addGrade(99);
        corey.addGrade(100);
        corey.addGrade(96);

        Student amado = new Student("amado");
        corey.addGrade(95);
        corey.addGrade(97);
        corey.addGrade(101);
        corey.addGrade(97);

        HashMap<String, Student> students = new HashMap<String, Student>();

        students.put("tiffy@github.com", tiff);
        students.put("corcor@github.com", corey);
        students.put("mitchy@github.com", mitch);
        students.put("mado@github.com", amado);


        for (String student: students.keySet())
        System.out.println(student);

    }
}
