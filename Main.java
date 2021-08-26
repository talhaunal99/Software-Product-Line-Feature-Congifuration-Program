import java.util.Scanner;

public class Main {
    static boolean isSelectedOpenNebula = false;
    static boolean isSelectedMobileApp = false;
    static boolean isSelectedOpenStack = false;
    static boolean isSelectedForecastService = false;
    static boolean isSelectedSensor = false;
    static boolean isSelectedSinglePrivateNetwork = false;
    static boolean isSelectedTopologyManager = false;
    static boolean isSelectedGroupManager = false;
    static boolean isSelectedInformationManager = false;
    static boolean isSelectedAdmissionControl = false;
    static boolean isSelectedKeystone = false;
    static boolean isSelectedHorizon = false;
    static boolean isSelectedMAGA = false;
    static boolean isSelectedAGA = false;

    static void printMenu() {
        System.out.println("Cikmak icin 0 giriniz");
        System.out.println("OpenStack icin 1, OpenNebula icin 2 giriniz");
        System.out.println("Mobile App secmek icin 3 giriniz");
        System.out.println("Forecast Service secmek icin 4 giriniz");
        System.out.println("Sensor secmek icin 5 giriniz");
        System.out.println("Single Private Network secmek icin 6 giriniz");
        System.out.println("Topology Manager secmek icin 7 giriniz");
        System.out.println("Group Manager secmek icin 8 giriniz");
        System.out.println("Information Manager secmek icin 9 giriniz");
        System.out.println("Admission Control secmek icin 10 giriniz");
        System.out.println("MAGA icin 11, AGA icin 12 giriniz");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in;
        printMenu();
        while((in = scanner.nextInt()) != 0) {
            if(in == 1) { //OpenStack
                isSelectedOpenStack = true;
                int temp = -1;
                System.out.println("Cikmak icin 0 giriniz");
                System.out.println("Keystone secmek icin 1 giriniz.");
                System.out.println("Horizon secmek icin 2 giriniz.");
                while((temp = scanner.nextInt()) != 0) {
                    if(temp == 1) { //Keystone
                        isSelectedKeystone = true;
                    } else if(temp == 2) { //Horizon
                        isSelectedHorizon = true;
                    }
                    System.out.println("Cikmak icin 0 giriniz");
                    System.out.println("Keystone secmek icin 1 giriniz.");
                    System.out.println("Horizon secmek icin 2 giriniz.");
                }
            } else if(in == 2) { //OpenNebula
                isSelectedOpenNebula = true;
            } else if(in == 3) { //Mobile App
                isSelectedMobileApp = true;
            } else if(in == 4) { //Forecast Service
                isSelectedForecastService = true;
            } else if(in == 5) { //Sensor
                isSelectedSensor = true;
            } else if(in == 6) { //Single Private Network
                isSelectedSinglePrivateNetwork = true;
            } else if(in == 7) { //Topology Manager
                isSelectedTopologyManager= true;
            } else if(in == 8) { //Group Manager
                isSelectedGroupManager = true;
            } else if(in == 9) { //Information Manager
                isSelectedInformationManager =true;
            } else if(in == 10) { //Admission Control
                isSelectedAdmissionControl = true;
            } else if(in == 11) { //MAGA
                isSelectedMAGA =true;
            } else if(in == 12) { //AGA
                isSelectedAGA = true;
            }

            printMenu();
        }
        // Features which will be added are determined.
        VirtualizationSoftware virtualizationSoftware = new VirtualizationSoftware();
        CloudflareMagicWAN cloudflareMagicWAN = new CloudflareMagicWAN(virtualizationSoftware);

        ElasticDatabase elasticDatabase = new ElasticDatabase();
        SQLAzureDB sqlAzureDB = new SQLAzureDB(elasticDatabase);

        ConferenceManager conferenceManager = new ConferenceManager();
        conferenceManager.print();
        if(isSelectedGroupManager) {
            GroupManager groupManager = new GroupManager(conferenceManager);
        }
        if(isSelectedInformationManager) {
            InformationManager informationManager = new InformationManager(conferenceManager);
        }
        if(isSelectedAdmissionControl) {
            AdmissionControl admissionControl = new AdmissionControl(conferenceManager);
        }

        Controller controller = new Controller();
        controller.print();
        RoutingManager routingManager = new RoutingManager(controller);
        QoSManager qoSManager = new QoSManager(controller);
        if(isSelectedTopologyManager) {
            TopologyManager topologyManager = new TopologyManager(controller);
        }

        OpenFlowSwitch openFlowSwitch = new OpenFlowSwitch();
        if(isSelectedOpenNebula) {
            OpenNebula openNebula = new OpenNebula(openFlowSwitch);
        } else if(isSelectedOpenStack) {
            OpenStack openStack = new OpenStack(openFlowSwitch);
        } else {
            System.out.println("Wrong Operation! OpenStack or OpenNebula must be selected.");
        }

        Terminal terminal = new Terminal();
        terminal.print();

        VirtualNetworkWithZenServer zenServer = new VirtualNetworkWithZenServer();
        zenServer.print();
        CrossServerPrivateNetwork crossServerPrivateNetwork = new CrossServerPrivateNetwork(zenServer);
        ExternalNetwork externalNetwork = new ExternalNetwork(zenServer);
        BoundedNetwork boundedNetwork = new BoundedNetwork(zenServer);
        if(isSelectedSinglePrivateNetwork) {
            SingleServerPrivateNetwork privateNetwork = new SingleServerPrivateNetwork(zenServer);
        }

        vLabBackEnd backEnd = new vLabBackEnd();
        backEnd.print();

        if(isSelectedMobileApp) {
            MobileApp mobileApp = new MobileApp();
            mobileApp.print();
        }

        CoordinatorService coordinatorService = new CoordinatorService();
        coordinatorService.print();
        MarketandPolicyEngine marketandPolicyEngine = new MarketandPolicyEngine(coordinatorService);
        AppCompositionEngine appCompositionEngine = new AppCompositionEngine(coordinatorService);
        if(isSelectedSensor) {
            Sensor sensor = new Sensor(coordinatorService);
        }

        if(isSelectedForecastService) {
            ForecastService forecastService = new ForecastService();
            forecastService.print();
            IOBasedIndicators ioBasedIndicators = new IOBasedIndicators(forecastService);
            BufferAccessLatency bufferAccessLatency = new BufferAccessLatency(forecastService);
            QueueModeler queueModeler = new QueueModeler(forecastService);
        }

        MemberTerminal memberTerminal = new MemberTerminal(terminal);
        PresidentTerminal presidentTerminal = new PresidentTerminal(terminal);

        ResourceScheduler resourceScheduler = new ResourceScheduler();
        if(isSelectedMAGA) {
            MultiAgentGeneticAlgorithm maga = new MultiAgentGeneticAlgorithm(resourceScheduler);
        } else if(isSelectedAGA) {
            AgentGeneticAlgorithm aga = new AgentGeneticAlgorithm(resourceScheduler);
        } else {
            System.out.println("Wrong Operation! MAGA or AGA must be selected.");
        }


    }
}
