package exceptionhandling;//created package as exceptionhandling

import java.util.Scanner;//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions
/**
 * 
 * here we are creating a class ExceptionDemo
 * which was asked to create 
 *
 */
public class ExceptionDemo {//class name taken as ExceptionDemo

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter
		System.out.println("Please enter 5 string values in the string array:");
		// here we taking the string array of size 5
		//system is used to return code
        //out is a static member
  	//Println is used to print text  and gives output 
		String[] arr = new String[5];
		// here we use Scanner to take the input from the user
		Scanner sc = new Scanner(System.in);
		// here we are initializing our string array
		for (int i = 0; i < arr.length; i++) {//sing for loop for array length

			arr[i] = sc.next();
		}
		// here we are taking the string data type
		String string;
		System.out.print("\nEnter the string to search: ");//system is used to return code
        //out is a static member
  	//Println is used to print text  and gives output 
		// here we are using the Sc.next to taking the next input from the user
		string = sc.next();
		// here we are calling the method to search string in array
		String string1 = searchString(arr, string);
		// here If the method returned null, it means string not found
		if (string1 == null) {
			System.out.println("String not found.");
			// else string will be founded and result will print
		} else {
			System.out.println("String found.");//system is used to return code
	           //out is a static member
      	//Println is used to print text  and gives output 
		}
		// here we are closing the Scanner
		sc.close();
	}

	// here we take the method to search the string
	private static String searchString(String[] arr, String str) {
		// here we are applying the try and catch for checking the exception
		try {
			int i;
			// here we initializing to search the string in array
			for (i = 0; i < arr.length; i++) {
				// If string found stop the loop
				if (arr[i].equals(str)) {
					break;
				}
			}
			// Here we are applying the condition to check the value of i is
			// equal
			// to the array length or not if the value is equal
			// then whole array traversed but
			// the string will not found
			if (i == arr.length) {
				// So exception is thrown
				throw new ValueNotFoundException();//
			} else {
				// here if the value of i is less than the array length
				// then the value will be found and
				// the string will return
				return str;//return str
			}
		} catch (ValueNotFoundException e) {
			// here If the exception caught then null is returned
			return null;//return null
		}
	}
}
