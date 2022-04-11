import java.util.ArrayList;
import java.util.Random;

public class Banka {

    private String imeBanke;

    private ArrayList<Korisnik> listaKorisnika;

    private ArrayList<Racun> racuniKorisnika;

    public Banka(String imeBanke) {

        this.imeBanke = imeBanke;
        this.listaKorisnika = new ArrayList<Korisnik>();
        this.racuniKorisnika = new ArrayList<Racun>();
    }


    // generisanje id-a korisnika
    public String genidKorisnika() {

        // inits
        String uuid;
        Random rng = new Random();
        int duzina = 6;
        boolean nonUnique;

        // petlja generise dok se ne generise jedinstven uuid
        do {

            // generisanje uuid-a
            uuid = "";
            for (int i = 0; i < duzina; i++) {
                uuid += ((Integer) rng.nextInt(10)).toString();
            }

            // provjera da li je uuid jedinstven
            nonUnique = false;
            for (Korisnik u : this.listaKorisnika)
                if (uuid.compareTo(u.getuuid()) == 0) {

                    nonUnique = true;
                    break;

                }

        } while (nonUnique);

        return uuid;

    }

    public String genidRacuna() {

        // inits
        String uuid;
        Random rng = new Random();
        int duzina = 8;
        boolean nonUnique;

        // petlja generise dok se ne generise jedinstven uuid
        do {

            // generisanje uuid-a
            uuid = "";
            for (int i = 0; i < duzina; i++) {
                uuid += ((Integer) rng.nextInt(10)).toString();
            }

            // provjera da li je uuid jedinstven
            nonUnique = false;
            for (Racun a : this.racuniKorisnika)
                if (uuid.compareTo(a.getuuid()) == 0) {

                    nonUnique = true;
                    break;

                }

        } while (nonUnique);

        return uuid;

    }


    public void dodajRacun(Racun krRacun) {
        this.racuniKorisnika.add(krRacun);
    }


    public Korisnik dodajKorisnika(String imeKorisnika, String prezimeKorisnika, String pin) {

        Korisnik noviKorisnik;
        noviKorisnik = new Korisnik(imeKorisnika, prezimeKorisnika, pin, this);
        // kreiranje stednog racuna
        Racun noviRacun = new Racun("Štedni racun", noviKorisnik, this);
        this.listaKorisnika.add(noviKorisnik);


        // dodavanje racuna vlasniku racuna i objektu banke
        this.dodajRacun(noviRacun);
        noviKorisnik.dodajRacun(noviRacun);


        return noviKorisnik;
    }

    public Korisnik korLogin(String uuidKorisnika, String pin) {

        // pretrazivanje liste korisnika
        for (Korisnik u : this.listaKorisnika) {

            // provjera id-a korisnika
            if (u.getuuid().compareTo(uuidKorisnika) == 0 && u.validatePin(pin)) {
                return u;
            }

        }
        // ako korisnik nije pronadjen ili pin nije ispravan
        return null;
    }

    public String getName(){
        return this.imeBanke;
    }
}