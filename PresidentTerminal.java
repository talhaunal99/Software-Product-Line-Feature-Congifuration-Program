public class PresidentTerminal extends Terminal implements Print {
    Terminal terminal;
    boolean isParentCreated = false;

    public PresidentTerminal(Terminal terminal) {
        this.terminal = terminal;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("President Terminal implemented.");
    }
}
