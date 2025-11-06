package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {

    protected String habitat;

    public Aquatic() {
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", habitat='" + habitat + "'";
    }

    // Instruction 26
    public abstract void swim();

    // Instruction 31
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Aquatic)) return false;
        Aquatic other = (Aquatic) obj;
        return this.getName().equalsIgnoreCase(other.getName())
                && this.getAge() == other.getAge()
                && this.getHabitat().equalsIgnoreCase(other.getHabitat());
    }
}
