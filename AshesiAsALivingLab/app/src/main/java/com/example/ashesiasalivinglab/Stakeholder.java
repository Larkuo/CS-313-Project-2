package com.example.ashesiasalivinglab;

import java.util.ArrayList;
import java.util.Collections;

public class Stakeholder {
    //INSTANCE VARIABLES
    private String name, ID;
    private int pin;
    private ArrayList<User> userList;

    //CONSTRUCTOR
    Stakeholder(){
        this.name = "";
        this.ID = "";
        this.pin = 0000;
        userList = new ArrayList<User>();
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public void setUserList(ArrayList<User> list){
        this.userList = list;
    }
    //GETTERS
    public String getName(){
        return this.name;
    }

    public String getID() {
        return this.ID;
    }

    public int getPin() {
        return this.pin;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    //addNewUser
    public void addNewUser(User newUser){
        for(User U:userList){
            if(U.getUserEmail() == newUser.getUserEmail()){
                System.out.println("This email has already been used.\nPlease try again");
            }else{
                userList.add(newUser);
                break;
            }
        }
    }

    //getGurdian
    public User getGuardian(){
        ArrayList<Double> credits = new ArrayList<Double>();
        for(User U:userList){
            credits.add(U.getUserCredits());
        }
        return userList.get(credits.indexOf(Collections.max(credits)));
    }
}
