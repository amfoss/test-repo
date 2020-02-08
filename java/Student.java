

public class Student {
	private String name;
	private String rollNumber;
	private String favoriteFruit;
	private float height;
	private float weight;
	
	
	public Student() {
		name = null;
		rollNumber = null;
		favoriteFruit = null;
		height = 0;
		weight = 0;
		
	}
	
	public Student(String name,String rollNumber, String favoriteFruit, 
			float height, float weight) {
		
		this.name = name;
		this.rollNumber = rollNumber;
		this.favoriteFruit =favoriteFruit ;
		this.height = height;
		this.weight = weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRoll(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public void setFruit(String favoriteFruit) {
		this.favoriteFruit = favoriteFruit;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRoll() {
		return rollNumber;
	}
	
	public String getFruit() {
		return favoriteFruit;
	}
	
	public float getHeight() {
		return height;
	}
	
	public float getWeight() {
		return weight;
	}
	
	
		
	
	

}
