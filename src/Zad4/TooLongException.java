package Zad4;

public class TooLongException extends Exception {
    @Override
    public String toString() {
        return "Maksymalna dozwolona długość dla Kei Car-ów to 3400 mm";
    }
}
