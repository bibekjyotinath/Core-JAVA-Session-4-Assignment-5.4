package myPack;      //package myPack which holds the main java file and all other files present in the program

public class VariableStack implements Stack {     //class VariableStack created which implements the methods present in the interface Stack
	
	private int top;			//initialization of private type integer data type variables
	int stacksize;			//initialization of integer data type variables 
	private int stack[];		//initialization of private type integer type array declaration
	
	public VariableStack(int size) {		//Method Variable stack is created and a parameter is passed to the method of integer data type size
		this.stacksize = size;		//assigning the value to stacksize using this keywprd from size that is being passed to the method
		this.top = -1;				//assigning the value of top using this keyword to top to -1
		this.stack = new int[stacksize];		//assigning the value of array stack 
	}
	
	@Override
	public void push(int i) {     //overriding the method push that is being initialized in the interface
		//extends the array size 
		if(top==(stack.length-1))		//checks if the top value is equal to the stack length
		  {
		   int temp[] = new int[stack.length*2];		//creating new array temp and the extending the length of the previous element
		   for(i=0;i<stack.length;i++)			//for loop to insert elements in the new array	
		   {
		    temp[i]=stack[i];			//inserting the elements in temp array from stack array
		   }
		   stack=temp;					//assigning the values of temp back to stack
		   stack[++top]=i;				//inserting new element into the element
		  }
		  else
		   stack[++top]=i;			//else insert into the existing element if the stack is not fill
	}
	 
	@Override
	public int pop() {			//overriding the pop method initialized in interface
		
		if(top == -1)			//checks if the top is less than zero or not
		{
			System.out.println("Stack Underflow");		//if true prints Stack Underflow on Console
			System.exit(0);								//and exits the program 
		}
		System.out.println("Poping " +stack[top]+ " from Stack");		//prints the element that is being popped out of the array on the console
		return stack[top--];			//removes the element from stack
	}

	public void display() {			//method display created which displays on the console
		
		System.out.print("Values in Stack are: ");		//displays the message on the console
		for(int i=0; i<=top; i++) {				//loop to print the elements from the stack
			System.out.println();				//prints new line on the console
			System.out.print(stack[i]);			//prints the stack element on the console
		}
	}
}
