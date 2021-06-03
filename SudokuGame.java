// two data structure which are virtually necessary to represent a sudoku game as a virtual object

public class SudokuGame {
    // Immutable Member variables sit in the body of the class 
    private final int[][] gridState;  // 2d 9 by 9 grid
    private final GameState gameState;

    // we expect this data to not change during runtime of the app (CONSTANTS)
    // using static variables allow 2 benefits: code readibility & if the value of this variable changes, everywhere where this value is referenced changes too
    public static final int GRID_BOUNDARY = 9;

    // constructor: both values of the member variables come from an external source
    // 2 parameter variables that exist only during a method's execution, and are discarded afterwards
    // use these parameters as temporary containers to store values which we will assign to our member variables
    public SudokuGame(int[][] gridState, GameState gameState){
        this.gridState = gridState;
        this.gameState = gameState;
    }

    // accessor methods aka getters and setters
    // so any software entity can access our private member variable while still giving our object control over what information to release
    public int[][] getGridState(){
        return gridState;
    }

    // public void setGridState(int[][] gridState){
    //     this.gridState = gridState;
    // }

    public GameState getGameState(){
        return gameState;
    }

    // public void setGameState(GameState gameState){
    //     this.gameState = gameState;
    // }
}