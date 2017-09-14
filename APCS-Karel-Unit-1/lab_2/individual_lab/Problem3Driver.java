package lab_2.individual_lab;


/**
 * Write a description of class Problem3Driver here.
 *
 * @author (nick)
 * @version (problem3)
 */
import kareltherobot.*;
import java.awt.Color;
public class Problem3Driver implements Directions
{
    public static void main (String args[]) {
        Problem3 karel = new Problem3(7, 2, East,-1);
        Problem3 Carl = new Problem3(6, 2, East, -1);
        Problem3 Karen = new Problem3(5, 2, East, -1);
        Problem3 Kristy = new Problem3(4, 2, East, -1);
        Problem3 Kerry = new Problem3(3, 2, East, -1);
        karel.setPins3();
    }
    
    static{ 
        World.reset(); 
        World.readWorld("worlds/world1.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
        
    }   
}

