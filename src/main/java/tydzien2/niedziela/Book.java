package tydzien2.niedziela;

public class Book
{
    String authorName;
    String title;

    public Book(String authorName, String title)
    {
        this.authorName = authorName;
        this.title = title;
    }

    public String getauthorName() {
        return authorName;
    }

    public void setauthorName(String name) {
        this.authorName = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
