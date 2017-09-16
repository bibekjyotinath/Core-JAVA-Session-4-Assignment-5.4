package myPack;         //package myPack which holds the main java file and all other files present in the program

public class FixedStack implements Stack{     //creating class FixedStack which implements the Stack methods in the interface
	
	private int stack[] = new int[5] ;			//initialization of array and making it as a fixed size array (access scope is set as private)
	private int top = -1;						//initialization of top value and assigning it to -1 (access scope is set as private)
	
	@Override	
	public void push(int i) {				//implementing the Stack method declared in interface 
		
		top++;								//incrementing the value of top 
		if(top < 5) {						//checks if the value of top is less than the array size (pre-defined)
			stack[top] = i;					//if true inserts element to the stack
		}
		else {
			System.out.println(i+" Cannot be inserted into Stack, Stack Overflow");		//else displays error message on the console as Stack Overflow
			System.exit(0);			//exits the program 
		}	
	}

	@Override
	public int pop() {			//implementation of pop method declared in Stack interface
			
		if(top == -1) {			//checks if the top is equal to -1 or not
			System.out.println("Stack Underflow");		//if equals to the -1 Prints on console as Stack Underflow
			System.exit(0);								//and exits the program
		}
		System.out.println("Poping " +stack[top]+ " from Stack");			//prints the element that is being popped out of the stack on the console
		return stack[top--];			//removes the element from the stack
	}
	
	public void display() {				//creation of display method 
		System.out.println("The Stack Contains: ");		//prints the message on console
		for(int i=0; i<=top; i++) {			//for loop to get the elements present in the array
			System.out.println();			//prints a new line on console
			System.out.println(stack[i]);	//prints the elements on the console
		}
	}
}
