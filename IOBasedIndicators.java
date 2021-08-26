public class IOBasedIndicators extends ForecastService implements Print {
    ForecastService forecastService;
    boolean isParentCreated = false;

    public IOBasedIndicators(ForecastService forecastService) {
        this.forecastService = forecastService;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("I/O Based Indicators implemented.");
    }
}
