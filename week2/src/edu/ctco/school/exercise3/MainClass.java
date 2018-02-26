package edu.ctco.school.exercise3;

/**
 * How to correct the code, so we are able to instantiate SubExercise3 ?
 */
/*public class MainClass
{
    public static void main(String[] args)
    {
        SubExercise3 subExercise3 = new SubExercise3();
    }
}
*/

public class MainClass
{
    public static void main(String[] args)
    {
        Exercise3.SubExercise3 in = new Exercise3().new SubExercise3();
        in.add();
    }
}