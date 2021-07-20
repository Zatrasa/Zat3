package lesson4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class XOGame {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        inicialize_game();
        print_field();

        while (true) {
            HumanTurn();
            print_field();
            System.out.println("-------------");
            if (TestWin(DOT_X)) {
                System.out.println("Победа человека!!!");
                break;
            }
            if (isEnd()) {
                System.out.println("Ничья!!!");
                break;
            }

//            System.out.println("Ход компьютера");
//            AITurn();
//            print_field();
//            System.out.println("-------------");
//            if (TestWin(DOT_O)) {
//                System.out.println("Победа компьютера!!!");
//                break;
//            }
//            if (isEnd()) {
//                System.out.println("Ничья!!!");
//                break;
//            }

        }
    }

    public static void inicialize_game() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void print_field() {
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);
            }
            System.out.printf("%d ", i + 1);
            System.out.println();
        }

    }

    public static void HumanTurn() {
        int x;
        int y;
        do {
            System.out.print("Введите кординаты через пробел: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!test_turn(x, y));
        map[x][y] = DOT_X;
    }

    public static void AITurn() {
        Random rand = new Random();
        int x;
        int y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        }
        while (!test_turn(x, y));
        map[x][y] = DOT_O;
    }

    public static boolean test_turn(int x, int y) {
        if (x < 0 || x > SIZE - 1 || y < 0 || y > SIZE - 1 || map[x][y] != DOT_EMPTY) {
            //System.out.println("Кординаты заданы неверно");
            return false;
        }
//        if (){
//            System.out.println("Ячейка не пустая");
//            return false;
//        }
        return true;
    }

    public static boolean TestWin(char symb) {
//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        int res_x;
        int res_y;
        //Прямые
        for (int i = 0; i < SIZE; i++) {
            res_x = 0;
            res_y = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) {
                    res_x++;
                    if (res_x == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    res_x = 0;
                }
                if (map[j][i] == symb) {
                    res_y++;
                    if (res_y == DOTS_TO_WIN) {
                        return true;
                    }
                } else {
                    res_y = 0;
                }
            }
        }
        //Косые право
        for (int i=0; i < SIZE; i++) {
            res_x = 0;
            res_y = 0;
            for (int j = i; j < SIZE; j++) {
                if (map[j - i][j] == symb) {
                    res_x++;
                    if (res_x == DOTS_TO_WIN) {
                        return true;
                    }
                }else {
                    res_x = 0;
                }
                if (map[j][j - i] == symb) {
                    res_y++;
                    if (res_y == DOTS_TO_WIN) {
                        return true;
                    }
                }else {
                    res_y = 0;
                }
            }
        }
        //Косые лево
        for (int i=0; i < SIZE; i++) {
            res_x = 0;
            res_y = 0;
            for (int j = i; j < SIZE; j++) {
                if (map[j][SIZE-1+i-j] == symb) {
                    res_x++;
                    if (res_x == DOTS_TO_WIN) {
                        return true;
                    }
                }else {
                    res_x = 0;
                }
                if (map[j-i][SIZE-1-j] == symb) {
                    res_y++;
                    if (res_y == DOTS_TO_WIN) {
                        return true;
                    }
                }else {
                    res_y = 0;
                }
            }
        }
        return false;
    }

    public static boolean isEnd() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
