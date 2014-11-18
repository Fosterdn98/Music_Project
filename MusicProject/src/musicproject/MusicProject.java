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
public class MusicProject {
    static BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
    private static String[] args;
    
    public static void choose() throws IOException, InterruptedException{
        print("\nPlease Choose A Person\n 1.Charles Williams [years 1950-1970] 2. Jim [years 1980-1990]  3. Instructions 4. credits");
        String read = bufferRead.readLine(); 
        print("\nYou Choose: " + read);
        
       if(read.equals("1")){
           Char = 1;
       }
      if("2".equals(read)){
           Char = 2;
              }
       if("3".equals(read)){
           Instructions.main(args);
              }
       if("2".equals(read)){
           Credits.main(args);
           
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
        print("\nare you sure that you are wanting to be: " + CharS);
        String read = bufferRead.readLine();
        if(read.equals("yes")){
           print("\nOk Lets Get Started"); 
           sleep(500);
           Clear();
           
           
        }
        else{
            Clear();
            choose();
        }
    }
    public static void main(String[] args) throws InterruptedException, IOException {
       print("\nWelcome To The Music Game\n");
       print("WARNING THE FALLOWING GAME HAS DRUG REFRENCES AND MAY BE INAPROPRIATE FOR KIDS UNDER THE AGE OF 10!!!!!");
       sleep(500);
       choose();
       Clear();
       Check();
       sleep(500);
       Clear();
       MusicType_Blues.main(args);
            
        
    }
    
}
