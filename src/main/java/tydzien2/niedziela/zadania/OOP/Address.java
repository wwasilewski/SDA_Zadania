package tydzien2.niedziela.zadania.OOP;

public class Address {
    String street;
    String city;
    String country;
    int flatNO;
    int homeNO;

    public Address(String street, String city, String country, int flatNO, int homeNO) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.flatNO = flatNO;
        this.homeNO = homeNO;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFlatNO() {
        return flatNO;
    }

    public void setFlatNO(int flatNO) {
        this.flatNO = flatNO;
    }

    public int getHomeNO() {
        return homeNO;
    }

    public void setHomeNO(int homeNO) {
        this.homeNO = homeNO;
    }
}
