package Zad4;

public class TooWideException extends Exception {
    @Override
    public String toString() {
        return "Maksymalna dozwolona szerokość dla Kei Car-ów to 1480 mm";
    }
}
