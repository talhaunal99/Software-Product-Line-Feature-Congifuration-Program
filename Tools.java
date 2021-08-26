public class Tools implements Print {
    OpenNebula openNebula;
    boolean isParentCreated = false;

    public Tools(OpenNebula openNebula) {
        this.openNebula = openNebula;
        isParentCreated = true;
    }
    public void print() {
        System.out.println("Tools implemented.");
    }
}
