package com.example.ashesiasalivinglab;

import java.util.ArrayList;

public class Zoomlion {
    //INTSANCE VARIABLES
    private String adminID, adminPassword;
    private ArrayList<String> binLocation;
    private  ArrayList<Integer> binCapacity;
    private ArrayList<Integer> binLevel;
    private ArrayList<User> userCollection;
    private ArrayList<Integer> scannedCodeList;
    //CONSTRUCTOR
    Zoomlion(){
        this.adminPassword = "";
        this.adminID = "";
        this.binLocation = new ArrayList<String>();
        this.binCapacity = new ArrayList<Integer>();
        this.binLevel = new ArrayList<Integer>();
        this.userCollection = new ArrayList<User>();
        this.scannedCodeList = new ArrayList<Integer>();
    }
    //SETTERS
    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
    public void setBinCapacity(ArrayList<Integer> binCapacity) {
        this.binCapacity = binCapacity;
    }
    public void setBinLocation(ArrayList<String> binLocation) {
        this.binLocation = binLocation;
    }
    public void setBinLevel(ArrayList<Integer> binLevel) {
        this.binLevel = binLevel;
    }
    public void setUserCollection(ArrayList<User> userCollection) {
        this.userCollection = userCollection;
    }

    public void setScannedCodeList(ArrayList<Integer> scannedCodeList) {
        this.scannedCodeList = scannedCodeList;
    }
    //GETTERS
    public String getAdminID() {
        return this.adminID;
    }
    public String getAdminPassword() {
        return this.adminPassword;
    }
    public ArrayList<String> getBinLocation() {
        return this.binLocation;
    }
    public ArrayList<Integer> getBinCapacity() {
        return this.binCapacity;
    }
    public ArrayList<Integer> getBinLevel() {
        return this.binLevel;
    }
    public ArrayList<User> getUserCollection() {
        return this.userCollection;
    }
    public ArrayList<Integer> getScannedCodeList() {
        return this.scannedCodeList;
    }

    //getGuardian

}
