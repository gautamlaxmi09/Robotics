package robotics;
import ch.aplu.robotsim.NxtRobot;
import ch.aplu.robotsim.Motor;
import ch.aplu.robotsim.MotorPort;
import ch.aplu.robotsim.Tools;

public class CircleWithTwoMotors {
    public CircleWithTwoMotors()
    {
       NxtRobot r=new NxtRobot();
       Motor A=new Motor(MotorPort.A);
       Motor B=new Motor(MotorPort.B);
       r.addPart(B);
       r.addPart(A);
       A.setSpeed(100);
       B.setSpeed(100);
       A.forward();
       B.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(200);
       A.forward();
       Tools.delay(200);
       A.stop();
       Tools.delay(100);
       A.forward();
       r.exit();
    }
    public static void main(String arg[])
    {
        new CircleWithTwoMotors();
    }
}


