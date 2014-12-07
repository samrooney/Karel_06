/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Your Name here>  // replace <...> with your name
* @version <date/of/completion> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class Lab06 {

   public static void tasks1(Athlete arg)
{
while (arg.nextToABeeper()) 
{
arg.move();
}
}
   public static void tasks2(Athlete arg) 
{
while (!arg.nextToABeeper()) 
{
arg.move();
}
}
   public static void tasks3(Athlete arg) 
{
while (arg.frontIsClear()) 
{
arg.move();
}
}
   public static void tasks4(Athlete arg) 
{
while (arg.frontIsClear()) 
{
if (arg.nextToABeeper()) 
{
arg.pickBeeper();
}
arg.move();
}
}
   public static void tasks5(Athlete arg) 
{
while (arg.frontIsClear())
{
arg.move();
while (arg.nextToABeeper()) 
{  
arg.pickBeeper();
}
}
}
   public static void tasks6(Athlete arg) 
{
while (arg.nextToABeeper()) 
{
arg.move();
}
arg.move();
while (arg.nextToABeeper()) 
{
arg.move();
}
} 
   public static void main(String[] args) 
{

String filename = JOptionPane.showInputDialog("What robot map?");
Display.openWorld("maps/" + filename + ".map");
Display.setSize(10, 10);
Display.setSpeed(1);
          
Athlete A1 = new Athlete(1, 1, Display.EAST, Display.INFINITY);
Athlete A2 = new Athlete(1, 2, Display.EAST, Display.INFINITY);
Athlete A3 = new Athlete(1, 3, Display.EAST, Display.INFINITY);
Athlete A4 = new Athlete(1, 4, Display.EAST, Display.INFINITY);
Athlete A5 = new Athlete(1, 5, Display.EAST, Display.INFINITY);
Athlete A6 = new Athlete(1, 6, Display.EAST, Display.INFINITY);
 
          
tasks1(A1);
tasks2(A2);
tasks3(A3);
tasks4(A4);
tasks5(A5);
tasks6(A6);
          
         }
         
}
