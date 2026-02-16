package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
    if(clock <0 || clock>23 || !isBarking){
        return false;
    }
       return clock >= 20 || clock <8;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     if(temp <=35 && temp >=25 && !isSummer){
         return true;
     }else if ((temp <= 45) && (temp >= 25) && isSummer) {
            return true;
     }else {
            return false;
        }
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1.0;
        }
        return width * height;
    }

    public static double area(double radius) {
       if (radius<0){
           return -1.0;
       }
           return Math.pow(radius,2)*Math.PI;
    }
}
