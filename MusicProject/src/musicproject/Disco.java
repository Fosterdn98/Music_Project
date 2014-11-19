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
public class Disco {
        static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        private static String[] args;
        public static void Clear(){
           for(int x = 0; x!=20; x++){
               System.out.print("\n");
           }}

        public static void Reset() throws InterruptedException{
            sleep(1000);
            Clear();
        }
        public static void rest() throws InterruptedException, IOException{
            if(GigPostSelectString.equals("Do Some Gigs")){
                Reset();
                print("you have done gigs for about 2 months now in local areas! tonight after you gig you were found by a scouting agent and you now have a appt. to meet with the record company");
                Reset();
                print("you goto the record company and they offer you a record deal you accept of course");
                Reset();
                print("time to get more world wide recognition");
                print("Would you like to do some TV advertisments [1] Or Put up posters [2] Or Go on tour [3]");
                String read = bufferRead.readLine(); 
                switch(read){
                    case "1":
                        Reset();
                        print("you chose to do TV advertisment");
                        Reset();
                        print("after about 1 week of tv advertisments you have been getting a lot of first album sales");
                        Reset();
                        print("now you need to make another decision");
                        print("would you like to make another album [1] Or go on tour [2] Or do both [3]");
                        read = bufferRead.readLine(); 
                        switch(read){
                            case "1":
                                Reset();
                                print("So you want to make another album");
                                Reset();
                                print("you make another album and it starts to sell");
                                Reset();
                                return;
                            case "2":
                                Reset();
                                print("So you want to go on tour");
                                Reset();
                                print("you are now setting out on you first tour");
                                Reset();
                                print("as you are going on tour you have some problems your band is fighting on how you are going to do things and you are haveing some money problems");
                                Reset();
                                print("Turn to drugs [1] Or Fight through it [2]");
                                read = bufferRead.readLine(); 
                                switch(read){
                                    case "1":
                                        Reset();
                                        print("your recored compeny finds out and you are done for");
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
                                        print("you end up fighting through it and your band is now better then ever and ready for your first concert on tour");
                                        Reset();
                                        print("after this tour is over your band has a lot of recognition");
                                        Reset();
                                        
                                }
                                break;
                            case "3":
                                Reset();
                                print("So you want to make a new album and go on tour");
                                Reset();
                                print("you have realsesed your album and about a month latter it is time for that tour");
                                Reset();
                                print("you go on tour as you are on tour you and  your band start to fight and things are looking really bad at this point you are all not sure if things are going to last. you have droped everything into this band and if you loss the band you loss everything ");
                                sleep(1000);
                                Reset();
                                print("Turn to drugs [1] Or Fight through it [2]");
                                read = bufferRead.readLine(); 
                                switch(read){
                                    case "1":
                                        Reset();
                                        print("The recored compeny finds out and your done for");
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
                                        print("your going to push through it");
                                        Reset();
                                        print("you call a band meeting you all talk about it and after some fighting and complaning you all come to a reasanable conclusion your band is still together and you are doing better then when you started");
                                        Reset();
                                        print("your band goes on tour");
                                        Reset();
                                        print("your band has a great time you continue to do what you have been doing");
                                        Reset();
                                        print("you win the game \n YOU WON");
                                        sleep(3000);
                                        Credits.main(args);
                                        break;
                                }
                                    
                                break;    
                        }
                        break;
                    case "2":
                        Reset();
                        print("you chose to Put up posters");
                        Reset();
                        print("now that you have put posters out what are you going to do");
                        Disco.rest();
                    case "3":
                        Reset();
                        print("you chose to Go on tour");
                        print("you and your band go out on tour ");
                        Reset();
                        print("your tour was not as successful as it could have been you only had one album and you didnt advertise so not many people knew becuse of this your band starts to get into a fight about what they did wrong it is not looking to well right now and you get really stressed out and worried");
                        Reset();
                        print("you spend a lot of money on drugs and your starting to loss everthing that you have to this new thing");
                        print("continue down this path [1] Or change you ways");
                        read = bufferRead.readLine(); 
                        switch(read){
                            case "1":
                                Reset();
                                print("you continue to do drugs and you get cought");
                                Reset();
                                print("you get thrown in jail");
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
                                print("you chose to changer your ways");
                                Reset();
                                print("you get out of doing drugs and you and your band are starting to become one again ");
                                Reset();
                                print("time to make a decision");
                                print("Go on tour [1] Or advertise");
                                read = bufferRead.readLine(); 
                                switch(read){
                                    case "1":
                                        Reset();
                                        print("you choose to go on tour");
                                        Reset();
                                        print("you go on tour it is a little bit better then it was befor but you made the same mastakes you did last time you didnt advertise and you and your band is suffering because of it");
                                        Reset();
                                        print("you advertise this time and then go on tour again this time it is a great success you and your band has learned its lesson ");
                                        Reset();
                                        print("you and your band does great ");
                                        Reset();
                                        print("you win the game \n YOU WON");
                                        sleep(3000);
                                        Credits.main(args); 
                                        break;
                                    case "2":
                                        Reset();
                                        print("you chose to advertise");
                                        Reset();
                                        print("you adveertise on tv and with posters");
                                        Reset();
                                        print("Now what would you like to do?");
                                        print("you can go on tour [1] Or do some more advertising [2]");
                                        read = bufferRead.readLine(); 
                                        switch(read){
                                            case "1":
                                                Reset();
                                                print("you are going to go on tour");
                                                Reset();
                                                print("after some advertising you go on tour this is a great success");
                                                Reset();
                                                print("your band is happy they make some more albums do some more tours all is well");
                                                Reset();
                                                print("you and your band does great ");
                                                Reset();
                                                print("you win the game \n YOU WON");
                                                sleep(3000);
                                                Credits.main(args); 
                                                break;
                                            case "2":
                                                Reset();
                                                print("you are going to do some more advertising");
                                                Reset();
                                                print("you advertise some more now you go on tour");
                                                Reset();
                                                print("you and your band does great ");
                                                Reset();
                                                print("you win the game \n YOU WON");
                                                sleep(3000);
                                                Credits.main(args); 
                                                break;
                                        }
                                                                                        
                                        break;
                                }
                        }
                        break;
                                
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
                print("you have put up a lot of posters and have got a lot of free music downloads this seems to have gotten you a lot of recognition it is now the date that all the posters were for YOUR FIRST GIG! after your first gig a record company "
                        + " \nscouting agent was there and he would like you to come and visit his office he has heard you music online and in "
                        + "\nperson and his company is interested in a record deal");
                sleep(2000);
                Reset();
                print("you goto the record company and they offer you a record deal you accept of course");
                Reset();
                print("time to make a new decision");
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
                                        Credits.main(args);
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
                                                Credits.main(args);
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
                                Credits.main(args);
                                break;
                        }
                        break;

                }
                if(ret){
                return;
            }
        }
     }
            
        

    public static void main(String[] args) throws IOException, InterruptedException {
        Clear();
        print("this music is known to be played in dance clubs. you are influnced by the bee gees and some other bands. this music is 100% dancable and you sure do like to dance");
        Clear();
        GigPostSelect.main(args);
    }
    
}
