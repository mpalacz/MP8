package Zad2;

public class Main {

    public static int dzieleniePrzezZero(){
        return 1 / 0;
    }

    public static void pozaTablica(){
        int[] array = new int[1];
        for (int i = 0; i <= array.length; i++){
            array[i] = 0;
        }
    }

    public static void main(String[] args) {
        try {
            dzieleniePrzezZero();
            pozaTablica();
        }catch (ArithmeticException e){
            System.out.println("Błąd arytmetyczny!");
            System.out.println(e.toString());
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Wywołano indeks poza tablicą!");
            System.out.println(e.toString());
            e.printStackTrace();
        }finally {
            System.out.println("Finnaly się wykonało");
        }
    }
}
