package edu.ctco.school.exercise1;

/**
 * Can you find out the error in the below code?
 *
 * How to fix it? What are the options?
 */
public class Exercise1
{
    //outer classes can only be declared public or package private

 class SubExercise1
    {
        //Inner class. The main feature of an inner class is its capability to access even private members of the outer class.
    }
}


//i.e The main feature of an inner class is its capability to access even private members of the outer class.
/* class Exercise1 {
    private String pString = "I'm private";

    class SubExercise1 {
        void printPrivate() {
            System.out.println(pString);
        }
    }

        public static void main(String[] args) {
            Exercise1.SubExercise1 egy = new Exercise1().new SubExercise1();
            egy.printPrivate();
        }
    } */