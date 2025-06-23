import java.util.function.Supplier;

public class Assignment19DefaultFunctionalInterfaces {

	public static void main(String[] args) {
		
	//	InterfaceFuncations if1 =(a,b) -> a+b;
		//System.out.println(if1.number(3,5));
		InterfaceFuncations if1 = x -> x*x;
		System.out.println(if1.squre(4));
		
		
		//Predicate
		
		//Consumer
		//Function
		//Supplier
		Supplier<Double> randonNumber=()-> Math.random();
		Supplier<String> defaultMessage=() -> "Sullier Functional";
		
		System.out.println("Randon Number is a : "+randonNumber.get());
		System.out.println(defaultMessage.get());
		
		


	}

}
