public class MediaBiblioteczne {

    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne (String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }

    protected void wypozycz() {

        if (dostepny == true) {
            dostepny = false;
            System.out.println("Medium zostało wypożyczone.");
        } else {
            System.out.println("To medium zostało już wypożyczone przez inną osobę.");
        }

    }

    protected void zwroc() {

        if (dostepny == false) {
            dostepny = true;
            System.out.println("Medium zostało zwrócone.");
        } else {
            System.out.println("To medium nie było wypożyczone.");
        }

    }

    protected void wyswietlInformacje() {
        System.out.println(tytul);
        System.out.println(rokWydania);
        System.out.println(dostepny ? "Dostępne" : "Wypożyczone");
    }

}
