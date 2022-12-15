import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boss infoBoss = new Boss();
        infoBoss.setHealth(700);
        infoBoss.setDamage(50);
        infoBoss.setDefence("Magic");
        infoBoss.bossInfo();
        System.out.println("---------------------------");
        Hero[] printInfo = createHeroes();
        for (Hero hero: printInfo) {
            hero.infoOfHeroes();
        }

    }
    public static Hero[] createHeroes(){

        Hero[] heroes = {new Hero(350, 35),
                new Hero(300, 30, "Magic"),
                new Hero(250, 0, "Medic")};

        return heroes;
    }
}
