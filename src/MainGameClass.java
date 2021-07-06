import java.util.Scanner;

public class MainGameClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("||==>>Welcome To Armour Game<<==||");
        System.out.println("ENTER THE NAME OF PLAYER 1st:");
        String playerName1 = sc.nextLine();
        System.out.println("ENTER THE NAME OF PLAYER 2nd:");
        String playerName2 = sc.nextLine();
        System.out.println("Hello,==>>" + playerName1 + " " + ",&," + playerName2 + "\n" +
                "Armour Game Welcomes You, Whole Heartedly\n" +
                "So,Let's Rolling In To Game=====!!!!!!");
        System.out.println("It's Player 1st Chance To Select:-");
        System.out.println("DO YOU WANT TO USE GUN TYPE-01 oR GUN TYPE-02: **type 1 or 2**");
        int gunType = sc.nextInt();
        if (gunType == 1){
            System.out.println("CHOOSE GUN FROM THE LIST OF THE TYPE-01:\n" +
                    "1.ump-19\n" +
                    "2.Scar-L\n" +
                    "3.M416\n" +
                    "4.Pistol");
        int gun = sc.nextInt();
    }else{
            System.out.println("CHOOSE GUN FROM THE LIST TYPE-02:\n" +
                    "1.AWM\n" +
                    "2.SNIPPER\n" +
                    "3.GORILLA\n" +
                    "4.GIANT SNIPPER\n");
            int gun = sc.nextInt();
        }
        System.out.println();
        System.out.println();
        System.out.println("CHOOSE EQUIPMENTS FOR PLAYER-2:");


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
