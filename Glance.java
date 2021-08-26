public class Glance implements Print {
    OpenStack openStack;
    boolean isParentCreated = false;

    public Glance(OpenStack openStack) {
        this.openStack = openStack;
        isParentCreated = true;
    }

    public void print() {
        System.out.println("Glance implemented.");
    }
}
