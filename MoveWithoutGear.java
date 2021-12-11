package robotics;
import ch.aplu.robotsim.TurtleRobot;

public class MoveWithoutGear 
{  
    public MoveWithoutGear()
    {
    TurtleRobot robot=new TurtleRobot();
    robot.forward(50);
    robot.left(45);
    robot.forward(50);
    robot.right(90);
    robot.forward(40);
    robot.exit();

    }
    public static void main(String arg[])
    {
        new MoveWithoutGear();
    }
}

