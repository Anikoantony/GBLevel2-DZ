package DZ_2;

public class Main {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 5;
            int c = 0;

            int [] arr = {1,2};
           System.out.println("ошибка" + b/c);
            arr[65]=6;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException  e) {
            e.printStackTrace();
            System.out.println("Плохо!Й");
        }



    }
}
