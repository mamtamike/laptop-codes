package advanceTopics;

public class MyConstructor {

	public MyConstructor(String myName, int myId) {
		 id=myId;
		 name=myName;
	}
	
	private String name;
	private int id;

	public void setName(String n) {
		this.name=n;
		}
	public void setId(int i) {
		this.id=i;
		}
	public String getName() {
		return name;
		}
	public int getId() {
		return id;
		}
	
}

