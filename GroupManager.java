public class GroupManager extends ConferenceManager implements Print {
    ConferenceManager conferenceManager;
    boolean isParentCreated = false;

    public GroupManager(ConferenceManager conferenceManager) {
        this.conferenceManager = conferenceManager;
        isParentCreated = true;
        //super.print();
        print();
    }
    @Override
    public void print() {
        System.out.println("Group Manager is implemented.");
    }

}
