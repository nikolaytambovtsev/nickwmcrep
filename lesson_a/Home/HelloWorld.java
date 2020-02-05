package ru.geekbrains.lesson_a.Home;

public class HelloWorld { // one line comment

    // type name (param) {body}
    private static boolean canWeMove(int move, int border) {
        boolean result = move > 0 && move < border;
        return result;
    }

    //type name(param) {body}
    private static void printCanMove(boolean canMove, int coordinate) {
        if (!canMove) {
            System.out.println("We can not make a move here");
        } else {
            System.out.println("We make a move to " + coordinate);
        }
    }

    public static void main(String[] args) {
        int width = 3;
        int height = 5;
        int moveX = 2;
        int moveY = 5;
        boolean canMoveX = canWeMove(moveX, width);
        boolean canMoveY = canWeMove(moveY, height);

        printCanMove(canMoveX, moveX);
        printCanMove(canMoveY, moveY);
    }
    /*
     * o1 & o2 = r
     * 0    0    0
     * 0    1    0
     * 1    0    0
     * 1    1    1
     *
     * f|s=r     ||
     * 0 0 0
     * 0 1 1
     * 1 0 1
     * 1 1 1
     * */

    private static void arythmExample() {
        // + - * / %

        int i3 = 10;
        i3 = i3 + 10;
        i3 += 10;

        float i0 = 10;
        int i1 = 3;
        System.out.println(i0 / i1);
        // 3
        System.out.println(i0 % i1);
        // 1
        int i2 = 10;
        i2--;
        System.out.println(i2);
    }

    private static void varsExample() {
        System.out.println("Hello world");
        int i = 2147000000;
        byte b0 = 127;
        short s = 1;
        long anyLongVariableIdentifier = 3000000000L;
        boolean b = true;
        char c = 75;
        char c0 = 'H';
        double d = 2.765432;
        float f = 1.2345678f;
    }
}

