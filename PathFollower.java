package robotics;
import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;
public class PathFollower
{
    public PathFollower()
    {
     LegoRobot r=new LegoRobot();
     Gear g=new Gear();
     LightSensor ls=new LightSensor(SensorPort.S1);
     LightSensor rs=new LightSensor(SensorPort.S2);
     r.addPart(ls);
     r.addPart(rs);
     r.addPart(g);
     while(true)
     {
         int a=ls.getValue();
         int b=rs.getValue();
         if(a<=1000 && b<=1000)
         {
         g.forward();
         }
         if(b==0) 
         {
             g.rightArc(0.02);
         }
         if(a==0)
         {
             g.leftArc(0.02);
         }
         System.out.println("Sensor val:"+a);
         System.out.println("Sensor val:"+b);
     }
    }
    public static void main(String arg[])
    {
        new PathFollower();
    } 
    static
    {
        RobotContext.setStartPosition(50,410);
        RobotContext.useBackground("sprites/path.gif");
    }        
}

