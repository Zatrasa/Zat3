package lesson12;

public class MainUnit {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {

        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1f;
        }
        //Без разделения по массивам
        long a = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis()-a);
        a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
        }
        a=System.currentTimeMillis()-a;
        System.out.println("Время выполнения по методу 1: "+a);


        //С разделением по массивам
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1f;
        }
        a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);
        Thread t1 = new Thread(()  -> {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        Thread t2 = new Thread(()  -> {
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        a=System.currentTimeMillis()-a;
        System.out.println("Время выполнения по методу 2: "+a);

//        float b=0f;
//        for (float ar:arr2) {
//            b+=ar;
//        }
//        System.out.println(b);

    }
}
