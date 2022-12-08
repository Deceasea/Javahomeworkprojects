package org.example.LessonFour;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';

    public static final String HEADER_FIRST_SYMBOL = "♡";
    public static final String SPACE_MAP_SYMBOL = "\t";

    private static final char[][] MAP = new char[SIZE][SIZE];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount = 0;

    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {
        do {
            System.out.println("\n\nПоехали!");
            initMap();
            printMap();
            playGame();
        } while (isContinueGame());
    }
    private static boolean isContinueGame() {
        System.out.println("Еще разок? y\\n");
        return switch (in.next()) {
            case "y","n", "у", "н", "+", "-", "да", "нет" -> true;
            default -> false;
        };
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();

    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP_SYMBOL);
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }
            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static boolean checkEnd(char symbol) {
        if(checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("УРА! ВЫ ПОБЕДИЛИ!");
            } else {
                System.out.println("Победила противная железяка :(");
            }

            return true;
        }

        if (checkDraw()) {
            System.out.println("НИЧЬЯ!");
            return true;
        }

        return false;
    }

    private static boolean checkDraw() {
        /*       for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;*/
        return turnsCount >= SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {

        for (int i = 0; i < 3; i++)
            if ((MAP[i][0] == symbol && MAP[i][1] == symbol &&
                    MAP[i][2] == symbol) ||
                    (MAP[0][i] == symbol && MAP[1][i] == symbol &&
                            MAP[2][i] == symbol))
                return true;
        if ((MAP[0][0] == symbol && MAP[1][1] == symbol &&
                MAP[2][2] == symbol) ||
                (MAP[2][0] == symbol && MAP[1][1] == symbol &&
                        MAP[0][2] == symbol))
            return true;
        return false;

        /*if(MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) return true;
        if(MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) return true;
        if(MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) return true;
        if(MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) return true;
        if(MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) return true;
        return false;*/
    }

    private static void humanTurn() {
        System.out.println("\n ХОД ЧЕЛОВЕКА!");
        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Введите координату строки: ");
            rowNumber = in.nextInt() - 1;

            System.out.print("Введите координату столбца: ");
            columnNumber = in.nextInt() - 1;

            if(isCellFree(rowNumber, columnNumber)){
                break;
            }

            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется%n", rowNumber + 1, columnNumber + 1);
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }
    private static void aiTurn() {
        System.out.println("\n ХОД КОМПЬЮТЕРА!");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }
    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }
}