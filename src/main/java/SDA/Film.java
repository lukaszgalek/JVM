package SDA;

public class Film implements Cloneable {
public  String tytul;
public int rok;
public Director director;

    public Film(String tytul, int rok, Director director) {
        this.tytul = tytul;
        this.rok = rok;
        this.director = director;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
