public class Hero extends Creature{
    private String name;
    private String character;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Hero(String creatureType, int hitPoints, int attackPoints, int gold, String name, String character) {
        super(creatureType, hitPoints, attackPoints, gold);
        this.name = name;
        this.character = character;
    }

    @Override
    public String defends(int ap) {
        return this.name + " the " +  this.character + " " + super.defends(ap);
    }//end defends()


    public String toString() {
        String myReturn = this.getClassName();
        myReturn += " [name=" + this.name;
        myReturn += ", character=" + this.character;
        myReturn += ", hitPoints=" + this.getHitPoints();
        myReturn += ", attackPoints=" + this.getAttackPoints();
        myReturn += ", gold=" + this.gold;
        myReturn += ", alive=" + this.alive + "]";
        return myReturn;
    }//end toString()



}
