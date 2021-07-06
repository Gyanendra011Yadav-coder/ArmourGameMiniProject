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
        System.out.println("!!!HITTED BY GUN-1 HEALTH REDUCES BY 30!!!\n"+
                "###=>HEALTH_LEFT<=###"+this.health);
        System.out.println();

        if (this.health<0){
            System.out.println(getName()+" "+",PLAYER1 DIED.");
            System.out.println();
        }
    }
    public void damageByGun2(){
        this.health-=50;
        if (this.health<=0) {
            System.out.println("!!! HIT  BY GUN-2 HEALTH REDUCED BY:50 !!!\n" +
                    "###=>HEALTH_LEFT<=###" + this.health);
            System.out.println();
        }
            if (this.health<0){
                System.out.println(getName()+" "+" ,is Died");
                System.out.println();
            }
        }
        public void heal(){
        if (this.health<=0){
            System.out.println("!!!"+getName()+"is Died"+"!!!");
            System.out.println();
        }else {
            this.health=100;
            System.out.println("HEALED SUCCESSFULL,HEALTH REACHES"+this.health);
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
