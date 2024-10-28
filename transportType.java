package Lesson2.Interfaces;

public class transportType {
    String name;
    String fatigueName;
    float fatigue;
    float full = 100f;

    public void moveTrans(int metrov) {
        if (onlyHumanAfterAll.isSitDown()) {
            if (full > 0 && ((full) - metrov*fatigue) > 0) {
                System.out.println(name + " проехал " + metrov + " метров с " + full + " " + fatigueName);
                full -= metrov * fatigue;
                System.out.println("У " + name + " осталось " + full + " " + fatigueName);
            } else {
                System.out.println("Вам не хватает " + fatigueName);
            }
        } else {
            if (full > 0 && ((full) - metrov) > 0) {
                full -= metrov;
                System.out.println(onlyHumanAfterAll.getName() + " прошел пешком " + metrov + ", вам не стыдно?");
            } else {
                System.out.println(onlyHumanAfterAll.getName() + " умер от истощения");
            }
        }
    }
}
