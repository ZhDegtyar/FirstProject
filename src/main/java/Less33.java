//Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
//больше 10 - если переменная больше 10
//меньше 100 - если переменная меньше 100
//результат деления на 2 больше 20 - если это соответствует истине
//значение переменной между 5 и 40 включительно - если это правда
//значение переменной меньше 5 или больше 40 - если предыдущие условие ложное


public class Less33 {
    public static void main(String[] args) {
        int a = 4;
        if (a > 10) {
            System.out.println("a больше 10");
        }
        if (a < 100) {
            System.out.println("a меньше 100");
        }
        if (a / 2.0 > 20) {                             //делим на 2.0 чтобы 20.5 например было > 20
            System.out.println("результат деления a на 2 больше 20");
        }
        if (5 <= a && a <= 40) {
            System.out.println("значение a между 5 и 40 включительно");
        } else {
        //if (5 > a || a > 40) {
            System.out.println("значение переменной a меньше 5 или больше 40");

        }
    }
}