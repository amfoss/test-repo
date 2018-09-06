public class Student {

	private String name;
	private String rollNumber;
	private String favoriteFruit;
	private float height;
	private float weight;
	
	Student(){
		
	}
	
	Student(String name,String rollNumber,String favoriteFruit,float height,float weight){
		this.name=name;
		this.favoriteFruit=favoriteFruit;
		this.rollNumber = rollNumber;
		this.weight = weight;
		this.height = height;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRollNumber(String roll) {
		this.rollNumber = roll;
	}
	
	public void setFavoriteFruit(String fruit) {
		this.favoriteFruit = fruit;
	}
	
	public void setWeight(float w) {
		this.weight = w;
	}
	
	public void setHeight(float h) {
		this.height = h;
	}
	
	public String getName() {
		return name;
	}

	public String getRolNumber() {
		return rollNumber;
	}

	public String getFavoriteFruit() {
		return favoriteFruit;
	}

	public float getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
	}

}
