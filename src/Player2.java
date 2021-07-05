public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name, String Weapon , int health , boolean armour ){
        /*Super():-THIS METHOD SHOWS THAT, THE VARIABLES ARE NOT OF THE PRESENT CLASS, THEY ARE EXTENDED FROMS SOME ANOTHER CLASS.*/
        super(name,Weapon,health);  // As, we are extending it from Player1, so we are storing the value of the player 1 to player 2. It is done with the help of super keyword.
        this.health=health;
        this.armour=armour;
    }

    @Override
    public void damageByGun1() {
        if (armour) {
            this.health=this.health-20;
            if (this.health<=0){
                this.health=0;
            }
            System.out.println("!!!ARMOUR IS ON!!!\n"+
                    "HITTED BY GUN-1\n"+
                    "HEALTH LEVEL:-"+ this.health );
        }
        if(!armour) {
            this.health = this.health - 30;
            if (this.health<=0){
                this.health=0;
            }
            System.out.println("!!!ARMOUR IS ON!!!\n"+
                    "HITTED BY GUN-1\n"+
                    "HEALTH LEVEL:-"+ this.health );
        }
        if(this.health==0){
            System.out.println(getName()+" "+"is Died!!!");
        }

    }

    @Override
    public void damageByGun2() {

    }
}
