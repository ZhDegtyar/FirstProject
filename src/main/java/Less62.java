//Дана строка:
//String s = “Перевыборы выбранного президента”;
//необходимо подсчитать количество букв “е” в строке.
//Для указанной строки ответ будет 4.

public class Less62 {
    public static void main(String[] args) {
        String str = "Перевыборы выбранного президента";
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            // Классический способ итерации символов строки.
            if (str.charAt(i) == 'е') {
                k = k + 1;
            }
        }
        System.out.println(k);
    }
}
