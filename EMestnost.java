package Lesson2.Interfaces;

public enum EMestnost {
    DENSE_FOREST("Густой лес"),
    PLAIN("Равнина"),
    SWAMP("Болото");

    private final String mestoMove;

    EMestnost(String mestoMove) {
        this.mestoMove = mestoMove;
    }

    public String getMestoMove() {
        return mestoMove;
    }
}
