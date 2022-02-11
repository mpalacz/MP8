package Zad4;

public class Main {
    public static void main(String[] args) {
        KeiCar keiCar;
        try {
            keiCar = new KeiCar("Honda", "Civic", 1600, 150, 3800, 2200, 1500);
        } catch (TooBigEngineException | TooMuchPowerException | TooWideException | TooHighException | TooLongException e) {
            e.printStackTrace();
        }
    }
}