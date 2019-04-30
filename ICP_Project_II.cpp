#include<iostream>
#include<string>
#include<vector>
#include <cctype>
#include <sstream>
#include <algorithm>
using namespace std;
// CLASS USER
class User{
	// INSTANCE VARIABLES
	private:
		double userCredits;
		vector<int> barCodes;
		string userName, userEmail, userPassword;
	public:
		//CONSTRUCTOR
		User(){
			this->userCredits = 0.0;
			this->userName = "";
			this->userEmail = "";
			this->userPassword = "";
		}
		//DESTRUCTOR
		~User(){
			cout << "Destroying Object";
		}
		//GETTERS
		void setUserCredits(double credits){
			this->userCredits = credits;
		}
		void setUserName(string name){
			if(!(isdigit(name.at(0)))){
				this->userName = name;
			}else{
				cout << "The Name is Invalid. \nTry a name that doesn't start with number(s)." << endl;
			}
		}
		// FIX THE @ PROBLEM IN THE METHOD BELOW
		void setUserEmail(string email){
			vector <char> charList;
			for(int i=0;i<email.size()-1;i++){
				charList.push_back(email.at(i));
			}
			if(isalpha(charList[0]) && charList[charList.size()-1] != '.'){
				for(int w=0;w<charList.size()-1;w++){
					if(charList[w] == '@' && w !=0 && w!=email.size()-1){
						if(email.find('@') > w && email.find('@')<email.length()){
							this->userEmail = email;
						}
					}
				}
			}else{
				cout << "The email is invalid\nIt should not begin with a number or end with a dot('.')\nIt should be in the format ****@****.***" << endl;
			}
		}
		//PUT THE PASSWORD RESTRICTIONS[EXECPTIONS] IN THE METHOD BELOW
		void setUserPassword(string Password){
			if(Password.length() > 6){
				this->userPassword = Password;
			}else{
				cout << "The Password is too long.\nPlease try again.\nThe password should be longer than 6 characters."<< endl;
			}
		}
		//SETTERS
		double getUserCredits(){
			return this->userCredits;
		}
		string getUserName(){
			return this->userName;
		}
		string getUserEmail(){
			return this->userEmail;
		}
		string getUserPassword(){
			return this->userPassword;
		}
		//TO STRING
		void toString(){
			cout << "User Name: " << getUserName() << endl;
			cout << "User Email: " << getUserEmail() << endl;
			cout << "User Credits: " << "GHc " << getUserCredits()/10.0 << endl;
		}
		//OTHER METHODS
		//scanBarcode/scanQRcode, addCredits, removeCredits, checkCredits, buyItem
		void addCredits(){
			this->userCredits = 20.0 + getUserCredits();
		}
		void removeCredits(double amount){
			this->userCredits = userCredits - amount;
		}
		double checkCredits(){
			cout << "Your credit balance is GHC " << getUserCredits()/10.0 << endl;
		}
		void scanBarCode(int barCode, string binLocation){
			barCodes.push_back(barCode);
			this -> userCredits = getUserCredits() + 20.0;
			for(int i= 0;i<)
		}
};

