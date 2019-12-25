/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sports.management.system;

/**
 *
 * @author giray-kezer
 */


public class Gym implements FacilitySystem{
    String gymName;

    public Gym()
    {
        gymName="";
    }
    
    public Gym(String gymName) {
        this.gymName = gymName;
    }
    
    public void setGymName(String gymName) {
        this.gymName = gymName;
    }
    
    public String getGymName() {
        return gymName;
    }
    
    @Override
    public void cleanFacility() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prepareBeforeEvents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prepareAfterEvents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void scheduleEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
