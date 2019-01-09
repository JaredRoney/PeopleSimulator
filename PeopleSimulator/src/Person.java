class Person {
    public int age;
    private String name;
    private boolean depressed;
    private int happiness;
    public int income; //comment this out at the end

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
        this.depressed = Math.random() < 0.15;
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
    public int getHappiness(){
        if(depressed == true && age > 11){
            happiness = (int) Math.floor(Math.random() * 36);
            if(income < 11000){
                happiness -= (int) Math.floor(Math.random() * 6);
            }
        }
        return happiness;
    }

    public int changeHappiness(int percentChange) {
        happiness += percentChange;
        if(happiness > 100) {
            happiness = 100;
        } else if(happiness < 0) {
            happiness = 0;
        }
        return happiness;
    }
}