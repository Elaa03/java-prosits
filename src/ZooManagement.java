import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        /* ====================== Prosit 1 ====================== */

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


        /* ====================== Prosit 2 ====================== */


        // Instruction 5
        Animal lion = new Animal();
        lion.family = "Félidé";
        lion.name = "Lion";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Parc Animalier";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 20;

        System.out.println("Zoo : " + myZoo.name + " à " + myZoo.city);
        System.out.println("Animal : " + lion.name + " (" + lion.family + ")");


        // Instruction 6 & 7
        Animal tiger = new Animal("Félidé", "Tiger", 4, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);
        Animal parrot = new Animal("Psittacidae", "Parrot", 2, false);

        Zoo myZoo1 = new Zoo("SafariLand", "Tunis", 25);

        System.out.println("Animal créé : " + tiger);
        System.out.println("Animal créé : " + crocodile);
        System.out.println("Animal créé : " + parrot);
        System.out.println("Zoo créé : " + myZoo1);


        // Instruction 8
        myZoo1.displayZoo();


        System.out.println(myZoo1);
        System.out.println(myZoo1.toString());

        sc.close();
    }
}
