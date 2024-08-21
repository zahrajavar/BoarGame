package game;
import java.util.Scanner;
import java.lang.String;

public class main {


    public static void main (String args[]) {

        ImplementRobot robotObject = new ImplementRobot();
        boolean gameison = true;

        while (gameison) {
            Scanner scan2 = new Scanner(System.in);
            String scanline2 = scan2.nextLine();
            switch (scanline2.toLowerCase()) {
                case "move":
                    if (robotObject.isplace()) {
                        robotObject.move();
                    }
                    else{
                        System.out.println("You have to start with Place.");
                    }
                    break;
                case "left":
                    if (robotObject.isplace()) {
                        robotObject.left();
                    }
                    else{
                        System.out.println("You have to start with Place.");
                    }
                    break;
                case "right":
                    if (robotObject.isplace()) {
                        robotObject.right();
                    }
                    else{
                        System.out.println("You have to start with Place.");
                    }
                    break;

                    case "report":
                        if (robotObject.isplace()) {
                            robotObject.report();
                }
                        else{
                            System.out.println("You have to start with Place.");
                        }

                    break;
                case "q":
                    gameison = false;
                    break;
                default:
                    if(scanline2.length() > 5 && scanline2.substring(0,5).toLowerCase().equals("place")){
                        String[] command = scanline2.split(" ");
                        command = command[1].split(",");
                        robotObject.place(Integer.valueOf(command[0]),Integer.valueOf(command[1]),Front.valueOf(command[2]));
                    }
                    else{
                        System.out.println("You have to start with Place!");
                    }

            }
        }
    }
}
