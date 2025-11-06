// ====================== Prosit 4 ======================
// Instruction 17
// Instruction 18
// Instruction 19

package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages;
    private int animalCount = 0;

    // Instruction 25
    private Aquatic[] aquaticAnimals = new Aquatic[10];
    private int aquaticCount = 0;


    public Zoo(String name, String city, int nbrCages) {
        setName(name); // Vérification nom non vide
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    public Zoo() {
        this.nbrCages = 25;
        this.animals = new Animal[25];
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println(" Erreur : le nom du zoo ne peut pas être vide. Valeur mise à 'Zoo Sans Nom'.");
            this.name = "Zoo Sans Nom";
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    // Instruction 8
    public void displayZoo() {
        System.out.println("Zoo: " + name + " | Ville: " + city + " | Nombre de cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Nombre de cages=" + nbrCages + ", Animaux=" + animalCount + "]";
    }

    // Instruction 17
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println(" Impossible d’ajouter " + animal.getName() + " : le zoo est plein !");
            return false;
        }

        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                System.out.println(" Erreur " + animal.getName() + " est déjà présent dans le zoo.");
                return false;
            }
        }
        animals[animalCount++] = animal;
        return true;
    }

    // Instruction 11
    public void displayAnimals() {
        System.out.println("Liste des animaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    // Instruction 11
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // Instruction 13
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null;
        return true;
    }



    // Instruction 15
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Instruction 16
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount >= z2.animalCount) ? z1 : z2;
    }



    // Instruction 25
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount >= aquaticAnimals.length) {
            System.out.println("Impossible d’ajouter " + aquatic.getName() + " : tableau aquatique plein !");
            return;
        }
        aquaticAnimals[aquaticCount++] = aquatic;
        System.out.println(aquatic.getName() + " ajouté avec succès aux animaux aquatiques !");
    }

    //Instruction 26
    public void makeAquaticAnimalsSwim() {
        for (int i = 0; i < aquaticCount; i++) {
            aquaticAnimals[i].swim();
        }
    }

    //Instruction 27
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    //Instruction 28
    public void displayNumberAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) dolphinCount++;
            else if (aquaticAnimals[i] instanceof Penguin) penguinCount++;
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }
}



