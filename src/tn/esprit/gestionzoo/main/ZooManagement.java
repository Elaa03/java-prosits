package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {

        /* ====================== Prosit 1 ====================== */

        // Instruction 1
        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        // Instruction 2
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

        // Instruction 3
        System.out.println(zooName + " comporte " + nbrCages + " cages.");


        /* ====================== Prosit 2 ====================== */

        // Instruction 5
        Animal lion = new Animal();
        lion.setFamily("Félidé");
        lion.setName("Lion");
        lion.setAge(5);
        lion.setMammal(true);

        Zoo myZoo = new Zoo();
        myZoo.setName("Parc Animalier");
        myZoo.setCity("Tunis");

        System.out.println("Zoo : " + myZoo.getName() + " à " + myZoo.getCity());
        System.out.println("Animal : " + lion.getName() + " (" + lion.getFamily() + ")");

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


        /* ====================== Prosit 4 ====================== */

        // Test Instruction 17
        Zoo zooTest = new Zoo("Grand Zoo", "Tunis", 2);
        Animal lionTest = new Animal("Félidé", "Lion", 5, true);
        Animal tigre = new Animal("Félidé", "Tigre", 3, true);
        Animal chat = new Animal("Félidé", "Chat", 2, true);

        zooTest.addAnimal(lionTest);
        zooTest.addAnimal(tigre);
        zooTest.addAnimal(chat);

        // Test Instruction 18
        Animal perroquet = new Animal("Psittacidae", "Perroquet", -3, false);
        System.out.println(perroquet);

        Zoo zooVide = new Zoo("", "Sfax", 10);
        System.out.println(zooVide);


        /* ====================== Prosit 5 ====================== */

        // Instruction 21
        System.out.println("\n===== Prosit 5 - Instruction 21 : Instanciation =====");
        Aquatic aquaticAnimal = new Aquatic();
        Terrestrial terrestrialAnimal = new Terrestrial();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        System.out.println("Objets créés avec succès :");
        System.out.println(aquaticAnimal);
        System.out.println(terrestrialAnimal);
        System.out.println(dolphin);
        System.out.println(penguin);

        // Instruction 22
        System.out.println("\n===== Instruction 22 : Constructeurs paramétrés =====");
        Aquatic aquatic1 = new Aquatic("Aquatic Family", "Poisson", 3, false, "mer");
        Terrestrial terrestrial1 = new Terrestrial("Canidé", "Chien", 4, true, 4);
        Dolphin dolphin1 = new Dolphin("Delphinidae", "Flipper", 6, true, "océan", 25.5f);
        Penguin penguin1 = new Penguin("Spheniscidae", "Pingo", 2, false, "bassin", 10.2f);

        System.out.println(aquatic1);
        System.out.println(terrestrial1);
        System.out.println(dolphin1);
        System.out.println(penguin1);

        // Instruction 23
        System.out.println("\n===== Instruction 23 : Vérification toString() =====");
        System.out.println("Aquatic → " + aquatic1.toString());
        System.out.println("Terrestrial → " + terrestrial1.toString());
        System.out.println("Dolphin → " + dolphin1.toString());
        System.out.println("Penguin → " + penguin1.toString());

        //Instruction 24
        aquatic1.swim();
        dolphin1.swim();
        penguin1.swim();



        // ====================== Prosit 6 ======================

        Zoo aquaticZoo = new Zoo("AquaWorld", "Sousse", 15);

        Dolphin d1 = new Dolphin("Delphinidae", "Dolly", 8, true, "océan", 30.5f);
        Dolphin d2 = new Dolphin("Delphinidae", "Blue", 5, true, "mer", 28.3f);
        Penguin p1 = new Penguin("Spheniscidae", "Pingo", 3, false, "bassin", 12.8f);
        Penguin p2 = new Penguin("Spheniscidae", "Chilly", 4, false, "glace", 15.0f);

        aquaticZoo.addAquaticAnimal(d1);
        aquaticZoo.addAquaticAnimal(d2);
        aquaticZoo.addAquaticAnimal(p1);
        aquaticZoo.addAquaticAnimal(p2);


        System.out.println("\nTous les animaux aquatiques nagent :");
        aquaticZoo.makeAquaticAnimalsSwim();


        System.out.println("\nProfondeur maximale des pingouins : " + aquaticZoo.maxPenguinSwimmingDepth() + " m");


        System.out.println("\nNombre d’animaux aquatiques par type :");
        aquaticZoo.displayNumberAquaticsByType();


        System.out.println("\nTest equals() entre deux dauphins : " + d1.equals(d2));
        Dolphin d3 = new Dolphin("Delphinidae", "Dolly", 8, true, "océan", 31f);
        System.out.println("Test equals() entre d1 et d3 (même nom, âge, habitat) : " + d1.equals(d3));


        sc.close();
    }


    public static void compareZoos(Zoo z1, Zoo z2) {
        Zoo plusGrand = Zoo.comparerZoo(z1, z2);
        System.out.println("Le zoo avec le plus d’animaux est : " + plusGrand.getName() +
                " avec " + plusGrand.getAnimalCount() + " animaux.");
    }


}
