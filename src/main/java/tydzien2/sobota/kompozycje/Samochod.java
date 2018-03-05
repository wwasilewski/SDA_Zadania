package tydzien2.sobota.kompozycje;

import tydzien2.sobota.kompozycje.silnik.Silnik;

public class Samochod
{
    private Silnik silnik;
    private SkrzyniaBiegow skrzyniaBiegow;
    private Sprzeglo sprzeglo;

    public Samochod(Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, Sprzeglo sprzeglo)
    {
        this.silnik = silnik;
        this.skrzyniaBiegow = skrzyniaBiegow;
        this.sprzeglo = sprzeglo;
    }

    public void jedzDoPrzodu()
    {
        sprzeglo.wcisnijSprzeglo();
        skrzyniaBiegow.zwiekszBieg();
        sprzeglo.puscSprzeglo();
        silnik.dajGazu(20);
    //    silnik.dajGazu();
    }

    public void jedzDoTylu()
    {

    }

   // private void przyspiesz();
}
