public class ExternalNetwork extends VirtualNetworkWithZenServer implements Print {
    VirtualNetworkWithZenServer zenServer;
    boolean isParentCreated = false;

    public ExternalNetwork(VirtualNetworkWithZenServer zenServer) {
        this.zenServer = zenServer;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("External Network implemented.");
    }
}
