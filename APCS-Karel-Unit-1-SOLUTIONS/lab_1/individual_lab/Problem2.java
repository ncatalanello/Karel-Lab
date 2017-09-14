package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  N. Catalanello
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnLeft();
        move();
        rightloop();
        rightloop();
        leftloop();
        leftloop();
        leftloop();
        leftloop();
        rightloop();
        turnRight();
        move();
        turnRight();      
    }
    
    public void rightloop() {
        turnRight();
        moveTwo();
    }
    
    public void leftloop() {
        turnLeft();
        moveTwo();
    }
    
    public void moveTwo() {
        move();
        move();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}