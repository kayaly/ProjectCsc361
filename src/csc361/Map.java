
package csc361;


public class Map {
    
    private int M;
    private int N ;
    private char [][] maze ;
    
    
        public void Map(int n , int m ){
            M = m ;
            N = n ;
            maze = new char[n][m];
            
        }
        
        public void  setmaze(int n , int m , char x){
            maze[n][m] = x ;
}
        public char[][]  getmaze( ){
           return  maze ;
}
        public char  getmaze(int n , int m ){
           return  maze[n][m] ;
}
    
}
