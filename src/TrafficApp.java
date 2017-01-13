import java.util.Scanner;

/**
 * Created by Brian on 1/12/17.
 */
public class TrafficApp {
    public enum TrafficLightColor{
        RED,YELLOW,GREEN
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick a traffic light color!");
        String userColor=scan.nextLine();
        userColor=userColor.toUpperCase();
        TrafficLightColor color;
        try {
            color = TrafficLightColor.valueOf(userColor);
            makeDrivingDecision(color);
        }catch(IllegalArgumentException e){
            System.out.println("Only use colors that are on a traffic light!");
        }
    }

    public static void makeDrivingDecision(TrafficLightColor color){
        switch(color){
            case RED:
                System.out.println("STOOOOOP!");
                break;
            case YELLOW:
                System.out.println("Slow it down!");
                break;
            case GREEN:
                System.out.println("GOOOO!");
                break;
        }
    }
}
