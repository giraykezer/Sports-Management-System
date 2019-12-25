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
//import Model.*;

public class Manager extends Profile implements FacilitySystem{
    private double budget;
    private String responsibility;

    public Manager() {
        budget = 0.0;
        responsibility = "";
    }
    public Manager(double budget, String responsibility) {
        this.budget = budget;
        this.responsibility = responsibility;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }
    public double getBudget() {
        return budget;
    }
    public String getResponsibility() {
        return responsibility;
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