public class Swift implements Print {
    OpenStack openStack;
    boolean isParentCreated = false;

    public Swift(OpenStack openStack) {
        this.openStack = openStack;
        isParentCreated = true;
    }

    public void print() {
        System.out.println("Swift implemented.");
    }
}
