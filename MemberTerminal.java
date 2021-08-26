public class MemberTerminal extends Terminal implements Print {
    Terminal terminal;
    boolean isParentCreated = false;

    public MemberTerminal(Terminal terminal) {
        this.terminal = terminal;
        isParentCreated = true;
        print();
    }
    public void print() {
        System.out.println("Member Terminal implemented.");
    }
}
