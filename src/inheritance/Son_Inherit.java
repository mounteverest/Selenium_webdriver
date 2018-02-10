package inheritance;

public class Son_Inherit extends GrandParent_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son_Inherit prop = new Son_Inherit();
		prop.country();
		prop.state();
		prop.Language();
		System.out.println(prop.i);
	}
	
	public void quotations(){
		System.out.println("Welcome to this World!");
	}
	
	
}
