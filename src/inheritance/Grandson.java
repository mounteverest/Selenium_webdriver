package inheritance;

public class Grandson extends GrandParent_inherit{
	//public class Grandson extends Son_Inherit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grandson prop = new Grandson();
		prop.country();
		prop.Language();
		System.out.println(prop.i);
		prop.state();
		//prop.quotations();
		
	}

}
//}