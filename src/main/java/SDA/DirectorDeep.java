package SDA;

public class DirectorDeep implements Cloneable{

    protected String imie;
    protected String nazwisko;
    public rodzajFilmow rodzajFilmow;

    public DirectorDeep(String imie, String nazwisko, rodzajFilmow rodzajFilmow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rodzajFilmow = rodzajFilmow;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
