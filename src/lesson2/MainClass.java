package lesson2;

import java.sql.Array;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        //1
        int mas[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        ChangeValue(mas);
        System.out.println(Arrays.toString(mas));
        //2
        int mas1[] = new int[8];
        SetArrValue(mas1);
        System.out.println(Arrays.toString(mas1));
        //3
        int mas2[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Arr6Con(mas2);
        System.out.println(Arrays.toString(mas2));
        //4
        int[][] mas3 = new int[6][6];
        Matrix(mas3);
        for (int i = 0; i < mas3.length; i++) {
            System.out.println(Arrays.toString(mas3[i]));
        }
        //5
        MinMax(mas2);
        //6
        int mas4[] = {6, 2, 3, 0};
        System.out.println(EqualPart(mas4));
        //7
        int mas5[] = {6, 2, 3, 0};
        MoveArrElements(mas5, 5);
        System.out.println(Arrays.toString(mas5));

    }

    public static void ChangeValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void SetArrValue(int[] arr) {
        for (int i = 0, k = 0; i < arr.length; i++, k += 3) {
            arr[i] = k;
        }
    }

    public static void Arr6Con(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static void Matrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
    }

    public static void MinMax(int[] arr) {
        int minv = arr[0];
        int maxv = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxv) {
                maxv = arr[i];
            }
            if (arr[i] < minv) {
                minv = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(String.format("Минимальное: %d  Максимальное: %d", minv, maxv));
    }

    public static boolean EqualPart(int[] arr) {
        int leftsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightsum = 0;
            leftsum += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                rightsum += arr[j];
            }
            if (leftsum == rightsum) {
                return true;
            }
        }
        return false;
    }

    public static void MoveArrElements(int[] arr, int n) {
        n %= arr.length;
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                int temp = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            }
        }
        if (n < 0) {
            for (int j = 0; j > n; j--) {
                int temp = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = temp;
            }
        }

    }
}
