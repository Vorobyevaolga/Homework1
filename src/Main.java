public class Main {
    public static void main(String[] args) {
        var b1=78.2; //Масса одного боксера — 78.2 кг
        var b2=82.7; //Масса второго боксера — 82.7 кг
        System.out.println("Масса первого бойца:  " + b1 + " кг");
        System.out.println("Масса второго бойца:  "+b2+" кг");
        var m=b1+b2;
        System.out.println("Общий вес: "+m+" кг");
        m=b2-b1;
        System.out.println("7,1 Разница в весе: "+m+" кг");
        m=b2%b1;
        System.out.println("7,2 Разница в весе: "+m+" кг");
    }
}
