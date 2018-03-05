package tydzien2.sobota.kompozycje.silnik;

public interface Silnik
{
    void dajGazu(int stopien);
    void puscGaz(int stopien);
    int pobierzObroty();
}
