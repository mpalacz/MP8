package Zad3;

public class Main {
    public static void main(String[] args) {
        Account konto = new Account("Jan", 5000, "00 0000 0000 0000 0000 0000 0000");

        try {
            konto.transfer(6000);
        } catch (NotEnoughMoneyException e){
            System.out.println(e.toString());
        } catch (Exception e){
            System.out.println(e.toString());
        } finally {
            System.out.println(konto.getBallance());
        }
    }
}
