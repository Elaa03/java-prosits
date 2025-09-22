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


        /* ====================== Prosit 3 ====================== */


        // Instruction 10
        myZoo1.addAnimal(tiger);
        myZoo1.addAnimal(crocodile);
        myZoo1.addAnimal(parrot);
        myZoo1.addAnimal(lion);
        boolean ajout = myZoo1.addAnimal(tiger);
        System.out.println("Ajout animal déjà existant : " + ajout);

        // Instruction 11
        myZoo1.displayAnimals();
        System.out.println("Index de Tiger : " + myZoo1.searchAnimal(tiger));
        Animal lion2 = new Animal("Félidé", "Lion", 5, true);
        System.out.println("Index de Lion2 : " + myZoo1.searchAnimal(lion2));

        // Instruction 13
        boolean suppr = myZoo1.removeAnimal(parrot);
        System.out.println("Suppression du perroquet : " + suppr);
        myZoo1.displayAnimals();

        // Instruction 15
        System.out.println("Le zoo est-il plein ? " + myZoo1.isZooFull());

        // Instruction 16
        Zoo autreZoo = new Zoo("MiniZoo", "Sfax", 20);
        autreZoo.addAnimal(new Animal("Félidé", "Chat", 2, true));
        compareZoos(myZoo1, autreZoo);

        sc.close();
    }

    // afficher le zoo avec le plus d’animaux
    public static void compareZoos(Zoo z1, Zoo z2) {
        Zoo plusGrand = Zoo.comparerZoo(z1, z2);
        System.out.println("Le zoo avec le plus d’animaux est : " + plusGrand.name + " avec " + plusGrand.animalCount + " animaux.");
    }
}
