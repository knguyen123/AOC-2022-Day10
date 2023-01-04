import java.io.*;
import java.util.*;
public class day10P2{  
   public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("clock.txt")); 
      char[][] screen = new char[6][40];
      for(int r = 0; r < 6; r++){
         for(int c = 0; c < 40; c++){
            screen[r][c]= '.';
         }
      }
      int row = 0;
      int col = 0;
      int x = 1;
      int c = 0;
      boolean wait = false;
      int waitC = 0;
      int n = 0;
      while(f.hasNextLine()){
         c++;
         if(col==x-1||col==x||col==x+1){
            screen[row][col] = '#';
         }
         col++;
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

         if(c==40|c==80||c==120||c==160||c==200||c==240){
            //System.out.println((c*x)+" ");
            row++;
            col = 0;
         }
         if(waitC+1==c){
            wait = false;
            x+=n;
            n = 0;
         }
      }
      for(int r = 0; r < 6; r++){
         for(int coll = 0; coll < 40; coll++){
            System.out.print(screen[r][coll]+"");
         }
         System.out.println("");
      }
      
   }
   
}