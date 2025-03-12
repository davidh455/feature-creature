//David Hoang
import java.io.*;
import java.lang.Thread;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        // This is for the creature feature part
//        Creature creature = new Creature("Dragon", 40, 10, 200);
//        Hero hero = new Hero("Hero", 20, 5, 0, "Conan", "Barbarian");
//        Monster monster = new Monster("Monster", 40, 10, 500, "Chaotic");
//        System.out.println(creature);
//        System.out.println(hero);
//        System.out.println(monster);

        // This is the attack stuff
//        Hero myHero = new Hero("Hero",23,7,0,"Conan", "Barbarian");
//        Monster myMonster = new Monster("Dragon",30,5,500,"fierce");
//        Game.fight(myMonster, myHero);


        Hero myHero = new Hero("Hero",23,5,0,"Conan","Barbarian");

        ArrayList<Entity> entities = new ArrayList<Entity>();

        entities.add(new Monster("Imp",10,5,2,"timid"));
        entities.add(new Elemental("Salamander",2));
        entities.add(new Monster("Dragon",100,10,4,"fierce"));

        for (Entity entity : entities) {
            Game.fight(entity, myHero);
        }

    }
}
