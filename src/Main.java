public class Main {
    public static void main(String[] args) {
        char[] reverseFullName = {'r', 'o', 'g', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}