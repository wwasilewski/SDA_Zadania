//Utwórz obiekt Person posiadający pola: name, lastName, eyeColor i sex
//(F,M). Kolor oczu oraz płeć powinna być typu Enum. Utwórz odpowiedni zbiór
//wartości dla koloru oczu oraz płci. Utwórz kilka egzemplarzy obiektu Person i
//dodaj je do listy List<Person>. Wyświetl parametry każdej klasy Person za
//pomocą metody toString().

package Programowanie1.tydzien4.sobota.Zadania015.ex01;

import lombok.Getter;

@Getter
public enum EyeColor {
    Blue,
    Yellow,
    Green,
    Red
}
