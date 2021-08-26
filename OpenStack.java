public class OpenStack extends OpenFlowSwitch implements Print {
    OpenFlowSwitch openFlowSwitch;
    boolean isParentCreated = false;

    public OpenStack(OpenFlowSwitch openFlowSwitch) {
        this.openFlowSwitch = openFlowSwitch;
        isParentCreated = true;
        super.print();
        print();
    }
    @Override
    public void print() {
        System.out.println("OpenStack is created.");
    }

}
