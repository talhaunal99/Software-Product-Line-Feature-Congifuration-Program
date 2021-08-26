public class OpenNebula extends OpenFlowSwitch implements Print {
    OpenFlowSwitch openFlowSwitch;
    boolean isParentCreated = false;

    public OpenNebula(OpenFlowSwitch openFlowSwitch) {
        this.openFlowSwitch = openFlowSwitch;
        isParentCreated = true;
        super.print();
        print();
    }

    @Override
    public void print() {
        System.out.println("OpenNebula is created.");

    }

}