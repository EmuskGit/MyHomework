package Lesson2.Interfaces;

import java.util.Scanner;

public class bikeCycle extends transportType implements IMove{
    public void Moving(String mapType) {
        name = "Велосипед";
        fatigue = 1f;
        if (!mapType.equals("Болото")) {
            System.out.print("Введите сколько вы хотите проехать: ");
            Scanner scan = new Scanner(System.in);
            int km = scan.nextInt();
            moveTrans(km);
        } else {
            System.out.println("Велосипед не может ехать по " + EMestnost.SWAMP);
        }
    }

}
