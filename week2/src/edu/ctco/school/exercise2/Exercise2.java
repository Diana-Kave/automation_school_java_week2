package edu.ctco.school.exercise2;

/**
 * Does field 'i' of Class Exercise2 be inherited to Class SubExercise2 in the below code?
 *
 * What are the options in this particular case?
 */
class Exercise2 {
    private int i;
}

class SubExercise2 extends Exercise2 {
}


/*
No. Members of a class that are declared private are not inherited by subclasses of that class.
Only members of a class that are declared protected or public are inherited by subclasses declared in a package other
than the one in which the class is declared.



For example:

class Exercise2 {
    public int i;
}

class SubExercise2 extends Exercise2 {
}


Or

public class Exercise2 {
   int i;
}

class SubExercise2 extends Exercise2 {
}

*/