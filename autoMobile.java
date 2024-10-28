package Lesson2.Interfaces;

import java.util.Scanner;

public class autoMobile extends transportType implements IMove{
    @Override
    public void Moving(String mapType) {
        name = "Автомобиль";
        fatigue = 0.1f;
        fatigueName = "бензин";
        if(!mapType.equals("Густой лес") && !mapType.equals("Болото")){
            System.out.print("Введите сколько вы хотите проехать: ");
            Scanner scan = new Scanner(System.in);
            int km = scan.nextInt();
            moveTrans(km);
        }
        else{
            System.out.println("Автомобиль не может ехать по " + EMestnost.SWAMP);
        }
    }
}