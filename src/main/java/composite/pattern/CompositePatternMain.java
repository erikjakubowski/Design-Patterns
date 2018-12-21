package composite.pattern;

import java.util.List;

/**
 * Compose objects into tree structures to represent part-whole hierarchies.
 * The composite pattern lets clients treat individual objects and compositions of objects uniformly.
 */


public class CompositePatternMain {
    public static void main(String[] args) {

        Teacher Principal = new Teacher("Dr.Suppa Man", "Principal");
        Teacher headMaths = new Teacher("Mrs. Ally Brah ", "Head-Math");
        Teacher headCompSc = new Teacher("Mr. V.Sarcar", "Head-ComputerSc.");
        Teacher mathTeacherOne = new Teacher("Math Teacher-One", "Math Teacher");
        Teacher mathTeacherTwo = new Teacher("Math Teacher-Two", "Math Teacher");
        Teacher compTeacherOne = new Teacher("CompSci Teacher-One", "CSETeacher");
        Teacher compTeacherTwo = new Teacher("CompSci Teacher-Two", "CSETeacher");
        Teacher compTeacherThree = new Teacher("CompSci Teacher-Three", "CSETeacher");

        Principal.Add(headMaths);
        Principal.Add(headCompSc);
        headMaths.Add(mathTeacherOne);
        headMaths.Add(mathTeacherTwo);
        headCompSc.Add(compTeacherOne);
        headCompSc.Add(compTeacherTwo);
        headCompSc.Add(compTeacherThree);
        mathTeacherOne.Add(null);
        mathTeacherTwo.Add(null);
        compTeacherOne.Add(null);
        compTeacherTwo.Add(null);
        compTeacherThree.Add(null);

        System.out.println("-----COMPOSITE PATTERN DEMO----");
        System.out.println("\nThe college has following structure\n");
        System.out.println(Principal.getDetails());

        List<ITeacher> headsOf = Principal.getControlsDept();
        for (int i = 0; i < headsOf.size(); i++) {
            System.out.println("\t" + headsOf.get(i).getDetails());
        }

        List<ITeacher> mathTeachers = headMaths.getControlsDept();
        for (int i = 0; i < mathTeachers.size(); i++) {
            System.out.println("\t\t" + mathTeachers.get(i).getDetails());
        }

        List<ITeacher> compTeachers = headCompSc.getControlsDept();
        for (int i = 0; i < compTeachers.size(); i++) {
            System.out.println("\t\t" + compTeachers.get(i).getDetails());
        }

        headCompSc.Remove(compTeacherTwo);
        System.out.println("\n After Comp Teacher-Two leaving the organization- Comp department has following employees:");
        compTeachers = headCompSc.getControlsDept();
        for (int i = 0; i < compTeachers.size(); i++) {
            System.out.println("\t\t" + compTeachers.get(i).getDetails());
        }


    }
}
