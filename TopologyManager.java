public class TopologyManager implements Print {
    Controller controller;
    boolean isParentCreated = false;

    public TopologyManager(Controller controller) {
        this.controller = controller;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("Topology Manager is created.");

    }

}