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
public interface FacilitySystem {
    String[] events = {""};
    
    
    public void cleanFacility();
    
    public void prepareBeforeEvents();
    
    public void prepareAfterEvents();
    
    public void scheduleEvent();
    
    
}
