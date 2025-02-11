//Необходимо вывести все положительные степени числа 5 до тех пор,
//пока результат возведения в степень меньше 100000, вывести результат возведения в степень.

public class Less42 {
    public static void main(String[] args) {

        int a = 5;
        int b = 1;
        while (Math.pow(a, b) < 100000) {
            System.out.println("5 в степени " + b + "= " + Math.pow(a, b));

            b++; // a = a + 1 or a += 1
        }

//        int a;
//        int b=1;
//        for (a = 5; Math.pow(a, b) < 100000; b++)
//            System.out.println(b);
    }
}
//delaem PR