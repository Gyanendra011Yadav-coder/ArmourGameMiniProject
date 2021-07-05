public class Player1 {
    private String name;
    private String weapons;
    private int health;

    public Player1(String name, String weaponName , int health){
        this.name=name;
        this.weapons=weaponName;
        this.health=health;
    }

    public void damageByGun1(){
        this.health=30;

    }
}
