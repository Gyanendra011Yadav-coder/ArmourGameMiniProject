public class MainGameClass {
    public static void main(String[] args) {
        Player1 player = new Player1("Gyan","AWM",100);
//        System.out.println(player.getName());
//        System.out.println(player.getWeapons());
//        System.out.println(player.getHealth());
        player.damageByGun1();
        player.damageByGun2();
//        player.damageByGun2();
        player.heal();
//
//        Player2 player2 = new Player2("John","M416",50,false);
//        player2.damageByGun1();
//        player2.damageByGun2();
//        player2.damageByGun2();
    }
}
