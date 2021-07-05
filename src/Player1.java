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
        if (this.health<=0){
            this.health=0;
        }
        System.out.println("!! HITTED BY GUN-1" +
                "HEALTH -30\n"+
        "#-HEALTH LEFT-#-"+this.health);
    }
    public void damageByGun2(){

    }
}
