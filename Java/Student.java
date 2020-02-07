
public class Student {
	private String name;
	private String rollNumber;
	private String favoriteFruit;
	private float height;
	private float weight;
	
	public Student(){
		this.name =null;
		this.rollNumber=null;
		this.favoriteFruit=null;
		this.height=0;
		this.weight=0;
	}
	
	public Student(String name,String rollNumber, String favoriteFruit,float height,float weight) {
		this.name=name;
		this.rollNumber=rollNumber;
		this.favoriteFruit=favoriteFruit;
		this.height=height;
		this.weight=weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setFavoriteFruit(String favoriteFruit) {
		this.favoriteFruit = favoriteFruit;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return this.name;
	}
	public String getRollNumber() {
		return this.rollNumber;
	}
	public String getFavouriteFruit() {
		return this.favoriteFruit;
	}
	public float getHeight() {
		return this.height;
	}
	public float getWeight() {
		return this.weight;
	}
}
