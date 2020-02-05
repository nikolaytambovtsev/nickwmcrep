package ru.geekbrains.lesson_d.Home;

public class Cat {
    private static final int CURRENT_YEAR = 2020;
    private String name;
    private String color;
    private int birthYear;

    public static final int paws = 4;
    public static int mustacheAmount = 50;

    private Cat() {
        System.out.println("MEOW!");
    }
    public Cat(int age) {
        this();
        this.birthYear = CURRENT_YEAR - age;
    }
    public Cat(String name, String color, int age) {
        this(age);
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    public void voice() {
        System.out.println(this.name + " meows");
    }

    public void jump() {
        if (getAge() < 5)
            System.out.println(name + " jumps");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

}
