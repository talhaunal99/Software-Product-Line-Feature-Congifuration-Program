public class Drivers implements Print {
    OpenNebula openNebula;
    boolean isParentCreated = false;

    public Drivers(OpenNebula openNebula) {
        this.openNebula = openNebula;
        isParentCreated = true;
    }

    public void print() {
        System.out.println("Drivers implemented.");
    }
}
