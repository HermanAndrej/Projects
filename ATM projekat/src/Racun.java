import java.util.ArrayList;

public class Racun {

    // ime racuna
    private String imeRacuna;

    // id racuna
    private String uuidRacuna;

    // vlasnik racuna
    private Korisnik vlasnikRacuna;

    // lista transakcija
    private ArrayList<Transakcija> transakcije;

    // kreiranje racuna:
    public Racun(String imeRacuna, Korisnik vlasnikRacuna, Banka banka){

        // postavljanje imena i vlasnika racuna
        this.imeRacuna = imeRacuna;
        this.vlasnikRacuna = vlasnikRacuna;

        // dobijanje uuid-a novog naloga
        this.uuidRacuna = banka.genidRacuna();

        // stvaranje liste transakcija
        this.transakcije = new ArrayList<Transakcija>();

    }

    // getter za funkciju
    public String getuuid(){
        return this.uuidRacuna;
    }

    public String getSummaryLine(){

        double stanjeRacuna = this.getBalance();

        // formatiranje summary line ako je stanje racuna negativno
        if (stanjeRacuna >= 0) {
            return String.format("%s : $%.02f : %s" + "\n", this.uuidRacuna, stanjeRacuna, this.imeRacuna);
        } else {
            return String.format("%s : $(%.02f) : %s", this.uuidRacuna, stanjeRacuna, this.imeRacuna);
        }

    }

    public double getBalance(){

        double stanjeRacuna = 0;
        for (Transakcija t : this.transakcije){
            stanjeRacuna += t.getAmount();
        }
        return stanjeRacuna;
    }

    public void printTransHistory(){

        System.out.printf("Lista transakcija za račun %s:\n", this.uuidRacuna);
        for (int t = this.transakcije.size()-1; t >= 0; t--){
            System.out.printf(this.transakcije.get(t).getSummaryLine());
        }
        System.out.println();
    }

    public void addTransaction(double kolicina, String biljeske){

        Transakcija newTrans = new Transakcija(kolicina, biljeske, this);
        this.transakcije.add(newTrans);
    }

}
