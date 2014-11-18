/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicproject;
import java.io.IOException;
import static java.lang.Thread.sleep;
import static musicproject.likePython.*;
/**
 *
 * @author Fosterdn98
 */
public class Credits {
    public static void next() throws InterruptedException{
        sleep(1000);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        print("Credits goto:........");
        next();
        print("Maker..........Dustin Newman");
        next();
        print("Graphic design..........Dustin Newman");
        next();
        print("Photo maker..........Dustin Newman (although there are no photos");
        next();
        print("project desinger..........Dustin Newman \n...with special Thanks to Milo glover for the idea to make a program"
                + "\n.....also with special thanks to mrs.perry for the project OK");
        next();
        print("all else goes to..........Dustin Newman");
        next();
        print("This program is written in java....");
        next();
        print("There is no license on this project and is 100% open source");
        next();
        print("..........................................................................................");
        next();
        print("thanks for playing the game");
        MusicProject.main(args);
                
        
    }
    
}
