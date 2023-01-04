import java.io.*;
import java.util.*;
public class day10{  
   public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("clock.txt")); 
      int x = 1;
      int c = 0;
      boolean wait = false;
      int waitC = 0;
      int n = 0;
      while(f.hasNextLine()){
         c++;
         if(!wait){
            String s = f.next();
            if(s.equals("addx")){
               n = Integer.parseInt(f.next());
               waitC = c;
               wait = true;
            }else{
            //nothing
            }
         }

         if(c==20|c==60||c==100||c==140||c==180||c==220){
            System.out.println((c*x)+" ");
         }
         if(waitC+1==c){
            wait = false;
            x+=n;
            n = 0;
         }
      }
   }
   
}