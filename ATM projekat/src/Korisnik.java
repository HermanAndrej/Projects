import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.security.MessageDigest;

public class Korisnik {

    // ime korisnika
    private String imeKorisnika;

    // prezime korisnika
    private String prezimeKorisnika;

    // id korisnika
    private String uuidKorisnika;

    // hash pin broja korisnika
    private byte pinHash[];

    // lista racuna korisnika
    private ArrayList<Racun> racuniKorisnika;

    // kreiranje korisnika:
    public Korisnik(String imeKorisnika, String prezimeKorisnika, String pin, Banka banka){

        // imenovanje korisnika
        this.imeKorisnika = imeKorisnika;
        this.prezimeKorisnika = prezimeKorisnika;

        // pohranjivanje MD5 hasha za pin
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            this.pinHash = md.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error hash");
            e.printStackTrace();
            System.exit(1);
        }

        // generisanje id-a za korisnika
        this.uuidKorisnika = banka.genidKorisnika();

        // kreiranje prazne liste racuna
        this.racuniKorisnika = new ArrayList<Racun>();

        // log poruka
        System.out.format("Novi korisnik %s %s ID-a %s je kreiran. ", imeKorisnika, prezimeKorisnika, this.uuidKorisnika);

    }

    public void dodajRacun(Racun krRacun){
        this.racuniKorisnika.add(krRacun);

    }

    // getter za funkciju
    public String getuuid(){
        return this.uuidKorisnika;
    }

    public boolean validatePin(String aPin){

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
                    return MessageDigest.isEqual(md.digest(aPin.getBytes()), this.pinHash);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("error, caught NoSuchAlgorithmException");
            e.printStackTrace();
            System.exit(1);
        }

        return false;
    }

    public String getFirstName(){
        return this.imeKorisnika;

    }

    public void printAccountsSummary(){

        System.out.printf("Pregled računa korisnika %s: \n", this.imeKorisnika);
        for (int a = 0; a < this.racuniKorisnika.size(); a++){
            System.out.printf("%d) %s", a+1, this.racuniKorisnika.get(a).getSummaryLine());
        }
        System.out.println();

    }


    public int ukbrRacuna(){

        return this.racuniKorisnika.size();
    }

    public void printAcctTransHistory(int acctIdx){

        this.racuniKorisnika.get(acctIdx).printTransHistory();
    }

    public double getAcctBalance(int acctIdx) {
        return this.racuniKorisnika.get(acctIdx).getBalance();
    }

    public String getAcctUUID(int acctIdx) {
        return this.racuniKorisnika.get(acctIdx).getuuid();
    }

    public void addAcctTransaction(int acctIdx, double kolicina, String biljeske) {
        this.racuniKorisnika.get(acctIdx).addTransaction(kolicina, biljeske);
    }
}
