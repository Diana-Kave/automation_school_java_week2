package edu.ctco.school.exercise6.pack2;

import edu.ctco.school.exercise6.pack1.A;

/**
 * Why we can't instantiate class A, even it has public constructor ?
 *
 * Because it's private
 *
 * How to fix it ?
 *
 * set class A public
 */
class B
{
    A a = new A();       //Compile Time Error
}
