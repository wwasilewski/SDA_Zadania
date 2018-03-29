package Programowanie1.tydzien4.sobota.enumy;

public enum CountryDirectionalNumber {
    Polska("+48") {
        @Override
        public boolean IsInEurope() {
            return true;
        }
    },
    Niemcy("+49");

    private String directional;

    CountryDirectionalNumber(String directional) {
        this.directional = directional;
    }

    public boolean IsInEurope() {
        return false;
    }
}
