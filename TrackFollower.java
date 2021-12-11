package robotics;
import ch.aplu.robotsim.Gear;
import ch.aplu.robotsim.LightSensor;
import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.RobotContext;
import ch.aplu.robotsim.SensorPort;

public class TrackFollower {
    
    public TrackFollower()
    {
     LegoRobot r=new LegoRobot();
     Gear g=new Gear();
     LightSensor ls=new LightSensor(SensorPort.S1);
     r.addPart(ls);
     r.addPart(g);
     while(true)
     {
         int p=ls.getValue();
         if(p==1000) 
         {
             g.forward();
         }
         if(p>80 && p<1000) 
         {
             g.rightArc(0.009);
         }
         
         System.out.println("Sensor val:"+p);
         if (p==0)
         {
             g.stop();
         }
     }
    }
    public static void main(String arg[])
    {
        new TrackFollower();
    } 
    static
    {
        RobotContext.setStartPosition(80,452);
        RobotContext.useBackground("sprites/track.png");
    }        
}

