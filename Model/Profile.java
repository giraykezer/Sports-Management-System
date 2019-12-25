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
public class Profile {
    
    int profileID,age,salary;
    String name,password,email,memberStatus,team,address;
    
    public Profile(){
    }
    
    public void displayProfile(int profileId){
        profileID = this.profileID;
    }
    
    public void changeInfo(int age, int salary){
        age = this.age;
        salary = this.salary;
    }
    
    public void changeTeam(String team){
        team = this.team;
    }
    
    public void deleteProfile(){
    
    }
    
    
    
    
}
