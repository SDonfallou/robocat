import java.util.*;
import java.util.LinkedList;
class Robocat {
  public static void main(String[] args) {
   
        int coordinate_row_mouse=0, coordinate_column_mouse=0, coordinate_row_cat=0, coordinate_column_cat=0, length_matrix, width_matrix;
    
         Scanner scn = new Scanner (System.in);
       // Advise 
           System.out.println( "Advise : " + "\n The Length and Width of the matrix must to be the Same to avoid an Error of index" + "\n The length and width mustn't surpass 20X20");
           System.out.println( "------------------------------------------------------");
    
       //Ask The dimension of the Matrix
            System.out.println( " Enter the Length of the Matrix");
            length_matrix = scn.nextInt();
            while (length_matrix > 20){
                  System.out.println( "Warning!!!" + "\n the lenght mustn't surpass 20");
                  width_matrix = scn.nextInt();
               }
             System.out.println( " Enter the Width of the Matrix");
               width_matrix = scn.nextInt();
          while (!(length_matrix==width_matrix)){
            System.out.println( "Warning!!!" + "\n the width that you put don't match with de Length of the Matrix put First");
               width_matrix = scn.nextInt();
            }
       // End Ask Input For the Matrix
    
       String[][] plan = new String[length_matrix][width_matrix];
    // Take input the Coordinate of the locastion for the cat
       System.out.println("Give me the Position of the Cat"); 
        coordinate_row_cat = scn.nextInt();
    // control space
       while (coordinate_row_cat >= length_matrix ){
          System.out.println( "Warning!!!" + "\n PUT an coordinate in matrix defined");
          coordinate_row_cat = scn.nextInt();
        }
      while (coordinate_column_cat >= length_matrix ){
            System.out.println( "Warning!!!" + "\n PUT an coordinate in matrix defined");
           coordinate_column_cat = scn.nextInt();
       }
    // end Control  End
        coordinate_column_cat = scn.nextInt();
   
       System.out.println("( " + coordinate_row_cat + " , " + coordinate_column_cat + " )" );
       plan[coordinate_row_cat][coordinate_column_cat]="C";

    for ( int i=0 ; i<plan.length ; i++){
      
      for ( int j=0; j<plan.length ; j++) {
       
        
           if ( plan[i][j]==plan[coordinate_row_cat][coordinate_column_cat]){
               System.out.print( "  C  ");
            } else {
                  System.out.print( " |o| ");
             } 
            
      } 
     System.out.println();
       
    }
      System.out.println( " -------------------------------------------");
    // End step Insertion of Cat
    //---------------------------------
     // Take input the Coordinate of the locastion for the Mouse
    System.out.println("Give me the Position of the Mouse"); 
     coordinate_row_mouse = scn.nextInt();
    
    // control space 
      while (coordinate_row_mouse >= length_matrix ){
          System.out.println( "Warning!!!" + "\n PUT an coordinate in matrix defined");
          coordinate_row_mouse = scn.nextInt();
      }
      while (coordinate_column_mouse >= length_matrix ){
          System.out.println( "Warning!!!" + "\n PUT an coordinate in matrix defined");
        coordinate_column_mouse = scn.nextInt();
      }
    //End Control Space
      coordinate_column_mouse = scn.nextInt();
    
    
    System.out.println("( " + coordinate_row_mouse + " , " + coordinate_column_mouse + " )" );
     plan[coordinate_row_mouse][coordinate_column_mouse]=" M ";

    
    for ( int i=0 ; i<plan.length ; i++){
      
      for ( int j=0; j<plan.length ; j++) {
       
        
           if ( plan[i][j]==plan[coordinate_row_mouse][coordinate_column_mouse]){
               System.out.print( "  M  ");
            } else {
                  System.out.print( " |o| ");
             } 
            
      } 
     System.out.println();
    
    }
    
     System.out.println("------------------------------------- "); 

    //------------------------------------
     System.out.println ( " The current Position Cat versus Mouse  ");
    for ( int i=0 ; i<length_matrix ; i++){
        
      
        for ( int j=0; j< width_matrix ; j++) {
          
             if ( plan[i][j]==plan[coordinate_row_mouse][coordinate_column_mouse]){
                   System.out.print( "  M  ");
              } else
             
                    if ( plan[i][j]==plan[coordinate_row_cat][coordinate_column_cat]){
                            System.out.print( "  C  ");
                         } else {
                                 System.out.print( " |o| ");
                                } 
            } 
    
          System.out.println();
      
    
      }
    
    //----------------------------
       
     System.out.println("------------------------------------- "); 
       for ( int i=0 ; i<length_matrix ; i++){
        
      
              for ( int j=0; j< width_matrix ; j++) {
              
                 if ( plan[i][j]==plan[coordinate_row_mouse][coordinate_column_mouse]){
                   System.out.print( "  X  ");
                  } else
             
                    if ( plan[i][j]==plan[coordinate_row_cat][coordinate_column_cat]){
                            System.out.print( "  C  ");
                         } else {
                                 System.out.print( " |o| ");
                                } 
               }
          System.out.println();
        }   
    //************
    	int[][] matrix = {
      
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},   
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
        {0, 1, 1, 1, 1, 1 ,1, 1, 1, 1, 1, 1 ,1 ,1, 1, 1, 1, 1 ,1, 0},
   
      };
	 
