//Дана строка:
//String s = “Посмотрите как Рите нравится ритм”;
//необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//Для указанной строки ответ будет 6, 15, 29.

public class Less63 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";

        String str = s.toLowerCase();
        int i = str.indexOf("рит");
        while (i > 1) {
            System.out.println(i);
            i = str.indexOf("рит", i+1);
        }
    }
}
