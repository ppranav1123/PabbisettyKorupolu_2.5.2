/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  public String name = ""; 
  public int points;
  /* your code here - constructor(s) */ 
  public Player(String inputName)
  {
    name = inputName;
    points = 0;
    System.out.println("Hello "+name+" and welcome to the game!");
  }
  
  public Player(Player p)
  {
    name = p.name;
    p.name = "Overwritten Name";
  }
  /* your code here - accessor(s) */ 
  public String getName(){  /* incomplete */  }
  public int getPoints(){/* incomplete */}

  /* your code here - mutator(s) */ 
  public void setName(String inputName){/* incomplete */}
  public void addToPoints(int points){/* incomplete */}
}