package exceptionhandling;//created package as exceptionhandling

/**
 * here this method is the user Defined Method,
 * we are creating this method because we are throwing
 * custom Exception
 **/
public class ValueNotFoundException extends Exception{//created class as VlaueNotFoundException extends Exception
	public ValueNotFoundException(){//Here public is a access modifier which defines who can access this method
		super();//super keyword is a reference variable which is used to refer immediate parent class object
	}

}
