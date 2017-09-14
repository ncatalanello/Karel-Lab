package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();//Complete this method, using the methods you create below so that all rows are harvested
    }
    /**
    * Precondition: Robot is facing east, one block away from a beeper
    * Precondition: Robot is facing east, two streets above where it started 
    */
    public void harvestTwoRows() {
      harvestOneRow();
      turnLeft();
      harvestOneRow();
      reAdjust();
    
    }
    
    public void harvestOneRow() {
        move();
        move();
        move();
        move();
     }
    
    public void reAdjust() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
}


