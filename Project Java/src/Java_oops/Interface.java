package Java_oops;
// IN INTERFACE ALL METHODS ARE ABSTRACT BY DEFAULT
public interface Interface {
public void java() throws InterruptedException;
public void html();
public abstract void python();}
// THE INTERFACE IS NOT ALLOWING US TO CREATE NON ABSTRACT METHOD
/*public void group() {
	// Subclass (inherit from Animal)
	class Pig extends Animal {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Main {
	  public static void main(String[] args) {
	    Pig myPig = new Pig(); // Create a Pig object
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}
// ALSO WE CAN NOT CREATE THE OBJECT OF THE INTERFACE 	
	
}
}*/
