public class Film extends MediaBiblioteczne {

    private String rezyser;
    private int czasTrwania;

    String getRezyser () {
        return this.rezyser;
    }

    void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    int getCzasTrwania () {
        return this.czasTrwania;
    }

    void setCzasTrwania(int czasTrwania) {
        this.czasTrwania = czasTrwania;
    }

    public Film (String tytul, int rokWydania, String rezyser, int czasTrwania) {
        super(tytul, rokWydania);
        this.rezyser = rezyser;
        this.czasTrwania = czasTrwania;
    }

    @Override
    protected void wyswietlInformacje() {
        super.wyswietlInformacje();
        System.out.println(rezyser);
        System.out.println(czasTrwania);
    }

    public void sprawdzCzasTrwania() {

        if (czasTrwania > 120) {
            System.out.println("Ten film jest długi. Trwa " + czasTrwania + " minut.");
        } else  {
            System.out.println("Ten film jest standardowej długości. Trwa " + czasTrwania + " minut.");
        }

    }




}
