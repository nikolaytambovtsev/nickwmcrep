package ru.geekbrains.lesson_d.Home;

public class Main {
    public static void main(String[] args) {
        Cat c0 = new Cat("Barsik", "Black", 3);
        System.out.printf("Cat name: %s, color: %s, age: %d\n",
                c0.getName(), c0.getColor(), c0.getAge());

        c0.voice();
        c0.jump();

        System.out.println(Cat.paws);
        System.out.println(Cat.mustacheAmount);
        Cat.mustacheAmount = 40;
        System.out.println(Cat.mustacheAmount);
    }
}