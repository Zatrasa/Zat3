package lesson11;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;

public class MainUnit {
    public static void main(String[] args) {
        Integer[] intar = {1,2,3,4,5};
        String[] strar = {"r","n","o","p","s",};

//        System.out.println(Arrays.toString(intar));
//        System.out.println(Arrays.toString(strar));
//        try{
//        ChangeArr(intar,0,4);
//        ChangeArr(strar,0,4);}
//        catch (IndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//        System.out.println(Arrays.toString(intar));
//        System.out.println(Arrays.toString(strar));
//        System.out.println("---------------");
//        System.out.println(ArrToList(intar));
//        System.out.println(ArrToList(strar));

        Box box1 = new Box();
        box1.AddFruit(new Apple(),new Apple());
        box1.AddFruit(new Apple());

        Box box2 = new Box();
        box2.AddFruit(new Apple(),new Apple());
        System.out.println(box1.Compare(box2));
        System.out.println(box1.GetSumWeight());
        System.out.println(box2.GetSumWeight());
        box1.MoveBox(box2);
        System.out.println(box1.GetSumWeight());
        System.out.println(box2.GetSumWeight());
    }

    //Задание 1
    public static <T> void ChangeArr(T[] arr, int i, int j) {
        if (i>-1&&j>-1&&i<arr.length&&j< arr.length){
            T element = arr[i];
            arr[i] = arr[j];
            arr[j]=element;}
        else{
            throw  new IndexOutOfBoundsException();
        }
    }

    //Задание 2
    public static <T> ArrayList ArrToList(T[] arr) {
        ArrayList<T> newar = new ArrayList<>();
        for (T el : arr){
            newar.add(el);
        }
        return newar;
    }
}
