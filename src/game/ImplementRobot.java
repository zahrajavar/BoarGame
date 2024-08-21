package game;

import java.util.Scanner;

public class ImplementRobot implements IRobot {

    private int xrobot,yrobot;
    private Front frontrobot;
    private boolean isplaced = false;

    public boolean isplace(){
        return this.isplaced;
    }

    public void place(int x, int y, Front f) {

        if (!(x >= 0 && x <= 4)) {
            System.out.println("You have entered a wrong x");
        }
        else {
            this.xrobot = x;
        }
        if (!(y >= 0 && y <= 4)) {
            System.out.println("You have entered a wrong y");
        }
        else {
            this.yrobot = y;
        }
        if (!(f==Front.East || f==Front.West || f==Front.North || f==Front.South)) {
            System.out.println("you have entered wrong front ");
        }
        else {
            this.frontrobot= f;
        }
        this.isplaced = true;
    }


    public void move() {
        switch (this.frontrobot){
            case North:
                if ((yrobot+1)<5){
                yrobot+=1;}
                else{
                System.out.println("Move is not possible.");
            }
                break;
            case South:
                if ((yrobot-1)>=0){
                    yrobot-=1;}
                else{
                    System.out.println("Move is not possible.");
                }
                break;

            case East:
                if ((xrobot+1)<5){
                    xrobot+=1;}
                else{
                    System.out.println("Move is not possible.");
                }
                break;

            case West:
                if ((xrobot-1)>=0){
                    xrobot-=1;}
                else{
                    System.out.println("Move is not possible.");
                }
                break;
        }
    }


    public void left() {
        this.frontrobot  = frontrobot.rotateLeft();

    }


    public void right() {
        this.frontrobot  = frontrobot.rotateRight();

    }

    public void report() {
        System.out.print(xrobot+","+yrobot+","+frontrobot);


    }
}
