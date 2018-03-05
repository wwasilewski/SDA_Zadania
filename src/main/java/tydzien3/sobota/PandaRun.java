package tydzien3.sobota;

public class PandaRun
{
    public static void main(String[] args) {
        Panda pandzia = new Panda();

        Boolean pandaIsValid = pandzia.sprawdzPande("panda");

        System.out.println(pandzia.sprawdzPande("pand"));
        System.out.println(pandaIsValid);

        String pattern = ".*(\\d{9})";
        String text = "Jan Kowalski 505434334";
        System.out.println(text.replaceAll(pattern,"$1"));
    }
}
