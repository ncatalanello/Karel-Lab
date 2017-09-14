package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
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
                turnLeft();
                if (frontIsClear()) {
                    move();
                    turnLeft();
                    if (frontIsClear()) {
                        turnLeft();
                        move();
                        move();
                        turnLeft();
                    }
                    else{
                        turnLeft();
                        turnLeft();
                        if (frontIsClear()) {
                            turnLeft();
                            turnLeft();
                            turnLeft();
                            move();
                            move();
                            turnLeft();
                        }
                        else {
                            turnLeft();
                            if (frontIsClear()) {
                                move();
                                turnLeft();
                                if (frontIsClear()) {
                                    turnLeft();
                                    move();
                                    move();
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
                                        move();
                                        move();
                                        turnLeft();
                                    }
                                    else {
                                        turnLeft();
                                        if (frontIsClear()) {
                                            turnLeft();
                                            turnLeft();
                                            move();
                                            move();
                                            move();
                                            turnLeft();
                                          
                                        }
                                        else {
                                            putBeeper();
                                            turnLeft();
                                            turnLeft();
                                            move();
                                            putBeeper();
                                            move();
                                            putBeeper();
                                            move();
                                            turnLeft();
                                            
                                        }
                                    }
                                }
                            }
                            else {
                                putBeeper();
                                turnLeft();
                                turnLeft();
                                move();
                                putBeeper();
                                move();
                                turnLeft();
                               
                            }
                        }
                    }
                }
                else {
                    putBeeper();
                    turnLeft();
                    turnLeft();
                    move();
                    turnLeft();
                }
            }
        }
    }
}

