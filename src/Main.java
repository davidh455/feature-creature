//David Hoang
import java.io.*;
import java.lang.Thread;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        // This is for the creature feature part
//        Creature creature = new Creature("Dragon", 40, 10, 200);
//        Hero hero = new Hero("Hero", 20, 5, 0, "Conan", "Barbarian");
//        Monster monster = new Monster("Monster", 40, 10, 500, "Chaotic");
//        System.out.println(creature);
//        System.out.println(hero);
//        System.out.println(monster);

        Hero myHero = new Hero("Hero",23,7,0,"Conan", "Barbarian");
        Monster myMonster = new Monster("Dragon",30,5,500,"fierce");
        boolean gameOn = true; //continue until someone's dead

        while (gameOn) {
            if(!myMonster.isAlive() || !myHero.isAlive()){// somebody's dead, game over

                if(myHero.isAlive()) {//time for gold!
                    myHero.setGold(myHero.getGold() + myMonster.getGold());
                    String output = "Our Hero " + myHero.getName() + " got " + myMonster.getGold() + " gold and now has a total of " + myHero.getGold() + " gold.";
                    System.out.println(output);
                }


                gameOn = false;
                break;
            }else{
                System.out.println(myHero.defends(myMonster.attacks()));
                System.out.println(myMonster.defends(myHero.attacks()));
                Thread.sleep(1000);
            }
        }

    }
}
