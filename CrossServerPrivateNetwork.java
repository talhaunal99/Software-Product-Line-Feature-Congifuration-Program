public class CrossServerPrivateNetwork extends VirtualNetworkWithZenServer implements Print {
    VirtualNetworkWithZenServer zenServer;
    boolean isParentCreated = false;

    public CrossServerPrivateNetwork(VirtualNetworkWithZenServer zenServer) {
        this.zenServer = zenServer;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("Cross Server Private Network implemented.");
    }
}
