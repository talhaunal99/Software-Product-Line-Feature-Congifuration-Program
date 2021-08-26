public class Keystone implements Print {
    OpenStack openStack;
    boolean isParentCreated = false;

    public Keystone(OpenStack openStack) {
        this.openStack = openStack;
        isParentCreated = true;
    }

    public void print() {
        System.out.println("Keystone is implemented.");
    }

}