public class BoundedNetwork extends VirtualNetworkWithZenServer implements Print{
    VirtualNetworkWithZenServer zenServer;
    boolean isParentCreated = false;

    public BoundedNetwork(VirtualNetworkWithZenServer zenServer) {
        this.zenServer = zenServer;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("Bounded Network implemented.");
    }
}
