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
import static musicproject.likePython.*;
import static musicproject.Vars.*;
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
        if(GigPostSelectString.equals("Do Some Gigs")){
            if(ret == false){
            Clear();
            print("you have done gigs for about 2 months now in local areas! tonight after you gig "
                    +"you were found by a scouting agent and you now have a appt. to meet with the record company");
            Reset();
            print("you goto the record company and they offer you a record deal you accept of course");
            
            print("Time To Get Some Recognition");
            Reset();
            print("Your First Decision As A Labeled Band");
            Reset();}
            ret=false;
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
                        ret = true;
                        break;
                        
                    case "2":
                        
                        print("So you want to go on tour");
                        Reset();
                        print("So you are wanting to go on your first tour!");
                        Reset();
                        print("as you are going on tour you have some problems your band is fighting on how you are going"
                                + "to do things and you are haveing some money problems");
                        Reset();
                        print("Turn to drugs [1] Or push through it [2]");
                        read = bufferRead.readLine();
                        switch(read){
                            case "1":
                                Reset();
                                print("The recored label found out that you were takeing drugs and they revoked your recored deal");
                                Reset();
                                print("Game Over");
                                sleep(3000);
                                print("THE GAME WILL NOW RESTART!!");
                                sleep(2500);
                                Reset();
                                MusicProject.main(args);
                                break;
                            case "2":
                                Reset();
                                print("Your are fighting through it and you end up just fine in the end"
                                + " Your Band ends up being better then ever to which is a bonus");
                                Reset();
                                print("now that the tour is done you and your band have a lot of recongnition");
                                Reset();
                                print("YOU WIN THE GAME");
                                Reset();
                                System.exit(0);
                                break;
                                
                        }
                        break;
                    case "3":
                        Reset();
                        print("so you want to go on tour and make another album");
                        Reset();
                        print("So now you have released a new album and about a month from now you are going to go on tour");
                        Reset();
                        print("you go on tour as you are on tour you and  your band start to fight and things are looking really bad at this point you are all not sure if things are going to last. "
                                + "you have droped everything into this band and if you loss the band you loss everything");
                        Reset();
                        print("Turn to drugs [1] Or push through it [2]");
                        read = bufferRead.readLine();
                        switch(read){
                            case "1":
                                Reset();
                                print("The recored label found out that you were takeing drugs and they revoked your recored deal");
                                Reset();
                                print("Game Over");
                                sleep(3000);
                                print("THE GAME WILL NOW RESTART!!");
                                sleep(2500);
                                Reset();
                                MusicProject.main(args);
                                break;
                            case "2":
                                Reset();
                                print("you call a band meeting you all talk about it and after some fighting and complaning you all come to "
                                        +"a reasanable conclusion your band is still together and you are doing better then when you started");
                                Reset();
                                print("Your band goes on tour!!");
                                Reset();
                                print("your band has a great time you continue to do what you have been doing");
                                Reset();
                                print("you win the game \n YOU WON");
                                sleep(3000);
                                System.exit(0);
                                break;
                                      
                                
                        }
                        break;
                }
                if(ret){
                    Blues.Blues_Rest();
                }
                
                    
            }
           if(read.equals("2")){
               Reset();
               print("you put posters up letting people know that you have a album out");
               Reset();
               print("now that you have put posters out what are you going to do");
               return;
           }
           if(read.equals("3")){
             Reset();
             print(" your band goes on tour");
             Reset();
             print("your tour was not as successful as it could have been you only had one album and you didnt advertise so not many people knew becuse of this your band starts to get into "
                     + "a fight about what they did wrong it is not looking to well right " +
                     "now and you get really stressed out and worried");
             sleep(1500);
             Reset();
             print("you turn to drugs");
             Reset();
             print("You Spend a lot of money on your new habbit");
             Reset();
             print("You can continue doing this new habit [1] Or you can fight through it and stop this habbit");
             read = bufferRead.readLine();
             switch(read){
                 case "1":
                    Reset();
                    print("you continue to do anything to support your new habit and you loss everything" +
                             "The recored label gets droped and you can no longer support your self or your band");
                    Reset();
                    print("Game Over");
                    sleep(3000);
                    print("THE GAME WILL NOW RESTART!!");
                    sleep(2500);
                    Reset();
                    MusicProject.main(args);
                    break;
                 case "2":
                     Reset();
                     print("You decied that it this new habit is really bad for you and you change your ways");
                     Reset();
                     print("you quit this habit and you and your band become one again");
                     Reset();
                     print("you and your band make a new album");
                     Reset();
                     print("it is now time to decide what you and your band do next");
                     Reset();
                     print("would you and your band like to go on tour [1] or advertise [2]");
                     read = bufferRead.readLine();
                     switch(read){
                         case "1":
                             Reset();
                             print("you go on tour it is a little bit better then it was befor but you made the same mastakes " +
                                     "you did last time you didnt advertise and you and your band is suffering because of it");
                             Reset();
                             print("you advertise this time and then go on tour again this time it is a great success you and your band has learned its lesson ");
                             Reset();
                             print("you and your band do great");
                             Reset();
                             print("you win the game \n YOU WON");
                            sleep(3000);
                            System.exit(0);
                            break;
                         case "2":
                             Reset();
                             print("you adveertise on tv and with posters");
                             Reset();
                             print("Now Wha would you like to do?");
                             Reset();
                             print("Go On Tour [1] Or Do Some More Advertising [2]");
                             read = bufferRead.readLine();
                             switch(read){
                                 case "1":
                                     Reset();
                                     print("after some advertising you go on tour this is a great success");
                                     Reset();
                                     print("your band is happy they make some more albums do some more tours all is well");
                                     Reset();
                                     print("you win the game \n YOU WON");
                                    sleep(3000);
                                    System.exit(0);
                                    break;
                                 case "2":
                                     Reset();
                                     print("you advertise some more now you go on tour");
                                     Reset();
                                     print("this tour was awesome now you have some other bands wanting to sing with you");
                                     Reset();
                                     print("you win the game \n YOU WON");
                                    sleep(3000);
                                    System.exit(0);
                                    break;
                                     
                             }break;
                             
                                     
                     }
                             
                     
                     
             }
             
           }
    
        }
        if(GigPostSelectString.equals("Put Up Some Posters")){
            Reset();
            print("you have put up a lot of posters and have got a lot of free music downloads  this seems to be working well");
            Reset();
            print("now that you have some recognintion what would you like to  do now");
            Reset();
            GigPostSelect.main(args);
            
        }
        if(GigPostSelectString.equals("Put Up Some Posters And Do Some Gigs")){
            Reset();
            if(!ret){
            print("you have put up a lot of posters and have got a lot of free music downloads this seems to have gotten you a lot of recognition it is now the date that all "
                    + "\nthe posters were for YOUR FIRST GIG! after your first gig a record company scouting agent was there and he "
                    + "\nwould like you to come and visit his office he has heard you music online and in person and his company is interested in a record deal");
            sleep(1000);
            Reset();
            print("you goto the record company and they offer you a record deal you accept of course");
            Reset();
            print("time to get more world wide recognition\n");
        }
            ret=false;
            print("So would you like to advertise on the TV [1] Or Put up posters [2] Or Do tours [3]");
            String read = bufferRead.readLine();
            switch(read){
                case "1":
                    Reset();
                    print("you are going to advertise on the TV");
                    Reset();
                    print("after about 1 week of tv advertisments you have been getting a lot of first album sales");
                    Reset();
                    print("now you need to make another decision");
                    print("\nMake another album [1] Or Go on tour [2] Or Do both [3]");
                    read = bufferRead.readLine();
                    switch(read){
                        case "1":
                            Reset();
                            print("So you want to make another album");
                            Reset();
                            print("You Made a nother album");
                            ret = true;
                            break;
                        case "2": 
                            Reset();
                            print("You Chose to go on tour");
                            Reset();
                            print("you are now going on your first tour as a band");
                            Reset();
                            print("as you are going on tour you have some " +
                                    "\nproblems your band is fighting on how you are going to do things and you are haveing some money problems");
                            print("Turn to drugs [1] Or Push through it [2]");
                            read = bufferRead.readLine();
                            switch(read){
                                case "1":
                                    Reset();
                                    print("you Are into a bad habit and the recored compeny findes out");
                                    Reset();
                                    print("You Lose");
                                    print("Game Over");
                                    sleep(3000);
                                    print("THE GAME WILL NOW RESTART!!");
                                    sleep(2500);
                                    Reset();
                                    MusicProject.main(args);
                                    break;
                                case "2":
                                    Reset();
                                    print("you are going to push throuh it that is a good choice!");
                                    Reset();
                                    print("you end up fighting through it and your band is now better then ever and ready for your first concert on tour");
                                    Reset();
                                    print("after this tour is over your band has a lot of recognition");
                                    Reset();
                                    print("YOU WIN!");
                                    Reset();
                                    System.exit(0);
                                    break;   
                                    }
                            
                            break;
                        case "3":
                            Reset();
                                    print("you have realsesed your album and about a month latter it is time for that tour");
                                    Reset();
                                    print("you go on tour as you are on tour you and  your band start to fight and things are looking really bad at this point you are all not sure if things are going to last. " + 
                                            "\nyou have droped everything into this band and if you loss the band you loss everything ");
                                    sleep(1000);
                                    Reset();
                                    print("Turn to drugs [1] Or Fight through it [2]");
                                    read = bufferRead.readLine();
                                    switch(read){
                                        case "1":
                                            Reset();
                                            print("You turn to drugs");
                                            Reset();
                                            print("the recored compeny finds out and they drop your band");
                                            print("Game Over");
                                            sleep(3000);
                                            print("THE GAME WILL NOW RESTART!!");
                                            sleep(2500);
                                            Reset();
                                            MusicProject.main(args);
                                            break;
                                        case "2":
                                            Reset();
                                            print("you call a band meeting you all talk about it and after some fighting and complaning you all come to " 
                                                    + "\na reasanable conclusion your band is still together and you are doing better then when you started");
                                            Reset();
                                            print("Your band goes on tour! \nyour band has a great time you continue to do what you have been doing");
                                            Reset();
                                            print("YOU WIN!");
                                            Reset();
                                            System.exit(0);
                                            break;
                    }
                            
                    break;
                    }
                case "2":
                    Reset();
                    print("you are going to put up posters");
                    Reset();
                    print("Now that you have put up some posters now what do you want to do");
                    ret = true;
                    break;
                case "3":
                    Reset();
                    print("you are going to go on tour");
                    Reset();
                    print("your tour was not as successful as it could have been you only had one album and you didnt advertise so not many people " 
                            + "knew becuse of this your band starts to get into a fight about what they did wrong it is not looking to well right now and you get really stressed out and worried");
                    Reset();
                    print("you turn to drugs");
                    Reset();
                    print("you spend a lot of money on your new habit");
                    Reset();
                    print("continue down this new path [1] Or change your ways [2]");
                    read = bufferRead.readLine();
                    switch(read){
                        case "1":
                            Reset();
                            print("you are going to continue down this path\n you spend a lot of money you really dont have on this habit" 
                            + "\n the recored label finds out and you get fired");
                            print("Game Over");
                            sleep(3000);
                            print("THE GAME WILL NOW RESTART!!");
                            sleep(2500);
                            Reset();
                            break;
                        case "2":
                            Reset();
                            print("you chose to change your ways and move down the better path");
                            Reset();
                            print("you get out of this bad stuff and you and your band are starting to become one again ");
                            Reset();
                            print("you go back and make another album");
                            Reset();
                            print("your band goes on tour now that you are all back together");
                            Reset();
                            print("you go on tour it is a little bit better then it was befor but you made the same mastakes you did" 
                                   +  "last time you didnt advertise and you and your band is suffering because of it");
                            Reset();
                            print("you advertise this time and then go on tour again this time it is a great success you and your band has learned its lesson ");
                            Reset();
                            print("after this tour is over your band has a lot of recognition");
                            Reset();
                            print("YOU WIN!");
                            Reset();
                            System.exit(0);
                            break;
                    }
                    break;
                    
            }
            
        
        }
    }
        
        
    
    
    public static void main(String[] args) throws IOException, InterruptedException {
        GigPostSelect.main(args);
        
    }
    
}
