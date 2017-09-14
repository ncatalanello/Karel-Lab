package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        turnLeft();
        move();
        test();
        move();
        turnLeft();
        move();
        test();
        move();
        turnLeft();
        move();
        test();
        move();
        turnLeft();
        move();
        test();
        move();
        turnLeft();
        move();
        test();
        move();
        turnLeft();
        move();
        test();
        move();
        turnLeft();
        move();
        test();
        move();
        turnLeft();
        move();
        test();
        move();
        turnLeft();
        move();
        test();
        move();
        turnLeft();
        move();
        test();
        
        
    }
    
    public void test() {
        if (frontIsClear()) {
            turnLeft();
            turnLeft();
            move();
            turnLeft();
        }
        else {
            turnLeft();
            if (frontIsClear()) {
                turnLeft();
                move();
                turnLeft(); 
            }
            else {
                turnLeft();
                turnLeft();
                if (frontIsClear()) {
                    turnLeft();
                    turnLeft();
                    turnLeft();
                    move();
                    turnLeft(); 
                }
                else {
                    putBeeper();
                    turnLeft();
                    turnLeft();
                    turnLeft();
                    move();
                    turnLeft();
                }
            }
        }
    }
}



    
