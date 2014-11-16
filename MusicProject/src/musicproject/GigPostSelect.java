/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        print("You " + CharS + "have been influnced by one of the most iconic blues artists Ray Charles."
        + " blues has a huge influenced on mainstream American pop music.\n\n\n\n\n\n\n\n\n\n\n");
        
       print("Would you like to Do Some gigs [1], Put up some posters [2], Or would you like to do both [3]");
       String read = bufferRead.readLine(); 
       if(read == "1"){
           GigPostSelectString ="Do Some Gigs";
       }
       if(read == "2"){
           GigPostSelectString ="Put Up Some Posters";
       }
       if(read == "3"){
           GigPostSelectString ="Put Up Some Posters And Do Some Gigs";
       }
       print("So you are going to: " + GigPostSelectString);
       if(read == "1"){
           //Gigs_Blues.Main(String[] args);
       }
       if(read == "2"){
           //Posters_Blues.Main(String[] args);
       }
       if(read == "3"){
           //Both_blues.Main(String[] args);
       }
       Blues.rest();
       
    }
    
}
