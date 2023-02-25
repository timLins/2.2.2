package web.model;

public class Car {


    private String name;

    private int speed;

    private String color;

    public Car(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
