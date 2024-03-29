import java.util.*;
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
			object = createArrayObject();
		}
		else if(input.equals("5")){
			object = createObjectCollection();
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
	 */
	public Object4 createArrayObject(){
		System.out.println("Array of object references");
		System.out.println("Enter length of array");
		int length = scan.nextInt();
		Object1[] arrObj = new Object1[length];
		for (int i=0; i<length;i++){
			Object1 object = createSimplePrimitive();
			arrObj[i] = object;
		}
		Object4 arrayRef = new Object4(arrObj);
		return arrayRef;
	}


	/*
	 * Object that uses an instance of Java's collection classes
	 */
	public Object5 createObjectCollection(){
		boolean want = true;
		ArrayList<Object1> collection = new ArrayList<Object1>();
		while (want){
			System.out.println("press 'y' to add to collection and 'n' to exit");
			String input = scan.nextLine();
			if(input.equals("y")){
				Object1 prim = createSimplePrimitive();
				collection.add(prim);
			}
			else if (input.equals("n")){
				want = false;
			}
			else{
				System.out.println("Only enter 'y' or 'n' ");
			}
		}
		Object5 collectionObject = new Object5(collection);
		return collectionObject;
	}
}