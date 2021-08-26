package lesson9;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] ar = new String[][]{
                {"1", "2", "3","4"},
                {"4", "5", "_3","4"},
                {"4", "5", "3","4"},
                {"7", "8", "9","5"}};
        for (int i = 0; i < ar.length; i++) {
            System.out.println(Arrays.toString(ar[i]));
        }
        try {
            System.out.println(arSum(ar));
        }
        catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.printf("Строка: %d   Столбец:%d \n",e.getRow(),e.getCol());
        }
        catch (MyArraySizeException e){
            e.printStackTrace();
            System.out.println("Ошибка размера массива");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static int arSum(String[][] ar) throws Exception {
        int dsum = 0;
        if (ar.length != 4) {
            throw new MyArraySizeException("Не верный размер массива");
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i].length != 4) {
                throw new MyArraySizeException("Не верный размер массива");
            }
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                try {
                    dsum += Integer.decode(ar[i][j]);
                } catch (Exception e) {
                    throw new MyArrayDataException("Не число.",i,j);
                }
            }
        }


        return dsum;

    }

}
