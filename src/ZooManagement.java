import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        //Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages.");


        //Instruction 2
        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez entrer le nom du zoo : ");
        String inputZooName = sc.nextLine();
        while (inputZooName.trim().isEmpty()) {
            System.out.print("Erreur : le nom du zoo ne doit pas être vide. Réessayez : ");
            inputZooName = sc.nextLine();
        }
        zooName = inputZooName;

        System.out.print("Veuillez entrer le nombre de cages : ");
        while (!sc.hasNextInt()) {
            System.out.print("Erreur : veuillez entrer un nombre entier positif : ");
            sc.next();
        }
        int inputNbrCages = sc.nextInt();
        while (inputNbrCages <= 0) {
            System.out.print("Erreur : le nombre de cages doit être positif. Réessayez : ");
            inputNbrCages = sc.nextInt();
        }
        nbrCages = inputNbrCages;


        //Instruction 3
        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        sc.close();
    }
}
