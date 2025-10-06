// ====================== Prosit 5 ======================

// Instruction 20
package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {


    protected float swimmingDepth;


    public Penguin() {
        super();
    }


    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    // Instruction 23
    @Override
    public String toString() {
        return super.toString() + ", swimmingDepth=" + swimmingDepth;
    }
}
