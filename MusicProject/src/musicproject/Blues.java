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
    
    public static void Reset() throws InterruptedException{
        sleep(800);
        Clear();
    }
    public static void rest() throws InterruptedException, IOException{
        Clear();
        if(GigPostSelectString == "Do Some Gigs"){
            Clear();
            print("you have done gigs for about 2 months now in local areas! tonight after you gig "
                    +"you were found by a scouting agent and you now have a appt. to meet with the record company");
            Reset();
            print("you goto the record company and they offer you a record deal you accept of course");
            
            print("Time To Get Some Recognition");
            Reset();
            print("Your First Decision As A Labeled Band");
            Reset();
            print("How Would You Like To Get Your Band Name Out There?");
            print("\nTV Advertisments[1], Posters [2], Tours [3]");
            String read = bufferRead.readLine(); 
            if(read.equals("1")){
                Clear();
                print("You Chose To Advertise On The TV");
                Reset();
                print("After about a week TV advertising you are starting to get a lot of first album sales");
                Reset();
                print("It is time to make a new desicion!");
                Reset();
                print("Would you like to Make Another Album [1], Go On Tour [2], Do Both [3]");
                read = bufferRead.readLine();
                switch(read){
                    case "1":
                        print("So you want to make another album");
                        Reset();
                        print("You Made a nother album");
                        
                        break;
                    case "2":
                        print("So you want to go on tour");
                        Reset();
                        print("So you are wanting to go on your first tour!");
                        break;
                    case "3":
                        print("so you want to go on tour and make another album");
                        //rest of code here
                        break;
                }
                
                    
            }
           if(read.equals("2")){
               Reset();
               print("you want to put up posters");
           }
           if(read.equals("3")){
             Reset();
             print("you want to put up posters and go on tour");
           }
    
        }
    }
    
    public static void main(String[] args) throws IOException, InterruptedException {
        GigPostSelect.main(args);
        rest();
        
    }
    
}
