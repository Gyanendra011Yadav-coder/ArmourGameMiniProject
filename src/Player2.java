public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name, String Weapon , int health , boolean armour ){
        super(name,Weapon,health);  // As, we are extending it from Player1, so we are storing the value of the player 1 to player 2. It is done with the help of super keyword.
        this.health=health;
        this.armour=armour;

    }
}
