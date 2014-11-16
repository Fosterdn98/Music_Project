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
import static musicproject.GigPostSelect.bufferRead;
import static musicproject.Vars.*;


/**
 *
 * @author Fosterdn98
 */
public class Blues {
    static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    public static void Clear(){
        for(int x = 0; x!=20; x++){
            System.out.print("\n");
        }}
    public static void rest() throws InterruptedException, IOException{
        Clear();
        if(GigPostSelectString == "Do Some Gigs"){
            Clear();
            print("you have done gigs for about 2 months now in local areas! tonight after you gig "
                    +"you were found by a scouting agent and you now have a appt. to meet with the record company");
            sleep(500);
            Clear();
            print("you goto the record company and they offer you a record deal you accept of course");
            sleep(500);
            Clear();
            print("Time To Get Some Recognition");
            sleep(500);
            Clear();
            print("Your First Decision As A Labeled Band");
            sleep(500);
            Clear();
            print("How Would You Like To Get Your Band Name Out There?");
            print("\nTV Advertisments[1], Posters [2], Tours [3]");
            String read = bufferRead.readLine(); 
            if(read == "1"){
                Clear();
                print("You Chose To Advertise On The TV");
            }
            if(read=="2"){
                Clear();
                print("You Chose To Put Up Posters");
            }
            if(read == "3"){
                Clear();
                print("You Chose To Go On Tour");
            }
            
            
            
            
        }
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        GigPostSelect.main(args);
        rest();
        
    }
    
}
