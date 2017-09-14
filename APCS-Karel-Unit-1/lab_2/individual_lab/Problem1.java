package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        rePosition();
        turnLeft();
        turnLeft();
        firstRow();
        
        secondRow();
        rePositionLeft();
        thirdRow();
        
        fourthRow();
    }
    
    public void rePosition() {
        turnLeft();
        move();
        move();
        move();
        move();
        turnRight();
        move();
        move();
        move();
        move();
        turnLeft();       
    }
    public void firstRow() {
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        rePositionRight();
    }
    
    public void secondRow() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        rePositionLeft();
    }    
    
    public void thirdRow() {
        putBeeper();
        move();
        move();
        putBeeper();
        rePositionRight();     
    }
    
    public void fourthRow() {
        putBeeper();       
    }
    
    public void rePositionLeft() {
        turnLeft();
        move();
    }
    
    public void rePositionRight() {
        turnRight();
        move();
        turnRight();
        move();
    }

    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }    
}


