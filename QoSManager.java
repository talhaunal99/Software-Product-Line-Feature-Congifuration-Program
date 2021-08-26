public class QoSManager implements Print {
    Controller controller;
    boolean isParentCreated = false;

    public QoSManager(Controller controller) {
        this.controller = controller;
        isParentCreated = true;
        print();
    }
    public void print() {
        System.out.println("QoS Manager implemented.");
    }
}
