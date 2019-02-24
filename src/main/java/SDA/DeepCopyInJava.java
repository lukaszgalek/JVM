package SDA;

public class DeepCopyInJava {
    public static void main(String[] args) {
        DirectorDeep directorDeep = new DirectorDeep("roman", "polanski", rodzajFilmow.KOMEDIA);
        FilmDeep filmDeep = new FilmDeep("jakis tytul", 2018, directorDeep);
        FilmDeep filmDeep1 = null;


        try {
            filmDeep1 = (FilmDeep) filmDeep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(filmDeep1.directorDeep.rodzajFilmow);

        filmDeep1.directorDeep.rodzajFilmow = rodzajFilmow.HORROR;

        System.out.println("filmDeep1: " + filmDeep1.directorDeep.rodzajFilmow);
        System.out.println("filmDeep: " + filmDeep.directorDeep.rodzajFilmow);
    }
}

