package myPack;   //package myPack which holds the main java file and all other files present in the program

import java.util.*;    //importing the package java.util to use the scanner class

public class StackDemo {		//main class of the program

	public static void main(String[] args) {		//main method of the program
		
		int ch, ch1, num;			//initialization of variables to integer data type
		char choice = 'n';			//initialization of variable to char data type

		Scanner sc = new Scanner(System.in);		//creating object of Scanner class 
		FixedStack fs = new FixedStack();		//creating object of FixedStack class
		VariableStack vs = new VariableStack(2);		//creating object of Variable class

		do {												//do - while loop which executes atleast once and then checks the condition
			System.out.println("        MENU        ");		//prints message on console
			System.out.println(" 1. Static Stack ");			//prints message on console
			System.out.println(" 2. Dynamic Stack ");		//prints message on console
			System.out.println(" 3. Exit ");					//prints message on console
			System.out.println(" Enter your Choice: ");		//prints message on console
			ch = sc.nextInt();								//inserts the value to variable ch using the object of scanner class
			switch(ch) {										//switch statements which works on the input of the user
				case 1: do {									//case 1 and use of do-while loop which executes atleast once
						System.out.println(" Static Stack Menu ");	//prints message on console
						System.out.println(" 1. PUSH ");				//prints message on console
						System.out.println(" 2. POP ");				//prints message on console
						System.out.println(" 3. Display Stack ");	//prints message on console
						System.out.println(" 4. Exit Program ");		//prints message on console
						System.out.println("Enter your choice: ");	//prints message on console
						ch1 = sc.nextInt();							//takes input from the user using scanner class object and stores it ch1 variable 				
						switch(ch1) {					//switch statement which works on the input from the user
							case 1: System.out.println("Enter a number you want to push in stack: ");		//prints message on console
									num = sc.nextInt();			//get the value from user and stores it in num variable
									fs.push(num);				//calling of method of class FixedStack using its object fs
									break;						//break statement to come out of the case 
								case 2: System.out.println("Popping element from stack");		//prints message on console
									fs.pop();			//method called using the object fs of FixedStack
									break;				//break statement to come out of the case 
							case 3: fs.display();		//calling the display message using object fs of FixedStack
									break;				//break statement to come out of the case
							case 4: System.exit(0);		//to exit from the program	
							default: System.out.println("Sorry Wrong Choice");		//default if the choice entered by the user is wrong will display the message on the console
						}
						System.out.println("Do you want to continue (Y/N): ");  //displays the message on the console
						choice = sc.next().charAt(0);			//gets the value from the user and stores in choice (gets only the 1st character entered by the user)
				}while(choice == 'y' || choice == 'Y');			//end of do by checking if the user entered choice matches with with the condition or not if does the loop continues
				case 2: do {											//case 1 and use of do-while loop which executes atleast once
						System.out.println(" Dynamic Stack Menu ");	//prints message on console
						System.out.println(" 1. PUSH ");				//prints message on console
						System.out.println(" 2. POP ");				//prints message on console
						System.out.println(" 3. Display Stack ");	//prints message on console
						System.out.println(" 4. Exit Program ");		//prints message on console
						System.out.println("Enter your choice: ");	//prints message on console	
						ch1 = sc.nextInt();							//takes input from the user using scanner class object and stores it ch1 variable 
						switch(ch1) {								//switch statement which works on the input from the user
							case 1: System.out.println("Enter a number you want to push in stack: ");		//prints message on console
									num = sc.nextInt();				//get the value from user and stores it in num variable
									vs.push(num);					//calling of method of class VariableStack using its object vs
									break;							//break statement to come out of the case 
							case 2: System.out.println("Popping element from stack");		//prints message on console
									vs.pop();								//method called using the object vs of VariableStack
									break;							//break statement to come out of the case
							case 3: vs.display();					//calling the display message using object vs of VarableStack
									break;							//break statement to come out of the case
							case 4: System.exit(0);					//exits out of the program
							default: System.out.println("Sorry Wrong Choice");	//default if the choice entered by the user is wrong will display the message on the console		
						}
						System.out.println("Do you want to continue (Y/N): ");	//displays the message on the console
						choice = sc.next().charAt(0);							//gets the value from the user and stores in choice (gets only the 1st character entered by the user)
				}while(choice == 'y' || choice == 'Y');							//end of do by checking if the user entered choice matches with with the condition or not if does the loop continues	
				case 3: System.exit(0);											//To exit from the program
				default: System.out.println("Please Enter Correct Choice");		//default if the choice entered by the user is wrong will display the message on the console
			}
			System.out.println("Do you want to continue (Y/N): ");		//displays the message on the console
			choice = sc.next().charAt(0);								//end of do by checking if the user entered choice matches with with the condition or not if does the loop continues	
		}while(choice == 'y' || choice =='Y');							//displays the message on the console
		sc.close();														//scanner classed is closed
	}

}
