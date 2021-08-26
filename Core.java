public class Core implements Print {
    OpenNebula openNebula;
    boolean isParentCreated = false;

    public Core(OpenNebula openNebula) {
        this.openNebula = openNebula;
        isParentCreated = true;
    }
    public void print() {
        System.out.println("Core implemented.");
    }
}
