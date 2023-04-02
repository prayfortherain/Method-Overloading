public class Reader {
    private String name;
    public int cardNumber;
    public String faculty;
    public String dateOfBirth;
    public String phoneNumber;

    public Reader(String name, int cardNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(name + " взял " + count + " книги");
    }

    public void takeBook(String... books) {
        StringBuilder sb = new StringBuilder();
        for (String book : books) {
            sb.append(book).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(name + " взял книги: " + sb);
    }

    public void returnBook(int count) {
        System.out.println(name + " вернул " + count + " книги");
    }

    public void returnBook(String... books) {
        StringBuilder sb = new StringBuilder();
        for (String book : books) {
            sb.append(book).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length());
        System.out.println(name + " вернул книги: " + sb);
    }

    public static void main(String[] args) {
        Reader[] readers = new Reader[5];
        readers[0] = new Reader("Иванов И.И.", 123, "Физика", "01.01.1990", "123-45-67");
        readers[1] = new Reader("Петров В.В.", 234, "Математика", "02.02.1991", "234-56-78");
        readers[2] = new Reader("Сидоров А.А.", 345, "Химия", "03.03.1992", "345-67-89");
        readers[3] = new Reader("Николаев Е.Е.", 456, "Биология", "04.04.1993", "456-78-90");
        readers[4] = new Reader("Кузнецов Д.Д.", 567, "Информатика", "05.05.1994", "567-89-01");

        readers[0].takeBook(2);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].returnBook(1);
        readers[3].returnBook("Рассказы", "Стихи");
    }
}