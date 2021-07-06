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
        int gun1=0;
        if (gunType == 1){
            System.out.println("CHOOSE GUN FROM THE LIST OF THE TYPE-01:\n" +
                    "1.ump-19\n" +
                    "2.Scar-L\n" +
                    "3.M416\n" +
                    "4.Pistol");
        gun1 = sc.nextInt();
    }else{
            System.out.println("CHOOSE GUN FROM THE LIST TYPE-02:\n" +
                    "1.AWM\n" +
                    "2.SNIPPER\n" +
                    "3.GORILLA\n" +
                    "4.GIANT SNIPPER\n");
            gun1 = sc.nextInt();
        }
        String gunName = null;
        if (gunType==1 && gun1==1){
            gunName="ump-19";
        }else if (gunType==1 && gun1==2){
            gunName="Scar-L";
        }else if (gunType==1 && gun1==3){
            gunName="M416";
        }else if (gunType==1 && gun1==4){
            gunName="Pistol";
        }else if (gunType==2 && gun1==1){
            gunName="AWM";
        }else if (gunType==2 && gun1==2){
            gunName="SNIPPER";
        }else if (gunType==2 && gun1==3){
            gunName="GORILLA";
        }else if (gunType==2 && gun1==4){
            gunName="GIANT SNIPPER";
        }else {
            System.out.println("TYPE MISMATCH");
        }
        Player1 player = new Player1(playerName1,gunName,100);
        System.out.println("HEALTH OF PLAYER-1 IS:-"+player.getHealth());

        System.out.println();
        System.out.println();
        System.out.println("CHOOSE EQUIPMENTS FOR PLAYER-2:");
        System.out.println("DO YOU WANT TO USE GUN TYPE-01 oR GUN TYPE-02: **type 1 or 2**");
        int gunType2 = sc.nextInt();
        int gun2=0;
        if (gunType2 == 1){
            System.out.println("CHOOSE GUN FROM THE LIST OF THE TYPE-01:\n" +
                    "1.ump-19\n" +
                    "2.Scar-L\n" +
                    "3.M416\n" +
                    "4.Pistol");
             gun2 = sc.nextInt();
        }else{
            System.out.println("CHOOSE GUN FROM THE LIST TYPE-02:\n" +
                    "1.AWM\n" +
                    "2.SNIPPER\n" +
                    "3.GORILLA\n" +
                    "4.GIANT SNIPPER\n");
             gun2 = sc.nextInt();
        }
        System.out.println("PLAYER-2,HAS ONE EXTRA FEATURE THAN PLAYER-01, OF ARMOUR:-\n" +
                "DO YOU WANT TO ON IT:-**true or false**");
        boolean armourOnOff=sc.nextBoolean();
        String gunName2 = null;

        if (gunType2==1 && gun2==1){
            gunName="ump-19";
        }else if (gunType2==1 && gun2==2){
            gunName="Scar-L";
        }else if (gunType2==1 && gun2==3){
            gunName="M416";
        }else if (gunType2==1 && gun2==4){
            gunName="Pistol";
        }else if (gunType2==2 && gun2==1){
            gunName="AWM";
        }else if (gunType2==2 && gun2==2){
            gunName="SNIPPER";
        }else if (gunType2==2 && gun2==3){
            gunName="GORILLA";
        }else if (gunType2==2 && gun2==4){
            gunName="GIANT SNIPPER";
        }else {
            System.out.println("TYPE MISMATCH");
        }
        Player2 player2 = new Player2("John",gunName,100,armourOnOff);
        System.out.println("HEALTH LEVEL OF THE PLAYER-2 IS"+player2.getHealth());

    }
}
