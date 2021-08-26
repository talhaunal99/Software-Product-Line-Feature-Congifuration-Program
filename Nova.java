public class Nova implements Print {
    OpenStack openStack;
    boolean isParentCreated = false;

    public Nova(OpenStack openStack) {
        this.openStack = openStack;
        isParentCreated = true;
    }

    public void print() {
        System.out.println("Nova implemented.");
    }

}
