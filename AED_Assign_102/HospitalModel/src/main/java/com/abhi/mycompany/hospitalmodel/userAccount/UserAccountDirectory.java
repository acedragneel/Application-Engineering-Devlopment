/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.userAccount;

import java.util.ArrayList;

/**
 *
 * @author abhilashgp
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = new ArrayList<>();
    }
        
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
    for (UserAccount ua : userAccountList)
        if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
            return ua;
        }
    return null;
    }
    
    public UserAccount createUserAccount(String username, String password){
        UserAccount userAccount = new UserAccount(username,password);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccountList.add(userAccount);
        return userAccount;
    }
          
}
