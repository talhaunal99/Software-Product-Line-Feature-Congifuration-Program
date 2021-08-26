public class AgentGeneticAlgorithm extends ResourceScheduler implements Print {
    ResourceScheduler resourceScheduler;
    boolean isParentCreated = false;

    public AgentGeneticAlgorithm(ResourceScheduler resourceScheduler) {
        this.resourceScheduler = resourceScheduler;
        isParentCreated = true;
        super.print();
        print();
    }

    public void print() {
        System.out.println("Agent Genetic Algorithm is implemented.");

    }

}