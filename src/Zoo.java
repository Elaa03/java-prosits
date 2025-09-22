class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    // Instruction 14-prosit-3
    final int nbrCages; // constante
    int animalCount = 0; // compteur d’animaux

    //Instruction 6

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }


    public Zoo() {
        this.nbrCages = 25;
        this.animals = new Animal[25];
    }

    //Instruction 8

    public void displayZoo() {
        System.out.println("Zoo: " + name + " | Ville: " + city + " | Nombre de cages: " + nbrCages);
    }

    //Instruction 9

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Nombre de cages=" + nbrCages + ", Animaux=" + animalCount + "]";
    }

    //------Prosit 3------

    // Instruction 10
    public boolean addAnimal(Animal animal) {
        if (animalCount >= animals.length) {
            return false;
        }
        // Instruction 12
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equalsIgnoreCase(animal.name)) {
                return false; // animal déjà présent
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
            if (animals[i].name.equalsIgnoreCase(animal.name)) {
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
}

