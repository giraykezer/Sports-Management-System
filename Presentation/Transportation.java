import Presentation.*;

public abstract class Transportation implements FacilitySystem {
    private int busID;
    private String[] driverContacts;

    public Transportation() {
        busID = 0;
        driverContacts = null;
    }
    public Transportation(int busID, String[] driverContacts) {
        this.busID = busID;
        this.driverContacts = driverContacts;
    }
}
