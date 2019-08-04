import java.util.Arrays;
import java.util.ArrayList;

public class Maze {
    private int[][] maze;
    private int[] start = new int[2];
    private int[] end   = new int[2];
    private ArrayList<int[]> path = new ArrayList<int[]>();

    public Maze(String mazeStr) {
        mazeStr = mazeStr.replaceAll("█","W");
        String[] mazeStrArr = mazeStr.split("\n");
        for(int i=0; i<mazeStrArr.length; i++) {
            mazeStrArr[i] = mazeStrArr[i].trim();
        }
        int numRows = mazeStrArr.length;
        int numColumns = mazeStrArr[0].length();

        maze = new int[numRows+2][numColumns+2]; // +2 is to add a border of walls around the entire maze

        // establishing the border of walls
        for(int column=0; column<maze[0].length; column++) {
            maze[0][column] = 1;
            maze[maze[0].length-1][column] = 1;
        }
        for(int row=0; row<maze.length; row++) {
            maze[row][0] = 1;
            maze[row][maze.length-1] = 1;
        }


        for(int row=1; row<numRows+1; row++) {
            for(int column=1; column<numColumns+1; column++) {
                String mazeChar = mazeStrArr[row-1].substring(column-1,column);
                if(mazeChar.equals("W")) maze[row][column] = 1;         // █ are Walls (but we need to use regular ascii symbol to avoid error when searching)
                if(mazeChar.equals(".")) maze[row][column] = 0;         // . are Open Spaces
                if(mazeChar.equals("@")) {
                    maze[row][column] = 0;                              // @ is the Starting Spot
                    start[0] = row;
                    start[1] = column;
                }
                if(mazeChar.equals("#"))  {                             // # is the Ending Spot
                    maze[row][column] = 0;
                    end[0] = row;
                    end[1] = column;
                }
            }
        }

        path.add(start);
    }

    // Copy Constructor
    public Maze(Maze oldMaze) {
        maze = new int[oldMaze.maze.length][oldMaze.maze[0].length];
        for(int row=0; row<maze.length; row++) {
            for(int column=0; column<maze[0].length; column++) {
                maze[row][column] = oldMaze.maze[row][column];
            }
        }

        start[0] = oldMaze.start[0];
        start[1] = oldMaze.start[1];
        end[0] = oldMaze.end[0];
        end[1] = oldMaze.end[1];

        for(int[] tile:oldMaze.path) {
            path.add(tile.clone());
        }
    }

    public String toString() {
        String stringRep = "";
        for(int row=1; row<maze.length-1; row++) {
            for(int column=1; column<maze[0].length-1; column++) {
                int[] currTile = {row,column};
                if(Arrays.equals(currTile,start)) stringRep += "@";
                else if(Arrays.equals(currTile,end)) stringRep += "#";
                else if(inPath(currTile)) stringRep += "■";
                else if(maze[row][column] == 0) stringRep += ".";
                else stringRep += "█";
            }
            stringRep += "\n";
        }
        return stringRep;
    }

    public String rawToString() {
        String stringRep = "";
        for(int row=0; row<maze.length; row++) {
            for(int column=0; column<maze[0].length; column++) {
                stringRep += maze[row][column];
            }
            stringRep += "\n";
        }
        return stringRep;
    }


    public int[] getLastAdded() {
        return path.get(path.size()-1);
    }

    public ArrayList<int[]> neighbors(int[] tile) {
        int row = tile[0];
        int col = tile[1];
        ArrayList<int[]> neighbors = new ArrayList<int[]>();
        if(maze[row+1][col]==0) neighbors.add(new int[] {row+1,col});
        if(maze[row][col+1]==0) neighbors.add(new int[] {row,col+1});
        if(maze[row-1][col]==0) neighbors.add(new int[] {row-1,col});
        if(maze[row][col-1]==0) neighbors.add(new int[] {row,col-1});

        for(int i=0; i<neighbors.size(); i++) {
            if(inPath(neighbors.get(i))) neighbors.remove(i);
        }
        return neighbors;
    }

    private boolean inPath(int[] testTile) {
        for(int[] pathTile:path) {
            if(Arrays.equals(pathTile,testTile)) return true;
        }
        return false;
    }
    
    public boolean lastIsNoGood() {  // aka the "reject(P,c)" method
        int lastRow = getLastAdded()[0];
        int lastCol = getLastAdded()[1];
        if((maze[lastRow+1][lastCol] + maze[lastRow][lastCol+1] + maze[lastRow-1][lastCol] + maze[lastRow][lastCol-1])==3
            && neighbors(getLastAdded()).size() == 0) {
            return true;
        }
        return false;
    }

    public boolean accept() {
        return Arrays.equals(getLastAdded(),end);
    }

    public void populate(int[] tile) {
        path.add(tile);
    }

    public void depopulate() {
        path.remove(path.size()-1);
    }
}