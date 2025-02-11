public class Less23 {
    public static void main(String[] args) {
        int cush = 200; //добыча пиратов
        int numteam = 9; //
        double ship = 0.5 * cush; //добыча владельца корабля
        double team = cush - ship; //добыча оставшейся команды
        double cap = 0.5 * team; //
        double cushteam = (team - cap) / (numteam+1);
        double cushcap = cap + cushteam + ship;


        double control = cushcap + cushteam * 9;

        System.out.println(cushteam);
        System.out.println(cushcap);
        System.out.println(control);


    }
}
