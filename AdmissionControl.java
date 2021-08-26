public class AdmissionControl extends ConferenceManager implements Print {
    ConferenceManager conferenceManager;
    boolean isParentCreated = false;

    public AdmissionControl(ConferenceManager conferenceManager) {
        this.conferenceManager = conferenceManager;
        isParentCreated = true;
        //super.print();
        print();
    }
    @Override
    public void print() {
        System.out.println("Admission Control is implemented.");
    }

}
