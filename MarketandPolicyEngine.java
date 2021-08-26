public class MarketandPolicyEngine extends CoordinatorService implements Print {
    CoordinatorService service;
    boolean isParentCreated = false;

    public MarketandPolicyEngine(CoordinatorService service) {
        this.service = service;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("Market and Policy Engine implemented.");
    }
}
