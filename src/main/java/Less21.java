public class Less21 {
    public static void main(String[] args) {
        int a = 7;
        int b = 88;


        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a * 1.0 /b));
        System.out.println("a % b = " + (a % b)); //остаток от деления
        System.out.println("b - " +  (b % 2 == 0 ? "Число четное" : "Число нечетное")); //тернарный оператор
        System.out.println("a - " + (a % 2 == 0 ? "Число четное" : "Число нечетное")); //тернарный оператор

    }
}
