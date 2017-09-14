package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins2(){
        turnLeft();
        move();
        turnRight();
        move();
        secondRow();
        rePositionLeft();
        thirdRow();
        
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
}

