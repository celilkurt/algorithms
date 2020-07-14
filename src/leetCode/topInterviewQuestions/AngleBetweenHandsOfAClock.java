package leetCode.topInterviewQuestions;

import java.util.Scanner;

public class AngleBetweenHandsOfAClock {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(angleClock(sc.nextInt(),sc.nextInt()));

    }

    public static double angleClock(int hour, int minutes) {

        double angle = 30*Math.abs((double)hour-(double)minutes/5) ;
        if((double)hour < (double)minutes/5)
            angle -= (double)minutes/2;
        else
            angle += (double)minutes/2;


        if(angle == 360)
            return 0;
        else
            return angle;


    }

}
