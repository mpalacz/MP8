package Zad1;

public class Main {

    public static char pierwszyZnak(String napis){
        return napis.charAt(0);
    }

    public static void main(String[] args) {
        try{
            pierwszyZnak(null);

        }catch (NullPointerException e){
            System.out.println("Wartość wynosi NULL");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}