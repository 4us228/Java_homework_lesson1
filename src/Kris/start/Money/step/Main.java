package Kris.start.Money.step;

public class Main {

    public static void main(String[] args) {

        System.out.println(task2(10.1f,11.1f,12.2f,13.3f));
        System.out.println(task3(4, 5));
        task4(1);
        System.out.println(task5(5));
        task6("Кристиан");
        task7(400);
    }


    public static void task1() {
        byte a = 127;
        short b = 30000;
        int c = 525;
        long d = 228;
        float f = 3.1459f;
        double g = 3.145926;
        char h = 'A';
        boolean i = 4 > 6;//false
        boolean j = 8 > 6;//true
        String o = "Hello geek";

    }

    public static float task2(float a, float b, float d, float c) {
        return a * (b + (c / d));
    }

    public static boolean task3(int a, int b) {
        int g = a + b;
        return g >= 10 && g <= 20;

    }

    public static void task4(int x) {
        if (x >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");

        }
    }

    public static boolean task5(int x) {

        return x >= 0;
    }


    public static void task6(String a) {
        System.out.println("Привет," + a);
    }

    public static void task7(int x) {
        if (x % 4 == 0 && x % 100 == 0 && x % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосний");
        }
    }
}

