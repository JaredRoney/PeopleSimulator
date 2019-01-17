import java.util.ArrayList;


class Person {
    public int age;
	private String name;
    private int birthday;
    private String gender;
    public String place;
    public Person spouse;
    public int thisPopulation;
    private ArrayList <Integer> haves = new ArrayList <Integer>();
    private ArrayList <Integer> wants = new ArrayList <Integer>();
    private boolean married = false;
    public int IQ = bellCurve(100,15);
    public int income = bellCurve(53719,30000);
    public int points = 0;
    public int mill = bellCurve(50,25);
    private boolean depressed;
    private boolean optimistic;
    private int happiness;


    public Person(int age, String name) {
        this.name = name;
        this.age = age;
        this.depressed = Math.random() < 0.15;
        this.optimistic = Math.random() < 0.15;
        this.happiness = 50;
        this.income = 10000; //comment this out at the end
    }

    public Person() {
        this.name = "Brad";
        this.age = 37;
    }

    public boolean olderThan(int otherAge) {
        if (age > otherAge) {
            return true;
        } else {
            return false;
        }

    }

    public String getName() {
        return name;
    }


	public Person(int age, String name,String gender,int birthdate,String place) {
		this.name = name;
		this.age = age;
        this.birthday = birthdate;
        this.gender = gender;
        this.place = place;
        this.spouse = null;
        for(int i = 0; i < 10; i++){
            haves.add((int)(Math.random()*10));
            wants.add((int)(Math.random()*10));
        }
    }


    public int getAge() {
        return age;
    }

    public void hadBirthday() {
        age++;
    }
    public boolean getDepressed(){
        if(age < 11){
            depressed = false;
        }
        return depressed;
    }
    public boolean getOptimistic(){
        if(age == 0){
            optimistic = Math.random() < 0.18;
        }
        return optimistic;
    }

    public int getHappiness(){
        if(depressed == true && age > 11){
            happiness = (int) Math.floor(Math.random() * 36);
        } else if(optimistic == true){
            happiness += (int) Math.floor(Math.random() * 15);
        }
        if(income <= 11000){
            happiness -= (int) Math.floor(Math.random() * 6);
        } else if(income >= 130000){
            happiness += (int) Math.floor(Math.random() * 15);
        }
        if(happiness > 100) {
            happiness = 100;
        } else if(happiness < 0) {
            happiness = 0;
        }

        return happiness;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public int getBirthday(){
        return birthday;
    }

    public ArrayList <Integer> getHaves(){
        return haves;
    }
    public ArrayList <Integer> getWants(){
        return wants;
    }

    public boolean isMarried(){
        return married;
    }

    public void gotMarriedTo(Person spouse){
        this.spouse = spouse;
    }

    public Person getSpouse(){
        if(spouse != null){
            return spouse;
        }else{
            return null;
        }
    }

     public static int bellCurve(int mean, int sd) {
		// make nombors gud
	    int i = mean - (3*sd);
	    int j = mean + (3*sd);
		int x = i;
		for(int c = i; c < j; c++) {
			double l = Math.random();
			if(l >= 0.5) {
				x++;
			}
		}
		return x;
     }

    public String getPlace(){
         return this.place;
     }
     public String changePlaceTo(String newPlace){
         this.place = newPlace;
         return ("Person " + this.name + "moved to " + newPlace);
     }
}