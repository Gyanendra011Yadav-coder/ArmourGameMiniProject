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
        System.out.println("!! HITTED  BY GUN-1" +
                "HEALTH -30\n"+
        "#-HEALTH LEFT-#-"+this.health);

        if (this.health==0){
            System.out.println("PLAYER DIED.");
        }
    }
    public void damageByGun2(){
        this.health=50;
        if (this.health<=0){
            System.out.println("!! HITTED  BY GUN-2" +
                    "HEALTH -50\n"+
                    "#-HEALTH LEFT-#-"+this.health);
            if (this.health==0){
                System.out.println("Player Died");
            }
        }
    }
}
