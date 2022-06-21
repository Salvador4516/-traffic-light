package task_enum;

public enum Lights {
    RED("red"), GREEN("green"), YELLOW("yellow");

    private final String color;

    Lights(String red) {
        this.color = red;
    }

    public String getColor() {
        return this.color;
    }
}

