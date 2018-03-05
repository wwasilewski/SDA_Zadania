package tydzien2.niedziela.zadania.OOP;

public class Person {

    String name;
    String surname;
    int age;
    Address address;

    public Person() {
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void introduce() {
        System.out.println(name + " " + surname);
    }

    public static void main(String[] args) {

        Person person = new Person("tomasz", "maj", 18);
        person.introduce();
        Address adres = new Address("add","adad", "ddad",13,15);
        System.out.println(adres.city + adres.homeNO);
    }
}
