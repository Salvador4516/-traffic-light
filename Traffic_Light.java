package task_enum;

import java.util.Random;

public class Traffic_Light {
    public static Lights yellow;
    public static Lights red;
    public static Lights green;

    public String RandomLight(){
        yellow = Lights.YELLOW;
        red = Lights.RED;
        green = Lights.GREEN;
        String[] traffic = new String[]{yellow.getColor(),red.getColor(),green.getColor()};
        Random rand = new Random();
        return ("traffic lights:" + traffic[rand.nextInt(traffic.length)]);
    }
}
