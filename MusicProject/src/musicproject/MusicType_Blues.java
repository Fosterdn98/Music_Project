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
import static musicproject.GigPostSelect.bufferRead;
/**
 *
 * @author Fosterdn98
 */
public class MusicType_Blues {
    static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException, InterruptedException {
        print("Would You Like Your New Band To Be A Blues [1] Band Or A Rock Band [2] Or A Disco Band [3] ");
        String read = bufferRead.readLine();
        if(read == "1"){
            Blues.main(args);
        }
        if(read == "2"){
            //Rock.main(args);
        }
        if(read == "3"){
            //Disco.main(args);
        }
    }
    
}
