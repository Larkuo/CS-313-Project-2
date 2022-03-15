package com.example.ashesiasalivinglab;

import java.util.ArrayList;

public class User {
    private double userCredits;
    private String userName, userEmail, userPassword;
    //CONSTRUCTOR
    User(){
        this.userName = "";
        this.userEmail = "";
        this.userPassword = "";
        this.userCredits = 0.0;
    }
    //SETTERS
    void setUserName(String name){
        if(Character.isLetter(name.charAt(0))){
            this.userName = name;
        }else{
            System.out.println("The name value is invalid.\nIt has to begin with a letter\nPlease review it and try again");
        }
    }
    void setUserCredits(double credits){
        this.userCredits = credits;
    }
    void setUserPassword(String password){
        if(password.length() > 6){
            this.userPassword = password;
        }else{
            System.out.println("The password is invalid.\nIt has to be longer than 6 characters");
        }
    }
    void setUserEmail(String email){
        if(Character.isLetter(email.charAt(0))){
            if(email.indexOf('@') > 0 && email.indexOf('@')<email.length()-3){
                if(email.charAt(email.length()-1) != '.'){
                    this.userEmail = email;
                }
            }
        }else{
            System.out.println("The email is invalid\nIt should not begin with a number or end with a dot('.')\nIt should be in the format ****@****.***");
        }
    }
    //GETTERS
    public double getUserCredits() {
        return this.userCredits;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    //scanBarCode
    /*public void scanBarCode(int code, String binLocation){
        for(int  w=0;w<getScannedCodeList()-1;w++){
            if(getScannedCodeList()[w] == code){
                System.out.println("The code has already been scanned.\nPlease try another product");
            }else{
                this.userCredits = getUserCredits() + 0.20;
            }
        }
        for(int i=0;i<getBinLocation()-1;i++){
            if(binLocation == getBinLocation()[i]){
                getBinLevel()[i] = getBinLevel()[i] + 1;
            }
        }
    }*/

    //buyItem
    public void buyItem(String item, int quantity, double cost){
        if(userCredits > cost*quantity){
            this.userCredits = userCredits - (cost*quantity);
            System.out.println("Your new balance is " + getUserCredits());
        }else{
            System.out.println("Your balance is insufficient to make this purchase.\nRecycle more and try again later");
        }
    }

    //checkCreditBalance
    public double checkCreditBalance(){
        System.out.println("Your balance is GHc " + getUserCredits());
        return this.getUserCredits();
    }
}