// CLASS STAKEHOLDER
class Stakeholder{
	//INSTANCE VARIABLES: compName, compType, compID, userTotalCredits[arraylist/binary tree/ hash map]
	private:
		string compName, compID;
		int compPin;
		vector <User> usersList;
	public:
		//CONSTRUCTOR
		Stakeholder(){
			this->compName = "";
			this->compPin = 0000;
			this->compID  = "";
		}
		//DESTRUCTOR
		~Stakeholder(){
			cout << "Destroying Object" << endl;
		}
		//SETTERS
		void setCompName(string name){
			this->compName = name;
		}
		void setCompPin(int pin){
			stringstream ss;
			ss << pin;
			if(ss.str().length() >= 4){
				this->compID = pin;
			}else{
				cout << "The ID is invalid.\nIt has to be at least 4 numbers long" << endl;
			}
		}
		void setCompID(string ID){
			if(ID.length() == 10){
				this->compID = ID;
			}else if(ID.length() > 10){
				cout << "The ID is invalid!\nIt is too long.\nEnter an ID 10 characters long"  << endl;
			}else{
				cout << "The ID is invalid!\nIt is too short.\nEnter an ID 10 characters long" << endl;
			}
		}
		//GETTERS
		string getCompName(){
			return this->compName;
		}
		int getCompPin(){
			return this->compPin;
		}
		string getCompID(){
			return this->compID;
		}
		//TO STRING
		void toString(){
			cout << "Company Name: " << getCompName() << endl;
			cout << "Company ID: " << getCompID() << endl;
			cout << "No. of Customers: " << usersList.size() << endl;
		}
		//OTHER METHODS
		void addNewUser(User newUser){
			usersList.push_back(newUser);
		}
		User getHighestUser(){
			vector <double> creditsVector;
			User focus;
			double largest = 0.0;
			User largestUser;
			for(int i=0;i<usersList.size()-1;i++){
				focus = usersList[i];
				if(focus.getUserCredits() < largest){
					largestUser = focus;
					getHighestUser();
				}
			}
			return focus;
		}
};
//CLASS ZOOMLION
class Zoomlion{
	//INSTANCE VARIABLES
	//capacity[vector], binLocation[vector], binPin[vector], userTotalCredits[vector]
	private:
		string binLocation[7] {"Research Building", "Fab Lab", "Engineering Building", "Hive", "Library", "Radichel Halls", "Norton Motulsky"};
		int binCapacity[7] {200, 200, 120, 400, 250, 400, 250};
		int binLevel[7]{0,0,0,0,0,0,0};
		int scannedBarCodes;
		Stakeholder compColletion[10];
		vector <User> userCollection;
		string adminID;
		int adminPin;
	public:
		//CONSTRUCOTR
		Zoomlion(){
			this->adminID = "";
			this->adminPin = 0000;
		}
		//DESTRUCTOR
		~Zoomlion(){
			cout << "Destroying Object" << endl;
		}
		//SETTERS
		void setBinCapacity(int capacity[7]){
			this->binCapacity = capacity;
		}
		void setBinLevel(int level[7]){
			this->binLevel = level;
		}
		//GETTERS
		vector<string> getBinLocation(){
			return this->binLocation;
		}
		vector<int> getBinCapacity(){
			return this->binCapacity;
		}
		vector<int> getBinLevel(){
			return this->binLevel;
		}
		vector<User> getUsers(){
			return this->userCollection;
		}
		
};

class Menu{
	public:
		void menu(){
			int option1;
			cout << "Welcome to Ashesi as a living lab:\nThe Recycling Project\nPlease choose a group from the menu below and proceed\n1. User\2.Business on Campus\n3.Zoomlion Ghana\n4. Exit" <<endl;
			cin >> option1;
			if(option1 == 1){
				int userPageOption;
				cout << "Welcome to the User Page\nPlease select an option:\n1. SignUp\n2.Login\n3.Return to previous page" <<endl;
				cin >> userPageOption;
				User newUser;
				string name, password, email;
				if(userPageOption == 1){
					cout << "Enter your name: " <<endl;
					cin >> name;
					cout << "Enter your email: " << endl;
					cin >> email;
					cout << "Enter a password: " << endl;
					cin >> password;
					newUser.setUserName(name);
					newUser.setUserEmail(email);
					newUser.setUserPassword(password);
					cout << "The home will open then you can select a group and login" <<endl;
					menu();
				}else if(userPageOption == 2){
					cout << "Enter your email: " << endl;
					cin >> email;
					cout << "Enter your password: " << endl;
					cin >> password;
					for(int i =0;i<)
				}
			}else if(option1 == 2){
				
				menu();
			}else if(option1 == 3){
				
				menu();
			}else if(option1 == 4){
				cout << "The program has been terminated\n ASHESI AS A LIVING LAB" << endl;
				cout << "\n============================================================" << endl;
			}else{
				cout << "Your Menu Option is Invalid.\nPlease try again" <<endl;
				menu();
			}
		}
};
