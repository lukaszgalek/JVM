package SDA;

public class FilmDeep implements Cloneable{


    public  String tytul;
    public int rok;
    public DirectorDeep directorDeep;

    public FilmDeep(String tytul, int rok, DirectorDeep directorDeep) {
        this.tytul = tytul;
        this.rok = rok;
        this.directorDeep = directorDeep;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FilmDeep filmDeep = (FilmDeep) super.clone();
        filmDeep.directorDeep = ((DirectorDeep)directorDeep.clone());
        return filmDeep;
    }
}
