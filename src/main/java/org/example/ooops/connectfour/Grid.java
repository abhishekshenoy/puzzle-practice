package org.example.ooops.connectfour;

/* Ask for the rules
*
* -Dimensions 6*7 or Variable
* -Number of players
* -PVP
* -Instead of 4 connects , can be multiple connects
*/
public class Grid {

    int row;
    int columns ;

    int [][] grid;
    public Grid(int row , int columns){
        this.row=row;
        this.columns = columns;
    }

    public void initGrid(){
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                grid[i][j] = GridPositions.EMPTY.ordinal();
            }
        }
    }

    public int[][] getGrid(){
        return grid;
    }
    public void placePiece(){

    }
    
}
