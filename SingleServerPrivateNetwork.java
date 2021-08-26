public class SingleServerPrivateNetwork extends VirtualNetworkWithZenServer implements Print {
    VirtualNetworkWithZenServer zenServer;
    boolean isParentCreated = false;

    public SingleServerPrivateNetwork(VirtualNetworkWithZenServer zenServer) {
        this.zenServer = zenServer;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("Single Server Private Network implemented.");
    }
}
