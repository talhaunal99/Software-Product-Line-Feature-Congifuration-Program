public class Sensor extends CoordinatorService implements Print {
    CoordinatorService service;
    boolean isParentCreated = false;

    public Sensor(CoordinatorService service) {
        this.service = service;
        isParentCreated = true;
        print();
    }
    public void print() {
        System.out.println("Sensor implemented.");
    }

}
