import java.util.Date;

public class Transakcija {

    // kolicina transakcije
    private double kolicina;

    // vrijeme obavljene transakcije
    private Date vrijemeTransakcije;

    // biljeske/memo transakcije
    private String biljeske;

    // racun na kojem je izvrsena transakcija
    private Racun racun;

    public Transakcija(double kolicina, Racun racun){

        this.kolicina = kolicina;
        this.racun = racun;
        this.vrijemeTransakcije = new Date();
        this.biljeske = "";

    }

    public Transakcija(double kolicina, String biljeske, Racun racun){

        // pozivanje 2-arg konstruktora prije svega (preuzimaju vrijednosti prethodnog Transakcija
        this(kolicina, racun);

        this.biljeske = biljeske;
    }

    public double getAmount(){

        return this.kolicina;
    }

    public String getSummaryLine(){

        if(this.kolicina >= 0){
            return String.format("%s : $%.02f : %s", this.vrijemeTransakcije.toString(),
                    this.kolicina, this.biljeske);
        } else {
            return String.format("%s : $%.02f : %s", this.vrijemeTransakcije.toString(),
                    this.kolicina, this.biljeske);
        }
    }


}
