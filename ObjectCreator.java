import java.util.*;

public class ObjectCreator {

	//constructor
	public ObjectCreator(){

	}

	public Object create(){
		Object object = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("1) Simple object with only primitives for instance variables");
		System.out.print("2) Object that contains references to other objects");
		System.out.print("3) Object that contains an array or primitives");
		System.out.print("4) Object that contains an array of object references");
		System.out.print("5) Object that uses an instance of Java's collection classes");
		System.out.print("Select your choice: ");
		String input = scan.nextLine();

		if (input.equals("1")){
			object = simplePrimitive();
		}
		else if (input.equals("2")){
			object = referenceObject();
		}
		else if (input.equals("3")){
			object = arrayPrimitives();
		}
		else if (input.equals("4")){
			object = arrayObject();
		}
		else if(input.equals("5")){
			object = objectCollection();
		}

	}
}