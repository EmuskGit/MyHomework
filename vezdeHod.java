package Lesson2.Interfaces;

import java.util.Scanner;

public class vezdeHod extends transportType implements IMove {
    @Override
    public void Moving(String mapType) {
        name = "Вездеход";
        fatigue = 0.2f;
        fatigueName = "бензин";
        System.out.print("Введите сколько вы хотите проехать: ");
        Scanner scan = new Scanner(System.in);
        int km = scan.nextInt();
        moveTrans(km);
    }
}
