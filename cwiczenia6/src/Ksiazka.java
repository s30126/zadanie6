public class Ksiazka extends MediaBiblioteczne {

    private String autor;
    private int liczbaStron;

    String getAutor () {
        return this.autor;
    }

    void setAutor(String autor) {
        this.autor = autor;
    }

    int getLiczbaStron () {
        return this.liczbaStron;
    }

    void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    public Ksiazka (String tytul, int rokWydania, String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    @Override
    protected void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println(autor);
        System.out.println(liczbaStron);
    }

    public void sprawdzLiczbeStron() {

        if (liczbaStron > 500) {
            System.out.println("Ta książka jest długa. Ma " + liczbaStron + " stron.");
        } else  {
            System.out.println("Ta książka jest standardowej długości. Ma " + liczbaStron + " stron.");
        }

    }

}
