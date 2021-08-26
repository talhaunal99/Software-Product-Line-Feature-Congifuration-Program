public class CloudflareMagicWAN extends VirtualizationSoftware implements Print {
    VirtualizationSoftware virtualizationSoftware;
    boolean isParentCreated = false;

    public CloudflareMagicWAN(VirtualizationSoftware virtualizationSoftware) {
        this.virtualizationSoftware = virtualizationSoftware;
        isParentCreated = true;
        super.print();
        print();
    }

    public void print() {
        System.out.println("Cloudflare Magic WAN implemented.");
    }
}
