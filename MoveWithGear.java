package robotics;
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Gear;
public class MoveWithGear {
    
    public MoveWithGear()
    {
       NxtRobot robot=new NxtRobot();
       Gear g=new Gear();
       robot.addPart(g);
       g.setSpeed(100);
       g.forward(1000);
       g.left(300);
       g.forward(1000);
       g.right(300);
       g.forward(1000);
       robot.exit();;
    }
    public static void main(String arg[])
    {
        new MoveWithGear();
    }
    
}

    

