package Lesson2.Interfaces;

import java.util.Locale;
import java.util.Scanner;

public class MainAppForTransport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите какой транспорт вы хотите - Автомобиль, Велосипед, Лошадь, Вездеход: ");
        String transport = scan.nextLine();
        IMove move = null;
        switch (transport){
            case "Автомобиль":
                move = new autoMobile();
                break;
            case "Вездеход":
                move = new vezdeHod();
                break;
            case "Лошадь":
                move = new horse();
                break;
            case "Велосипед":
                move = new bikeCycle();
                break;
            default:
                System.out.println("Неизвестный тип транспорта.");
                return;
        }
        onlyHumanAfterAll human = new onlyHumanAfterAll("Жорик", transport);
        human.sitPlease();
        move.Moving(EMestnost.PLAIN.getMestoMove());
        move.Moving(EMestnost.DENSE_FOREST.getMestoMove());
        move.Moving(EMestnost.SWAMP.getMestoMove());
    }
}