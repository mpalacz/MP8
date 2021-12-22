package Zad4;

public class TooHighException extends Exception {
    @Override
    public String toString() {
        return "Maksymalna dozwolona wysokość dla Kei Car-ów to 2000 mm";
    }
}