public class Player1 {
    private String name;
    private String weapons;
    private int health;

    public Player1(String name, String weaponName , int Health){
        this.name=name;
        this.weapons=weaponName;

        if(Health<0 || Health >100){
            this.health=100;
        }else this.health=Health;
    }

    public void damageByGun1(){
        this.health=this.health-30;
        if (this.health<=0){
            this.health=0;
        }
        System.out.println("!! HIT  BY GUN-1 HEALTH REDUCES BY 30 !!!\n"+
        "#-HEALTH LEFT-#-"+this.health);

        if (this.health==0){
            System.out.println(getName()+" "+"IS,PLAYER1 DIED.");
        }
    }
    public void damageByGun2(){
        this.health=this.health-50;
        if (this.health<=0){
            System.out.println("!! HIT  BY GUN-2" +
                    "HEALTH -50\n"+
                    "#-HEALTH LEFT-#-"+this.health);
            if (this.health==0){
                System.out.println(getName()+" "+"IS,Player Died");
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapons() {
        return weapons;
    }

    public void setWeapons(String weapons) {
        this.weapons = weapons;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
