/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicproject;

import static java.lang.Thread.sleep;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static main.likePython.*;
import static musicproject.Blues.Reset;
import static musicproject.Blues.bufferRead;
import static musicproject.GigPostSelect.bufferRead;
import static musicproject.Vars.CharS;
import static musicproject.Vars.GigPostSelectString;
/**
 *
 * @author Fosterdn98
 */
public class Rock {
    static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    private static String[] args;
     public static void Clear(){
        for(int x = 0; x!=20; x++){
            System.out.print("\n");
        }}
    
    public static void Reset() throws InterruptedException{
        sleep(1500);
        Clear();
    }
    public static void Rock_rest() throws InterruptedException, IOException{
        Reset();
        print("You " + CharS + "  are influenced by the beach boys along with many other bands. rock has a up beat mood to it ");
        Reset();
        if(GigPostSelectString.equals("Put Up Some Posters")){
            Reset();
            print("you have put up a lot of posters and have got a lot of free music downloads  this seems to be working well");
            Reset();
            print("now that you have some recognintion what would you like to  do now");
            Reset();
            GigPostSelect.main(args);
        }
        if(GigPostSelectString.equals("Do Some Gigs")){
            Reset();
            print("you have done gigs for about 2 months now in local areas! tonight after you gig you were found by a scouting agent and you now have a appt."
                    + "to meet with the record company");
            Reset();
            print("you goto the record company and they offer you a record deal you accept of course");
            Reset();
            print("time to get some world recongnition");
            print("TV advertisment [1] Or Put up posters [2] Or Go on tour");
            String read = bufferRead.readLine(); 
            switch(read){
                
            }
        
        }
    }
        
        
    
    
    public static void main(String[] args) throws IOException, InterruptedException {
        GigPostSelect.main(args);
        
    }
    
}
