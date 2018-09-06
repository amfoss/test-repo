
    public class Student {

        private String name;
        private String rollno;
        private String fruitname;
        private float height;
        private float weight;
    
        public Student(String name,String rollno,String frutiname,float height,float weight){
            this.name=name;
            this.rollno=rollno;
            this.fruitname=frutiname;
            this.height=height;
            this.weight=weight;
        }
    
        public Student(){
            this.name="Bala Sai Praneeth";
            this.rollno="U$CSE17508";
            this.fruitname="apple";
            this.height=5;
            this.weight=62;
        }
    
        public String getName(){
            return name;
        }
        public String getrollno(){
            return rollno;
        }
        public String getfrutiname(){
            return fruitname;
        }
    
        public float getHeight(){
            return height;
        }
    
        public float getWeight(){
            return weight;
        }
    
        public void setName(String name){
            this.name=name;
        }
    
        public void setrollno(String rollno){
            this.rollno=rollno;
        }
    
        public void setFruitName(String fruitname){
            this.fruitname=fruitname;
        }
        public void setHeight(float height){
            this.height=height;
        }
        public void setWeight(float weight){
            this.weight=weight;
        }
    }
