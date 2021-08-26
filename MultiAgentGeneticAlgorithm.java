public class MultiAgentGeneticAlgorithm extends ResourceScheduler implements Print {
    ResourceScheduler resourceScheduler;
    boolean isParentCreated = false;

    public MultiAgentGeneticAlgorithm(ResourceScheduler resourceScheduler) {
        this.resourceScheduler = resourceScheduler;
        isParentCreated = true;
        super.print();
        print();
    }
    @Override
    public void print() {
        System.out.println("Multi Agent Genetic Algorithm is implemented.");

    }

}