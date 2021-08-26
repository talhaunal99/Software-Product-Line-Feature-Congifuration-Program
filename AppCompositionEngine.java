public class AppCompositionEngine extends CoordinatorService implements Print {
    CoordinatorService service;
    boolean isParentCreated = false;

    public AppCompositionEngine(CoordinatorService service) {
        this.service = service;
        isParentCreated = true;
        print();
    }
    public void print() {
        System.out.println("Application Composition Engine implemented.");
    }

}
