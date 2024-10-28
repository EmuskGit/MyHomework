package Lesson2.Interfaces;

import java.util.Scanner;

public class horse extends transportType implements IMove {
    @Override
    public void Moving(String mapType) {
        name = "Лошадь";
        fatigue = 0.5f;
        fatigueName = "выносливости";
        if(!mapType.equals("Болото")){
            System.out.print("Введите сколько вы хотите проехать: ");
            Scanner scan = new Scanner(System.in);
            int km = scan.nextInt();
            moveTrans(km);
        }
        else{
            System.out.println("Лошадь не может идти по " + EMestnost.SWAMP);
        }
    }
}
