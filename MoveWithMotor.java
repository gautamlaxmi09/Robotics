package robotics;
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Motor;
import ch.aplu.robotsim.MotorPort;
import ch.aplu.robotsim.Tools;
public class MoveWithMotor 
{
    public MoveWithMotor()
    {
        NxtRobot r=new NxtRobot();
        Motor MotA=new Motor(MotorPort.A);
        Motor MotB=new Motor(MotorPort.B);
        r.addPart(MotB);
        r.addPart(MotA);
        MotA.setSpeed(100);
        MotB.setSpeed(100);
        MotA.forward();
        MotB.forward();
        Tools.delay(2000);
        MotA.stop();
        Tools.delay(1000);
        MotA.forward();
        Tools.delay(2000);
        MotB.stop();
        Tools.delay(1000);
        MotB.forward();
        Tools.delay(2000);
        r.exit();            
    }
    public static void main(String arg[]) 
    {
        new MoveWithMotor();
    }
            
    
}
