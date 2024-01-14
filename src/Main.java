public class Main {
    public static void main(String[] args) {
        Author tolstoj = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");
        System.out.println("Автор 1 = " + tolstoj.getName() + " " + tolstoj.getLastNameName() );
        System.out.println("Автор 2 = " + pushkin.getName() + " " + pushkin.getLastNameName() );
        Book ViM = new Book("Войнаи мир", tolstoj, 1867);
        Book KD = new Book("Капитанская дочь", pushkin, 1836);
        System.out.println("Книга1 = " + ViM.getNameBook() + " " + ViM.getyearBook());
        System.out.println("Книга2 = " + KD.getNameBook() + " " + KD.getyearBook());
        ViM.setYearBook(1890);
        System.out.println("Книга1_1 = " + ViM.getNameBook() + " " + ViM.getyearBook());
    }
}