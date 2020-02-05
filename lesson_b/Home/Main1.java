package ru.geekbrains.lesson_b.Home;

import java.util.Arrays;

public class Main1 {

    static final int a = 10;

    private static int power(int base, int sign) {
        int result = 1;
        for (int i = 0; i < sign; i++) {
            result *= base;
        }
        return result;
    }

    private static void pif(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] =  (i+1) * (j+1);
            }
        }
    }

    public static void main(String[] args) {
        //preCondUndef();
        //postCond();
        //cyclesExample();
        //code blocks
        //arrays
        int[] arr;
        arr = new int[9];
        arr[0] = 1;
        arr[1] = 6;
        arr[2] = 10;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = i * 7;
        }
        System.out.println(Arrays.toString(arr));

        int[] ar2 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(ar2));

        char[][] field = new char[3][3];
        field[0][0] = 'X';
        field[1][2] = 'O';
        System.out.println(field[2][0]);

        int[][] ar3 = new int[3][];
        ar3[0] = new int[6];
        ar3[1] = new int[2];
        ar3[2] = new int[100];

        int[][] ar4 = {
                {1,2,3},
                {3,4,5},
                {6,7,8}
        };

    }

    private static void cyclesExample() {

        //cycles
        // pre-condition (defined, undefined), post-condition

        // startVal; cond; change
        //     body
        System.out.println(power(2, 10));
        int[][] a = new int[5][5];
        pif(a);
    }

    private static void postCond() {
        int i = 0;
        do {
            System.out.print(i++ + " ");
        } while (i < 10);
    }

    private static void preCondUndef() {
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
    }

    private static void switchExample() {
        //switch
        String recipient = "Leila";

        switch (recipient) {
            case "Ivan":
            case "Petr":
                System.out.println("Msg was sent to desk #3");
                break;
            case "Tatiana":
                System.out.println("Msg was sent to desk #9");
                break;
            case "Leila":
                System.out.println("Msg was sent to desk #19");
                break;
            default:
                System.out.println("Unknown recipient");
        }
    }

    private static void selection() {
        int a = 10;
        int b = 20;
        int c;
        if (a < b) {
            c = b;
            System.out.println();
        } else
            c = a;

        c = (a < b) ? b : a;
    }
}