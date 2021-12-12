package robotics;
import ch.aplu.robotsim.TurtleRobot;
import java.util.Scanner;

public class RectangleWithoutGear {
     public RectangleWithoutGear()
    {
        Scanner S=new Scanner(System.in);  
        String dir=new String();
        System.out.println("Enter the direction: ");
        dir=S.nextLine();
        TurtleRobot robot=new TurtleRobot();
        switch(dir)
        {
            case "left": 
               for(int i=0; i<2; i++)
                {
                    robot.forward(50);
                    robot.left(90);
                    robot.forward(200);
                    robot.left(90);
                }
            break;
            
            case "right":
                for(int i=0; i<2; i++)
                {
                    robot.forward(50);
                    robot.right(90);
                    robot.forward(200);
                    robot.right(90);
                }
            break;
            default:
            System.out.println("Invalid Direction");
        }
        
        robot.exit();
    }
    public static void main(String arg[])
    {
        new RectangleWithoutGear();
    }
}
