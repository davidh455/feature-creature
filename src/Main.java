public class Main {
    public static void main(String[] args) {
        Creature creature = new Creature("Dragon", 40, 10, 200);
        Hero hero = new Hero("Hero", 20, 5, 0, "Conan", "Barbarian");
        Monster monster = new Monster("Monster", 40, 10, 500, "Chaotic");
        System.out.println(creature);
        System.out.println(hero);
        System.out.println(monster);
    }
}
