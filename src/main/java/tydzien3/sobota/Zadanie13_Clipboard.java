//Przygotuj generyczną klasę Clipboard przechowującą obiekt typu T. Klasa powinna
//mieć metody insertIntoClipboard oraz getFromClipboard.

package tydzien3.sobota;

public class Zadanie13_Clipboard<T> {
    private T objectWithTypeT;

    public void insertIntoClipboard(T field) {
        this.objectWithTypeT = field;
    }

    public T getFromClipboard() {
        return objectWithTypeT;
    }
}
