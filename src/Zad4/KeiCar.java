package Zad4;

public class KeiCar {
    String marka, model;
    int wielkoscSilnika, moc, dlugosc,wysokosc,szerokosc;

    public KeiCar(String marka, String model, int wielkoscSilnika, int moc, int dlugosc, int wysokosc, int szerokosc) throws TooBigEngineException, TooMuchPowerException, TooWideException, TooHighException, TooLongException {
        this.marka = marka;
        this.model = model;
        if (wielkoscSilnika > 660)
            throw new TooBigEngineException();
        else
            this.wielkoscSilnika = wielkoscSilnika;

        if (moc > 64)
            throw new TooMuchPowerException();
        else
            this.moc = moc;

        if (dlugosc > 3400)
            throw new TooLongException();
        else
            this.dlugosc = dlugosc;

        if (wysokosc > 2000)
            throw new TooHighException();
        else
            this.wysokosc = wysokosc;

        if (szerokosc > 1480)
            throw new TooWideException();
        else
            this.szerokosc = szerokosc;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWielkoscSilnika() {
        return wielkoscSilnika;
    }

    public void setWielkoscSilnika(int wielkoscSilnika) {
        this.wielkoscSilnika = wielkoscSilnika;
    }

    public int getMoc() {
        return moc;
    }

    public void setMoc(int moc) {
        this.moc = moc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }
}
