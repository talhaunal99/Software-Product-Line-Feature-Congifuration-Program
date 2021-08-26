public class RoutingManager extends Controller implements Print {
    Controller controller;
    boolean isParentCreated = false;

    public RoutingManager(Controller controller) {
        this.controller = controller;
        isParentCreated = true;
        print();
    }
    public void print() {
        System.out.println("Routing Manager implemented.");
    }
}
