public class InformationManager extends ConferenceManager implements Print {
    ConferenceManager conferenceManager;
    boolean isParentCreated = false;

    public InformationManager(ConferenceManager conferenceManager) {
        this.conferenceManager = conferenceManager;
        isParentCreated = true;
        //super.print();
        print();
    }
    @Override
    public void print() {
        System.out.println("Information Manager is implemented.");
    }

}
