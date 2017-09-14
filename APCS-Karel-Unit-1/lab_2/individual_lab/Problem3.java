package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins3(){
        moveKarel();
        moveCarl();
        moveKaren();
        moveKristy();
        moveKerry();
    }
    public void moveKarel(){
        putBeeper();
        move();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        move();
        move();
        putBeeper();
    }  
    public void moveCarl(){
        putBeeper();
        move();
    } 
    public void moveKaren(){
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }  
    public void moveKristy(){
        putBeeper();
        move();
    } 
    public void moveKerry(){
        putBeeper();
        move();
    }   
}

