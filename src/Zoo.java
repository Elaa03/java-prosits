class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    //Instruction 6

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;

    }

    public Zoo() {
        this.animals = new Animal[25];
    }

    //Instruction 8

    public void displayZoo() {
        System.out.println("Zoo: " + name + " | Ville: " + city + " | Nombre de cages: " + nbrCages);
    }

    //Instruction 9

    @Override
    public String toString() {
        return "Zoo [name=" + name + ", city=" + city + ", nbrCages=" + nbrCages + "]";
    }
}