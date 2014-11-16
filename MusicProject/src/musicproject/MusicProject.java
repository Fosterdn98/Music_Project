package musicproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Thread.sleep;
import static main.likePython.*;
import static musicproject.Vars.*;
/**
 *
 * @author Fosterdn98
 */
public class MusicProject {
    static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    
    public static void choose() throws IOException{
        print("Please Choose A Person\n 1.Charles Williams [years 1950-1970] 2. Jim [years 1980-1990]");
        String read = bufferRead.readLine(); 
        print("You Choose: " + read);
        
       if(read.equals("1")){
           Char = 1;
       }
       if("2".equals(read)){
           Char = 2;
       }
       
    }
    public static void Clear(){
        for(int x = 0; x!=20; x++){
            System.out.print("\n");
        }
   }
    public static void Check() throws IOException, InterruptedException{
        if(Char == 1){
            CharS = "Charles Williams";
        }
        if(Char == 2){
           CharS = "Jim"; 
        }   
        print("are you sure that you are wanting to be: " + CharS);
        String read = bufferRead.readLine();
        if(read.equals("yes")){
           print("Ok Lets Get Started"); 
           sleep(500);
           Clear();
           
           
        }
        else{
            Clear();
            choose();
        }
    }
    public static void main(String[] args) throws InterruptedException, IOException {
       print("Welcome To The Music Game");
       sleep(500);
       choose();
       Clear();
       Check();
       sleep(500);
       Clear();
       MusicType_Blues.main(args);
            
        
    }
    
}
