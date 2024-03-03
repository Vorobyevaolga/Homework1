public class Main {
    public static void main(String[] args) {
        Author tolstoj = new Author("Лев", "Толстой");
        Author pushkin = new Author("Александр", "Пушкин");
        System.out.println("Автор 1 = " + tolstoj.getName() + " " + tolstoj.getLastNameName());
        System.out.println("Автор 2 = " + pushkin.getName() + " " + pushkin.getLastNameName());
        Book viM = new Book("Война и мир", tolstoj, 1867);
        Book kD = new Book("Капитанская дочь", pushkin, 1836);
        System.out.println("Книга1 = " + viM.getNameBook() + " " + viM.getYearBook());
        System.out.println("Книга2 = " + kD.getNameBook() + " " + kD.getYearBook());
        viM.setYearBooke(1890);
        System.out.println("Книга1_1 = " + viM.getNameBook() + " " + viM.getYearBook());
    }
}