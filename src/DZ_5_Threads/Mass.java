package DZ_5_Threads;

public class Mass {

   private final Object mon = new Object();
   private int size = 10000000;
   private int h = size / 2;
   private  float[] arr=new float[size];
   private  float[] a1=new float[h];
   private float[] a2=new float[h];

    public float[] getA1() {
        return a1;
    }

    public float[] getA2() {
        return a2;
    }

    public void setA1(float[] a1) {
        synchronized (mon) { this.a1 = a1; }
    }

    public void setA2(float[] a2) {
        synchronized (mon) { this.a2 = a2;}
    }

    public void skleika()
    {
        synchronized (mon) {
            System.arraycopy(a1, 0, arr, 0, h);
            System.arraycopy(a2, 0, arr, h, h);
        }

        System.out.println("Склейка произведена");
    }

    public void razkleika()
    {
        synchronized (mon) {
            this.arr = arr_1(new float[size]);
            System.arraycopy(this.arr, 0, this.a1, 0, this.h);
            System.arraycopy(this.arr, this.h, this.a2, 0, this.h);
        }

        System.out.println("расклейка произведена");
    }


    public void mass_add()
    {
        float[] arr1 = arr_1(new float[size]);


        //arr=arr_1(arr);
        // расчет времени по 1-му заданию
        long start = System.currentTimeMillis();
        long time = 0;

        for (int i = 0; i < arr1.length ; i++)
        {
            arr1[i] = (float)(arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        time = System.currentTimeMillis() - start;
        System.out.println("Время заполнения массива новыми значениями " + time);
    }

    public float[] arr_1(float[] arr )
    {
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=1;
        }
        return arr;
    }

    public Mass(int size) {
        this.size = size;
        this.h = size / 2;
    }



}
