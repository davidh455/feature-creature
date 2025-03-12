import java.io.*;
import java.lang.Thread;
public class Game {
    public static void fight(Entity entity,Hero myHero) throws InterruptedException {
        boolean gameOn = true; //continue until someone's dead
        int counter = 0;

        while (gameOn) {

            if(entity instanceof Elemental){
               Elemental elemental = Elemental.class.cast(entity);
                if(elemental.disappears()) {//see if elemental disappears
                    System.out.println("The " + elemental.getType() + " has disappeared! \n");
                }else {//elemental attacks!
                    String output = myHero.defends(elemental.attacks());
                    System.out.println(output);
                }

                if (!myHero.isAlive()) {//game over!
                    gameOn = false;
                    break;
                }
            }else{
                Monster myMonster = Monster.class.cast(entity);
                if (counter % 2 == 0) {// hero attacks
                    System.out.println(myMonster.defends(myHero.attacks()));
                } else {// monster attacks
                    System.out.println(myHero.defends(myMonster.attacks()));
                }// end of counter


                if(!myMonster.isAlive() || !myHero.isAlive()){// somebody's dead, game over

                    if(myHero.isAlive()) {//time for gold!
                        myHero.setGold(myHero.getGold() + myMonster.getGold());
                        String output = "Our Hero " + myHero.getName() + " got " + myMonster.getGold() + " gold and now has a total of " + myHero.getGold() + " gold.";
                        System.out.println(output);
                    }

                    gameOn = false;
                    break;
                }
            }
            counter++;
            Thread.sleep(1000);
        }
    }//end fight()
}//end Game class
