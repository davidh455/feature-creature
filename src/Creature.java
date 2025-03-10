public class Creature {
    private String creatureType; //what is the nature of the creature, dragon, human, etc.
    private int hitPoints; //amount of damage a creature can withstand
    private int attackPoints; //how much damage creature could inflict
    private int gold; //material value of creature
    private boolean alive = true; //whether the creature is still alive or not

    public String getCreatureType() {
        return creatureType;
    }

    public void setCreatureType(String creatureType) {
        this.creatureType = creatureType;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Creature(String creatureType, int hitPoints, int attackPoints, int gold) {
        this.creatureType = creatureType;
        this.hitPoints = hitPoints;
        this.attackPoints = attackPoints;
        this.gold = gold;
    }//end constructor

    public String getClassName() {
        String str = this.getClass().toString();
        int num = str.lastIndexOf(" ");
        str = str.substring(num + 1);
        return str;
    }

    public String toString() {
        String myReturn = this.getClassName();
        myReturn += " [creatureType=" + this.creatureType;
        myReturn += ", hitPoints=" + this.hitPoints;
        myReturn += ", attackPoints=" + this.attackPoints;
        myReturn += ", gold=" + this.gold;
        myReturn += ", alive=" + this.alive + "]";
        return myReturn;
    }

}//end creature
