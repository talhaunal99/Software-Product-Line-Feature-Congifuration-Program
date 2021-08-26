public class BufferAccessLatency extends ForecastService implements Print {
    ForecastService forecastService;
    boolean isParentCreated = false;

    public BufferAccessLatency(ForecastService forecastService) {
        this.forecastService = forecastService;
        isParentCreated = true;
        print();
    }

    public void print() {
        System.out.println("Buffer Access Latency implemented.");
    }
}
