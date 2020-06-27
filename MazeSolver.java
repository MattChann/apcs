import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;

public class MazeSolver {
    private static Maze maze;
    private static Maze solvedMaze;

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("StringMazes.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");

        String mazeStr = sc.next();
        maze = new Maze(mazeStr);
        System.out.println("Maze to be solved:");
        System.out.println(maze);

        solveMaze();

        System.out.println("Solved maze:");
        System.out.println(solvedMaze);
    }

    public static void solveMaze() {
        if(maze.accept()) solvedMaze = new Maze(maze);
        else if(maze.lastIsNoGood());
        else if(solvedMaze == null) {  // stops processing other branches when a solution is found
            for(int[] tile:maze.neighbors(maze.getLastAdded())) {
                maze.populate(tile);
                solveMaze();
                maze.depopulate();
            }
        }
    }
}