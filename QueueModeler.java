public class QueueModeler extends ForecastService implements Print {
    ForecastService forecastService;
    boolean isParentCreated = false;

    public QueueModeler(ForecastService forecastService) {
        this.forecastService = forecastService;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("Queue Modeler implemented.");
    }
}
