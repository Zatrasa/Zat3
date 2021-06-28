package MainUnit;

public class MainClass {
    public static void main(String[] args) {
        String S="Hello";
        int i = 5;
        long l = 1234567890L;
        float f = 5.56F;
        double d = 0.45345345353453;
        char ch = 'J';
        boolean b=true;

        System.out.println(Calculate(1,1,1,1));
        System.out.println(IsInInterval(4,5));
        PrintPositiv(-1);
        System.out.println(IsNegativ(-5));
        PrintName("Yura");
        TestYear(2020);
     /*   System.out.println("hello!");
        String trt = "terracota";
        PrintGod(trt);*/
    }

    public static void PrintGod(String str) {
        System.out.println(str);
    }

    public static float Calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean IsInInterval(int a, int b) {
        return 10<=(a+b)&&(a+b)<=20;
    }

    public static void PrintPositiv(int a) {
        if (a<0) { System.out.println("Отрицательное"); }
        else { System.out.println("Положительное"); }
    }

    public static boolean IsNegativ(int a) {
        return a<0;
    }

    public static void PrintName(String Nam) {
        System.out.println("Привет, "+Nam+"!");
    }

    public static void TestYear(int Year) {
        if (Year%4==0&&Year%100!=0||Year%400==0){System.out.println("Високосный");}
        else {System.out.println("Не високосный");}
    }
}
