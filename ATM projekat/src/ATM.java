import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Banka banka = new Banka("Moja banka");

        // dodavanje korisnika, usput se kreira i stedni racun
        Korisnik nKorisnik;
        nKorisnik = banka.dodajKorisnika("Levi", "Ackerman", "1234");

        // dodavanje tekuceg racuna
        Racun noviRacun = new Racun("Tekući racun", nKorisnik, banka);
        nKorisnik.dodajRacun(noviRacun);
        banka.dodajRacun(noviRacun);

        Korisnik trKorisnik;
        while (true){

            // loop dok login ne bude uspjesan
            trKorisnik = ATM.mainMenuPrompt(banka, sc);

            // main menu ce ostati dok korisnik ne izadje iz programa
            ATM.printUserMenu(trKorisnik, sc);

        }


    }

    // static jer nemamo podataka u ATM klasi
    public static Korisnik mainMenuPrompt(Banka banka, Scanner sc) {

        String idKorisnika;
        String pin;
        Korisnik authUser;

        // trazenje id/pin kombinacije dok se ne nadje
        do {

            System.out.printf("\nDobrodošli u %s! ", banka.getName());
            System.out.printf("\nUnesite korisnički ID: ");
            idKorisnika = sc.nextLine();
            System.out.print("Unesite pin: ");
            pin = sc.nextLine();

            authUser = banka.korLogin(idKorisnika, pin);
            if(authUser == null){

                System.out.println("Netačna kombinacija, molimo vas pokušajte ponovo. ");
            }

        } while(authUser == null); // loop se nastavlja dok se korisnik ne uloguje

        return authUser;

    }

    public static void printUserMenu(Korisnik korisnik, Scanner sc) {

        // ispisivaje detalja korisnickog racuna
        korisnik.printAccountsSummary();

        int choice;

        do {
            System.out.printf("Dobrodošao/la %s, šta želite? \n", korisnik.getFirstName());
            System.out.println(" 1) Prikaži istoriju transakcija. ");
            System.out.println(" 2) Isplata novca. ");
            System.out.println(" 3) Depozit novca. ");
            System.out.println(" 4) Transfer novca. ");
            System.out.println(" 5) Izađi. ");
            System.out.println();
            System.out.println("Unesi odluku: ");
            choice = sc.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("Greška u odabiru. Molimo vas izaberite 1-5.");
            }

        } while (choice < 1 || choice > 5);

        switch (choice){

            case 1:
                ATM.showTransHistory(korisnik, sc);
                break;
            case 2:
                ATM.withdrawFunds(korisnik, sc);
                break;
            case 3:
                ATM.depositFunds(korisnik, sc);
                break;
            case 4:
                ATM.transferFunds(korisnik, sc);
                break;
        }

        // prikazi meni dok korisnik ne izabere da izadje iz menija
        if (choice != 5){
            ATM.printUserMenu(korisnik, sc);

        }
    }

    public static void showTransHistory(Korisnik korisnik, Scanner sc){

        int racun;

        // odabiranje racuna ciju istoriju transakcija zelimo
        do{
            System.out.printf("Unesite broj (1-%d) " + "čije transakcije želite da vidite: ", korisnik.ukbrRacuna());

            racun = sc.nextInt()-1;
            if (racun < 0 || racun >= korisnik.ukbrRacuna()){
                System.out.println("Nepostojeći račun. Pokušajte ponovo. ");
            }

        } while (racun < 0 || racun >= korisnik.ukbrRacuna());

            korisnik.printAcctTransHistory(racun);
    }

    public static void transferFunds(Korisnik korisnik, Scanner sc){

        int fromAcct;
        int toAcct;
        double kolicina;
        double acctBal;

        do{
            System.out.printf("Unesite broj (1-%d) računa sa kojeg želite poslati novac: ", korisnik.ukbrRacuna());
            fromAcct = sc.nextInt()-1;
            if(fromAcct < 0 || fromAcct >= korisnik.ukbrRacuna()){
                System.out.println("Nepostojeći racun. Pokušajte ponovo. ");
            }
        } while (fromAcct < 0 || fromAcct >= korisnik.ukbrRacuna());
        acctBal = korisnik.getAcctBalance(fromAcct);

        do{
            System.out.printf("Unesite broj (1-%d) računa na koji želite poslati novac: ", korisnik.ukbrRacuna());
            toAcct = sc.nextInt()-1;
            if(toAcct < 0 || toAcct >= korisnik.ukbrRacuna()){
                System.out.println("Nepostojeći racun. Pokušajte ponovo. ");
            }
        } while (toAcct < 0 || toAcct >= korisnik.ukbrRacuna());

        do{
            System.out.printf("Unesite količinu novca koju želite poslati (max $%.02f): $", acctBal);
            kolicina = sc.nextDouble();
            if (kolicina < 0){
                System.out.println("Količina novca koju šaljete mora biti veća od 0! ");
            } else if (kolicina > acctBal){
                System.out.println("Količina novca ne smije biti veća od količine novca koju posjedujete! ");
            }
        } while (kolicina < 0 || kolicina > acctBal);

        korisnik.addAcctTransaction(fromAcct, -1*kolicina, String.format("Transfer na račun %s", korisnik.getAcctUUID(toAcct)));

        korisnik.addAcctTransaction(toAcct, kolicina, String.format("Transfer na račun %s", korisnik.getAcctUUID(fromAcct)));

    }

    public static void withdrawFunds(Korisnik korisnik, Scanner sc){

        int fromAcct;
        double kolicina;
        double acctBal;
        String biljeske;

        do{
            System.out.printf("Unesite broj (1-%d) računa sa kojeg želite podići novac: ", korisnik.ukbrRacuna());
            fromAcct = sc.nextInt()-1;
            if(fromAcct < 0 || fromAcct >= korisnik.ukbrRacuna()){
                System.out.println("Nepostojeći račun. Pokušajte ponovo. ");
            }
        } while (fromAcct < 0 || fromAcct >= korisnik.ukbrRacuna());
        acctBal = korisnik.getAcctBalance(fromAcct);

        do{
            System.out.printf("Unesite količinu novca koju želite podići (max $%.02f): $", acctBal);
            kolicina = sc.nextDouble();
            if (kolicina < 0){
                System.out.println("Količina novca koju želite podići mora biti veća od 0! ");
            } else if (kolicina > acctBal){
                System.out.println("Količina novca koju želite podići ne smije biti veća od količine novca koju posjedujete! ");
            }
        } while (kolicina < 0 || kolicina > acctBal);

        sc.nextLine();

        System.out.println("Unesi bilješke: ");
        biljeske = sc.nextLine();

        korisnik.addAcctTransaction(fromAcct, -1*kolicina, biljeske);

    }

    public static void depositFunds(Korisnik korisnik, Scanner sc){

        int toAcct;
        double kolicina;
        double acctBal;
        String biljeske;

        do{
            System.out.printf("Unesite broj (1-%d) računa na koji želite položiti novac: ", korisnik.ukbrRacuna());
            toAcct = sc.nextInt()-1;
            if(toAcct < 0 || toAcct >= korisnik.ukbrRacuna()){
                System.out.println("Nepostojeći račun. Pokušajte ponovo. ");
            }
        } while (toAcct < 0 || toAcct >= korisnik.ukbrRacuna());
        acctBal = korisnik.getAcctBalance(toAcct);

        do{
            System.out.println("Unesite količinu novca koju želite položiti: ");
            kolicina = sc.nextDouble();
            if (kolicina < 0){
                System.out.println("Količina novca koju šaljete mora biti veća od 0! ");
        } }while (kolicina < 0);

        sc.nextLine();

        System.out.println("Unesi bilješke: ");
        biljeske = sc.nextLine();

        korisnik.addAcctTransaction(toAcct, kolicina, biljeske);

    }
}
