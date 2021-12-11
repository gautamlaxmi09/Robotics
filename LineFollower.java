package robotics;
import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;
public class LineFollower
{
    public LineFollower()
    {
     LegoRobot r=new LegoRobot();
     Gear g=new Gear();
     LightSensor ls=new LightSensor(SensorPort.S3);
     r.addPart(ls);
     r.addPart(g);
     while(true)
     {
         int p=ls.getValue();
         if(p<100) //black
         g.forward();
         if(p>300 && p<750) //blue
             g.leftArc(0.08);
         if(p>800) //yellow
             g.rightArc(0.05);
         System.out.println("Sensor val:"+p);
     }
    }
    public static void main(String arg[])
    {
        new LineFollower();
    } 
    static
    {
        RobotContext.setStartPosition(40,490);
        RobotContext.useBackground("sprites/road.gif");
    }        
}

