package Zad3;

public class NotEnoughMoneyException extends Exception {

    @Override
    public String toString(){
        return "Wysokość przelewu jest większa niż saldo konta";
    }
}
