
package csc361;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import static sun.rmi.transport.TransportConstants.Return;

public class State  {
    
    private int Postion_R_X ;
    private int Postion_R_Y ;
    private Map map1 ; 
   
    
    public State (){
        Postion_R_X = 0;
        Postion_R_Y = 0 ;
        
    }
    @SuppressWarnings("null")
    public char [][]State(String filename) throws IOException {
        
    File inFile = new File(filename);                                 
    Scanner scanner = new Scanner(inFile);     
     int N = scanner.nextInt();
     int M = scanner.nextInt();
     
  char[] a = scanner.nextLine().toCharArray(); 

    char[][] array = new char[N][M];

 for(int i=0; i < M ; i++) {

       array[i] = scanner.nextLine().toCharArray();

  }
        map1 = new Map();
        map1.Map(N, M);
        
    NewState( array );
    
 
    return array;
}
    
    public void SetPostion_T_X(int X ){
        
        Postion_R_X = X ;
    }
    
    public void SetPostion_T_Y(int Y ){
      
        Postion_R_Y = Y ;
    }
    
    public void Setmap1(Map map ){
        
        map1 = map ;
    }
    
    
    
    public int getPostion_T_X( ){
        
        return Postion_R_X  ;
    }
    
    public int getPostion_T_Y( ){
        
        return Postion_R_Y  ;
    }
    
    public Map detmap1( ){
        
        return map1 ;
    }
    
    
    
    public String Move_E() {
       if (Postion_R_X ==  -1 ){
      return "\nHOLE";
       
   }
   else {
       
    
      
       if (Postion_R_Y != 5){
         char X = map1.getmaze(Postion_R_X  , Postion_R_Y + 1) ;
          
       switch(X){
           case ' ' :
         
                 Postion_R_Y ++ ;
                 map1.setmaze(Postion_R_X, Postion_R_Y, 'R');
                 map1.setmaze(Postion_R_X , Postion_R_Y - 1 , ' ');
                 return "\nDONE";
                
             case 'H' :
              Postion_R_Y ++ ; 
                map1.setmaze(Postion_R_X, Postion_R_Y, 'X');
                 map1.setmaze(Postion_R_X , Postion_R_Y -1 , ' ');
                 Postion_R_X = - 1 ;
                  return "\nDONE" +  "\nHOLE";
                  
                 
                  case  'B' :
                  return "\nFAIL" ;
                  
                      case  'Y' :
                 Postion_R_Y ++ ; 
                 map1.setmaze(Postion_R_X, Postion_R_Y, 'X');
                 map1.setmaze(Postion_R_X , Postion_R_Y -1 , ' ');
                 Postion_R_X = - 1 ;
                 return "\nDONE" +  "\nHOLE" +"\nGOLE";
              
                  case  'T' :
                 Postion_R_Y ++ ; 
                 map1.setmaze(Postion_R_X, Postion_R_Y, 'Z');
                 map1.setmaze(Postion_R_X , Postion_R_Y -1 , ' ');
                   return "\nDONE"   +"\nGOLE"; 
                  
               
       }
       }
        else 
        return "\nFAIL" ;
       
   }
        return null;

}
     public String Move_W() {
         
      if (Postion_R_X ==  -1 ){
       return  "\nHOLE" ;
       
   }
   else {
       
    
      
       if (Postion_R_Y != 0){
         char X = map1.getmaze(Postion_R_X  , Postion_R_Y + 1) ;
          
       switch(X){
           case ' ' :
         
                 Postion_R_Y -- ;
                 map1.setmaze(Postion_R_X, Postion_R_Y, 'R');
                 map1.setmaze(Postion_R_X , Postion_R_Y + 1 , ' ');
                 return "\nDONE"  ;
                
             case 'H' :
              Postion_R_Y -- ; 
                map1.setmaze(Postion_R_X, Postion_R_Y, 'X');
                 map1.setmaze(Postion_R_X , Postion_R_Y +1 , ' ');
                 Postion_R_X = - 1 ;
                 return "\nDONE" + "\nHOLE" ;
                
                  case  'B' :
                      
                  return "\nFILE";
                  
                  case  'Y' :
                 Postion_R_Y -- ; 
                 map1.setmaze(Postion_R_X, Postion_R_Y, 'X');
                 map1.setmaze(Postion_R_X , Postion_R_Y +1 , ' ');
                 Postion_R_X = - 1 ;
                  return "\nDONE" + "\nHOLE " + "\nGOLE" ;
                
              
                  case  'T' :
                 Postion_R_Y -- ; 
                 map1.setmaze(Postion_R_X, Postion_R_Y, 'Z');
                 map1.setmaze(Postion_R_X , Postion_R_Y +1 , ' ');
                 return "\nDONE" +"\nGOLE" ;
                  
                 
             
       }
       }
        else 
         return "\nFILE"; 
       
   }
        return null;

     }
        public String Move_S() {
   if (Postion_R_X ==  -1 ){
       System.out.print("change");
              
         return  "\nHole" ;
       
   }
   else {
       
    
      
       if (Postion_R_X != 5){
         char X = map1.getmaze(Postion_R_X + 1 , Postion_R_Y) ;
          
       switch(X){
           case ' ' :
         
                 Postion_R_X ++ ;
                 map1.setmaze(Postion_R_X, Postion_R_Y, 'R');
                 map1.setmaze(Postion_R_X - 1, Postion_R_Y  , ' ');
                  return  "\nDONE" ;
                
             case 'H' :
              Postion_R_X ++ ; 
                map1.setmaze(Postion_R_X, Postion_R_Y, 'X');
                 map1.setmaze(Postion_R_X - 1, Postion_R_Y, ' ');
                 Postion_R_X = - 1 ;
                  return  "\nDONE " + "\nHOLE" ;
                
                  case  'B' :
                  return "\nFILE";
                 
                  
                 case  'Y' :
                Postion_R_X ++ ; 
                map1.setmaze(Postion_R_X, Postion_R_Y, 'X');
                 map1.setmaze(Postion_R_X - 1, Postion_R_Y, ' ');
                 Postion_R_X = - 1 ;
              return "\nDONE"+"\nHOLE"+"\nGOLE";
                 
                  case  'T' :
                 Postion_R_X ++ ; 
                map1.setmaze(Postion_R_X, Postion_R_Y, 'Z');
                 map1.setmaze(Postion_R_X - 1, Postion_R_Y, ' ');
                 
               return "\nDONE"+"\nGOLE";
                 
             
       }
       }
        else 
      return "\nFILE";
       
   }
        return null;
     }

