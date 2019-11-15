import java.util.Scanner;
import java.lang.*;

public class ObjectCreator {
	Scanner scan = new Scanner(System.in);
	//constructor
	public ObjectCreator(){

	}

	public Object create(){
		Object object = null;
		System.out.println("1) Simple object with only primitives for instance variables");
		System.out.print("2) Object that contains references to other objects");
		System.out.print("3) Object that contains an array or primitives");
		System.out.print("4) Object that contains an array of object references");
		System.out.print("5) Object that uses an instance of Java's collection classes");
		System.out.print("Select your choice: ");
		String input = scan.nextLine();

		if (input.equals("1")){
			object = createSimplePrimitive();
		}
		else if (input.equals("2")){
			object = createReferenceObject();
		}
		else if (input.equals("3")){
			object = createArrayPrimitives();
		}
		else if (input.equals("4")){
			//object = createArrayObject();
		}
		else if(input.equals("5")){
			//object = createObjectCollection();
		}
		else{
			System.out.println("Only select from 1-5");
		}
		return object;
	}
	/*
	 * Simple object with only primitives for instance variables
	 */
	public Object1 createSimplePrimitive(){
		int prim1,prim2;
		System.out.println("2 simple primitives");
		System.out.println("Enter an integer: ");
		prim1 = scan.nextInt();
		System.out.println("Enter another integer");
		prim2 = scan.nextInt();

		Object1 prim = new Object1(prim1,prim2);
		return prim;
	}

	/*
	 * Object that contains references to other objects
	 */
	public Object2 createReferenceObject(){
		System.out.println("Reference objects");
		Object1 objectRef = createSimplePrimitive();
		Object2 reference = new Object2(objectRef);
		return reference;
	}

	/*
	 * Object that contains an array or primitives
	 */
	public Object3 createArrayPrimitives(){
		System.out.println("Array of primitives");
		System.out.println("Enter length of array");
		int length = scan.nextInt();
		int[] array = new int[length];
		//fill out the array then return the object with the array
		for (int i = 0; i < length; i++){
			System.out.println("Enter integer values");
			array[i] = scan.nextInt();
		}
		Object3 arrayPrim = new Object3(array);
		return arrayPrim;
	}


	/*
	 * Object that contains an array of object references

	public Object4 createArrayObject(){

	}
	*/

	/*
	 * Object that uses an instance of Java's collection classes

	public Object5 createObjectCollection(){

	}
	*/
}