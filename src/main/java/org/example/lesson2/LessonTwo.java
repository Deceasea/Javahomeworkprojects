package org.example.lesson2;

public class LessonTwo {
    public static void main(String[] args) {
        System.out.println(checkSum( 6,7));
        checkNumber(8);
        System.out.println(checkNumberTwo (-7));
        repeatingString("Shame on you!", 3);
        checkYear(1504);
    }
    public static boolean checkSum( int a, int b ) {
        return a + b >= 10 && a + b <= 20;


    }
    public static void checkNumber ( int x) {
        if (x >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

}
    public static boolean checkNumberTwo (int z) {
        return z < 0;
    }
    public static void repeatingString ( String str, int y ) {
        for (int i = 0; i < y; i++) {
            System.out.println(str);
        }
    }

    public static void checkYear(int a) {
        System.out.println("Високосный: " + (
                (((a % 4) == 0) && ((a % 100) != 0)) ||
                ((((a % 100) == 0)) && ((a % 400) == 0)))
        );
    }
}

