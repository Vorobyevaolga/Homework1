public class Main {
    public static void main(String[] args) {
        Author tolstoj = new Author("Лев", "Толстой", 1828);
        Author pushkin = new Author("Александр", "Пушкин", 1799);
        System.out.println("Автор 1 = " + tolstoj.getName() + " " + tolstoj.getLastNameName() + " " + "год рождения" + " " + tolstoj.getage());
        System.out.println("Автор 2 = " + pushkin.getName() + " " + pushkin.getLastNameName() + " " + "год рождения" + " " + pushkin.getage());
        Book ViM = new Book("Войнаи мир", tolstoj, 1867);
        Book KD = new Book("Капитанская дочь", pushkin, 1836);
        System.out.println("Книга1 = " + ViM.getNameBook() + " " + ViM.getyearBook());
        System.out.println("Книга2 = " + KD.getNameBook() + " " + KD.getyearBook());
        ViM.setYearBooke(1890);
        System.out.println("Книга1_1 = " + ViM.getNameBook() + " " + ViM.getyearBook());
    }
}