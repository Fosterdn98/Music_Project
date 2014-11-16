/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Thread.sleep;
import static main.likePython.*;
import static musicproject.MusicProject.bufferRead;
import static musicproject.Vars.*;
/**
 *
 * @author Dustin
 */
public class GigPostSelect {
    static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException, InterruptedException {
        print("You " + CharS + " have been influnced by one of the most iconic blues artists Ray Charles."
        + " blues has a huge influenced on mainstream American pop music.\n\n");
        
       print("Would you like to Do Some gigs [1], Put up some posters [2], Or would you like to do both [3]");
       String read = bufferRead.readLine(); 
       if(read.equals("1")){
           GigPostSelectString ="Do Some Gigs";
       }
       if(read.equals("2")){
           GigPostSelectString ="Put Up Some Posters";
       }
       if(read.equals("3")){
           GigPostSelectString ="Put Up Some Posters And Do Some Gigs";
       }
       sleep(500);
       print("So you are going to: " + GigPostSelectString);
       GigPostSelectDone = true;
       if(read.equals("1")){
           Blues.rest();
       }
       if(read.equals("2")){
           //Posters_Blues.Main(String[] args);
       }
       if(read.equals("3")){
           //Both_blues.Main(String[] args);
       }
       
       
    }
    
}