	   	int[] start = {coordinate_row_cat, coordinate_column_cat};
	   	int[] end = {coordinate_row_mouse, coordinate_column_mouse};
        	System.out.println("******************************");
	      	System.out.println("Path of the cat to catch the Mouse");
        
	      	shortestPath(matrix, start, end);
	      	System.out.println("*********************************");
    //************
   
  }
     private static class Cell  {
        int x;
        int y;
        int dist;  	//distance
        Cell prev;  //parent cell in the path
 
        Cell(int x, int y, int dist, Cell prev) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.prev = prev;
        }
        
        @Override
        public String toString(){
        	return "(" + x + "," + y + ")";
        }
    }
 
	//BFS, Time O(n^2), Space O(n^2)
	public static void shortestPath(int[][] matrix, int[] start, int[] end) {
		int sx = start[0], sy = start[1];
		int dx = end[0], dy = end[1];	
		//if start or end value is 0, return
		if (matrix[sx][sy] == 0 || matrix[dx][dy] == 0) {
			System.out.println("There is no path.");
			return;  
		}
		//initialize the cells 
	    int m = matrix.length;
	    int n = matrix[0].length;	    
	    Cell[][] cells = new Cell[m][n];
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (matrix[i][j] != 0) {
	                cells[i][j] = new Cell(i, j, Integer.MAX_VALUE, null);
	            }
	        }
	    }
	    //breadth first search
	    LinkedList<Cell> queue = new LinkedList<>();       
	    Cell src = cells[sx][sy];
	    src.dist = 0;
	    queue.add(src);
	    Cell dest = null;
	    Cell p;
	    while ((p = queue.poll()) != null) {
	    	//find destination 
	        if (p.x == dx && p.y == dy) { 
	            dest = p;
	            break;
	        }      
	        // moving up
	        visit(cells, queue, p.x - 1, p.y, p);        
	        // moving down
	        visit(cells, queue, p.x + 1, p.y, p);        
	        // moving left
	        visit(cells, queue, p.x, p.y - 1, p);        
	        //moving right
	        visit(cells, queue, p.x, p.y + 1, p);
	    }
	    
	    //compose the path if path exists
	    if (dest == null) {
	    	System.out.println("there is no path.");
	        return;
	    } else {
	        LinkedList<Cell> path = new LinkedList<>();
	        p = dest;
	        do {
	            path.addFirst(p);
	        } while ((p = p.prev) != null);
	        System.out.println(path);
	    }
	}
	
	//function to update cell visiting status, Time O(1), Space O(1)
	private static void visit(Cell[][] cells, LinkedList<Cell> queue, int x, int y, Cell parent) { 
		//out of boundary
	    if (x < 0 || x >= cells.length || y < 0 || y >= cells[0].length || cells[x][y] == null) {
	        return;
	    }    
	    //update distance, and previous node
	    int dist = parent.dist + 1;
	    Cell p = cells[x][y];
	    if (dist < p.dist) {
	        p.dist = dist;
	        p.prev = parent;
	        queue.add(p);
	    }
	}
}
