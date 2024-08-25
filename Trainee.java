public class Trainee {
    
    
    
    private String name;
    private String sex;
    private double weight;
    private double height;
    private int age;
    private String fG;
    private String dP;
    private String date;
    
    
    
    // constructor methods
    public Trainee() {
        
        
        name = "";
        sex = "";
        weight = 0;
        height = 0;
        age = 0;
        fG = "";
        dP = "";
        date = "";
        
        
    } // end of Trainee method
    
    
    
    public Trainee(String n, String s, double w, double h, int a, String f, String dietPlan, String d) {
        
        
        name = n;
        sex = s;
        weight = w;
        height = h;
        age = a;
        fG = f;
        dP = dietPlan;
        date = d;
        
        
        
    } // end of Trainee method
    
    
    
    // class methods
    public void setName(String n) {
        
        
        name = n;
        
        
    } // end of setName method
    
    
    
    public String getName() {
        
        
        return name;
        
        
    } // end of getName method
    
    
    
    public void setSex(String s) {
        
        
        sex = s;
        
        
    } // end of setSex method
    
    
    
    public String getSex() {
        
        
        return sex;
        
        
    } // end of getSex method
    
    
    
    public void setWeight(double w) {
        
        
        weight = w;
        
        
    } // end of setWeight method
    
    
    
    public double getWeight() {
        
        
        return weight;
        
        
    } // end of getWeight method
    
    
    
    public void setHeight(double h) {
        
        
        height = h;
        
        
    } // end of setHeight method
    
    
    
    public double getHeight() {
        
        
        return height;
        
        
    } // end of getHeight method
    
    
    
    public void setAge(int a) {
        
        
        age = a;
        
        
    } // end of setAge method
    
    
    
    public int getAge() {
        
        
        return age;
        
        
    } // end of getAge method
    
    
    
    public void setFitnessGoal(String f) {
        
        
        fG = f;
        
        
    } // end of setFitnessGoal method
    
    
    
    public String getFitnessGoal() {
        
        
        return fG;
        
        
    } // end of getFitnessGoal method
    
    
    
    public void setDietPlan(String dietPlan) {
        
        
        dP = dietPlan;
        
        
    } // end of setDietPlan method
    
    
    
    public String getDietPlan() {
        
        
        return dP;
        
        
    } // end of getDietPlan method
    
    
    
    public void setDate(String d) {
        
        
        date = d;
        
        
    } // end of setDate method
    
    
    
    public String getDate() {
        
        
        return date;
        
        
    } // end of getDate method
    
    
    
} // end of class
