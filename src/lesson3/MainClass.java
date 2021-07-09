package lesson3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class MainClass {
    public static void main(String[] args) {
        //DigitGame();
        StringGame();
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//      //  System.out.println(a);
//        sc.nextLine();
//        String str=sc.nextLine();
//        System.out.println(str);
//
//        String str1=sc.nextLine();
//        System.out.println(str1);
//
//     //   str=sc.next();
//      //  System.out.println(str);

        //
    }

    public static void DigitGame() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        do {
            int res = rand.nextInt(10);
            int otv;
            int kol = 0;
            do {
                System.out.print("Введите число: ");
                otv = sc.nextInt();
                kol++;
                if (otv > res) {
                    System.out.println("Введенное число больше загаданного");
                }

                if (otv < res) {
                    System.out.println("Введенное число меньше загаданного");
                }

                if (otv == res) {
                    System.out.println("ВЕРНО!!!");
                }

            }
            while (otv != res && kol != 3);
            if (otv != res) {
                System.out.println("Загаданное число: " + res);
            }


            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        }
        while (sc.nextInt()==1);
        sc.close();

    }

    public static void StringGame() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[] words  =  {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                   "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                   "pear", "pepper", "pineapple", "pumpkin", "potato"}; //26

        System.out.println("Гадайте загаданное слово из массива:");
        System.out.println(Arrays.toString(words));
        int rnd = rand.nextInt(26);
        String ResWord = words[rnd];
        System.out.println(ResWord);
        String str1;
        do{
            System.out.println("попробуйте угадать слово:");
            str1=sc.next();
            if (ResWord.equals(str1)) {System.out.println("Верно");}
            else{System.out.println("Неверно");
                char[] Templ = new char[15];
                for(int i=0;i<15;i++) {Templ[i]='#';}
                int lowl=ResWord.length();
                if (lowl>str1.length()){lowl=str1.length();}
                for(int i=0;i<lowl;i++){
                    if (ResWord.charAt(i)==str1.charAt(i)) {Templ[i]=str1.charAt(i);}

                }
                for(int i=0;i<15;i++) { System.out.print(Templ[i]);}
                System.out.println();
               // System.out.println(Arrays.toString(Templ));

            }



        }
        while (! ResWord.equals(str1));

    }


}