      public String Move_N() {
        
    if (Postion_R_X ==  -1 ){
      
      return "\nHOLE";
       
   }
   else {
       
       

       if (Postion_R_X != 0){
           
           char X = map1.getmaze(Postion_R_X - 1 , Postion_R_Y) ;
          
       switch(X){
           case ' ' :
         
                 Postion_R_X -- ;
                 map1.setmaze(Postion_R_X, Postion_R_Y, 'R');
                 map1.setmaze(Postion_R_X + 1, Postion_R_Y  , ' ');
                  return "\nDONE";
                 
             case 'H' :
              Postion_R_X -- ; 
                map1.setmaze(Postion_R_X, Postion_R_Y, 'X');
                 map1.setmaze(Postion_R_X + 1, Postion_R_Y, ' ');
                 Postion_R_X = - 1 ;
                 return "\nDONE"+"\nHOLE";
                
                  case  'B' :
                 return "\nFILE";
                 
                  case  'Y' :
                Postion_R_X ++ ; 
                map1.setmaze(Postion_R_X, Postion_R_Y, 'X');
                 map1.setmaze(Postion_R_X - 1, Postion_R_Y, ' ');
                 Postion_R_X = - 1 ;
                 return "\nDONE"+"\nHOLE"+"\nGOLE";
                 
                  case  'T' :
                 Postion_R_X ++ ; 
                map1.setmaze(Postion_R_X, Postion_R_Y, 'Z');
                 map1.setmaze(Postion_R_X - 1, Postion_R_Y, ' ');  
                  return "\nDONE"+"\nGOLE";
                  
                
             
       }
       }
       else 
          return"\nFILE";
       
   }
        return null;
     }
      
      public void NewState(char [][] c ){
          // System.out.println(c.length);
           
          for (int i = 0 ; i <= c.length-1 ; i++ ){
              for (int j = 0 ; j< c.length ; j++ ){
                  map1.setmaze(i, j, c[i][j]);
              }
            
          }
          
      }
      
      public void display(){
           for (int i = 0 ; i <= map1.getmaze().length-1 ; i++ ){
              for (int j = 0 ; j< map1.getmaze()[i].length ; j++ ){

        System.out.print(map1.getmaze()[i][j]);
          }
              
               System.out.println();
           }
            
           
      }
      
      public String doCommandAndLog() throws IOException {
      
          BufferedReader reader = new BufferedReader(new FileReader("/Users/Abosaoud/NetBeansProjects/CSC361/simple.map.command.txt"));
        int lines = 0;
         String cmnd ="" ;
        
        while (reader.readLine() != null)
                 lines++;
        
         reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader("/Users/Abosaoud/NetBeansProjects/CSC361/simple.map.command.txt"));
        for (int i = 0 ; i < lines ; i ++){
            // System.out.print(log);
          
            	switch (reader1.readLine()) {
                   
		 case "move-N" :
                     // System.out.print(log);
                    cmnd += Move_N();
                     break;
		 case "move-S" :
                      cmnd += Move_S();
                     break;
		case "move-E" :	
                    cmnd +=  Move_E();
                     break;
                 case "move-W" :	
                     cmnd += Move_W();
                     break;
		}
        }
        reader1.close();
  
               writeFile(cmnd);
		

    
        return null;

       
      }

      
      public void writeFile(String S ) throws IOException{
      String content = S ;
     File file = new File("logFile.txt");
    FileWriter fw = new FileWriter(file.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(content);
    bw.close(); // Be sure to close BufferedWriter
      }

 

}
