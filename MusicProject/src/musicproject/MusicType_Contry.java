/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicproject;

import java.io.IOException;
import static musicproject.MusicType_Blues.bufferRead;
import static musicproject.Vars.char1bandtype;
import static musicproject.likePython.print;

/**
 *
 * @author Fosterdn98
 */
public class MusicType_Contry {

    public static void main(String[] args) throws IOException, InterruptedException {
        print("Would You Like Your New Band To Be A Electronic Band [1] Band Or A Contry Band[2]");
        String read = bufferRead.readLine();
        
        if(read.equals("1")){
            Elect.main(args);
            char1bandtype =4;
        }
        if(read.equals("2")){
            Contry.main(args);
            char1bandtype =5;
            
        }
        
    
    }
    
}
