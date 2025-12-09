package net.saturn.basics;

public class booleanAndLogicalOperators {
    public static void main(String[] args) {
        /* BOOLEAN AND LOGICAL OPERATORS */

        boolean watchedLectures = true;
        boolean askedQuestion = false;
        boolean finishedAssignments = true;
        boolean gaveReview = false;
        boolean pandaHasRizz = true;
        boolean pandaHasAura = true;

        // Logical Operators
        // && (AND) Both booleans got to be true and returns true
        // || (OR) Either one has to be true and returns true
        // ! (NOT)

        boolean finishedCourse = watchedLectures && finishedAssignments;
        boolean isFan = finishedCourse && gaveReview;
        boolean learning = watchedLectures || askedQuestion;
        boolean pandaChart = pandaHasRizz && pandaHasAura;
        boolean pandaChart1 = pandaHasRizz || pandaHasAura;
        boolean pandaChart2 = pandaHasRizz && !pandaHasAura;
        boolean pandaChart3 = pandaHasRizz || !pandaHasAura;

        System.out.println(finishedCourse);
        System.out.println("Panda has Rizz and Aura: " + pandaChart);
        System.out.println("Panda has Rizz or Aura: " + pandaChart1);
        System.out.println(pandaChart2);
        System.out.println(pandaChart3);
        System.out.println(learning);
        System.out.println(isFan);



    }
}
