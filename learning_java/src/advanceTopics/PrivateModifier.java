package advanceTopics;

public class PrivateModifier {
	public static void main(String[] args) {
		}
	
private	String name;
private	int id;
		
public void setName(String n) {
	name=n;
}
public void setId(int i) {
	id=i;
}
public String getName() {
	return name;
}
public int getId() {
	return id;
}
}
 class Abc{
	public static void main(String[] args) {
		PrivateModifier pv=new PrivateModifier();
		pv.setName("Mamta");
		pv.setId(45);
		
		System.out.println(pv.getId());
		System.out.println(pv.getName());
	}	
}
 