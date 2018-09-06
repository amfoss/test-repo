public class Student{
	



		private String name;
		private String rollNumber;
		private String favoriteFruit;
		private float height;
		private float weight;

		public Student(){
			this.name = "null";
        this.rollNumber = "nothing";
        this.favoriteFruit = "nothing";
        this.height = 0;
        this.weight = 0;
		}

		public Student(String name, String rollNumber, String favoriteFruit, float height, float weight) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.favoriteFruit = favoriteFruit;
        this.height = height;
        this.weight = weight;
    }

		public String getName(){
			return this.name;
		}
		public String getrollNumber(){
			return this.rollNumber;
		}
		public String getfavoriteFruit(){
			return this.favoriteFruit;
		}
		public float getHeight(){
			return this.height;
		}
		public float getWeight(){
			return this.weight;
		}

		public void setName(String xname){
			this.name = xname;
		}
		public void setrollNumber(String xroll){
			this.rollNumber = xroll;
		}
		public void setfavoriteFruit(String xfav){
			this.favoriteFruit = xfav;
		}
		public void setHeight(float xheight){
			this.height = xheight;
		}
		public void setWeight(float xweight){
			this.weight = xweight;
		}
	}
