public class Horizon implements Print {
    OpenStack openStack;
    boolean isParentCreated = false;

    public Horizon(OpenStack openStack) {
        this.openStack = openStack;
        isParentCreated = true;
    }

    @Override
    public void print() {
        System.out.println("Horizon is implemented.");

    }

}