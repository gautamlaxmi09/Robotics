package robotics;
import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;
import ch.aplu.robotsim.TouchSensor;
public class ResistObstacle {
    public ResistObstacle()
    {
        LegoRobot R=new LegoRobot();
        Gear g=new Gear();
        TouchSensor tr=new TouchSensor(SensorPort.S1);
        TouchSensor tl=new TouchSensor(SensorPort.S2);
        R.addPart(tr);
        R.addPart(tl);
        R.addPart(g);
        boolean s1,s2;
        g.forward();
        while(true)
        {
            s1=tr.isPressed();
            s2=tl.isPressed();
            if(s1 && s2)
            {
                g.backward(100);
                g.left(400);
                g.forward();
            }
            if(s1)
            {
                g.backward(100);
                g.left(400);
                g.forward();
            }
            if(s2)
            {
                g.backward(100);
                g.right(400);
                g.forward();
                
            }
        }
    }
    public static void main(String str[])
    {
       new ResistObstacle();
    }
    static
    {
        RobotContext.setLocation(10, 10);
        RobotContext.setStartPosition(10, 250);
        RobotContext.useObstacle(RobotContext.channel);
    }
}
