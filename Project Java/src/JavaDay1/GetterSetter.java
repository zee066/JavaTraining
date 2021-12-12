package JavaDay1;

public class GetterSetter {
private int g; //A PRIVATE GLOBAL VARIABLE 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

GetterSetter obj=new GetterSetter();
obj.setG(1200);
int globalvariable= obj.getG();
System.out.println(globalvariable);

	}

	public int getG() {// THIS METHOD IS TO GET THE VALUE
		return g;
	}

	public void setG(int g) {// THIS METHOD IS TO SET THE VALUE
		this.g = g; //NOW GLOBAL VARIABLE G IS EQUAL TO LOCAL VARIABLE g 
	}

}
