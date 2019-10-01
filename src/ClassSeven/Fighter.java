package ClassSeven;

public class Fighter {
    //ATTRIBUTES
    private String name;
    private String nationality;
    private int age;
    private float height;
    private float weight;
    private String category;
    private int wins, loses, ties;

    //SPECIAL METHODS


    public Fighter(String nameConst, String nationalityConst, int ageConst, float heightConst, float weightConst, int winsConst, int losesConst, int tiesConst) {
        this.name = nameConst;
        this.nationality = nationalityConst;
        this.age = ageConst;
        this.height = heightConst;
        this.setWeight(weightConst);
        this.wins = winsConst;
        this.loses = losesConst;
        this.ties = tiesConst;
    }

    //METHODS
    public void introduce() {
        System.out.println("===== INTRODUCE =====");
        System.out.println("Name " + this.getName());
        System.out.println("Nationality " + this.getNationality());
        System.out.println("Age " + this.getAge());
        System.out.println("Height " + this.getHeight());
        System.out.println("Weight " + this.getWeight());
        System.out.println("Wins " + this.getWins());
        System.out.println("Loses " + this.getLoses());
        System.out.println("Ties " + this.getTies());
    }

    public void status() {
        System.out.println("***** STATUS *****");
        System.out.println(this.getName());
        System.out.println(this.getCategory());
        System.out.println(this.getWeight() + " Wins");
        System.out.println(this.getLoses() + " Loses");
        System.out.println(this.getTies() + " Ties");
    }

    public void winFight() {
        this.setWins(this.getWins() + 1);
    }

    public void loseFight() {
        this.setLoses(this.getLoses() + 1);
    }

    public void tieFight() {
        this.setTies(this.getTies() + 1);
    }

    //GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
        this.setCategory();
    }

    public String getCategory() {
        return category;
    }

    private void setCategory() {
        if (this.weight < 52.2) {
            this.category = "Invalid";
        } else if (this.weight <= 73.0) {
            this.category = "Light";
        } else if (this.weight <= 83.9) {
            this.category = "Medium";
        } else if (this.weight <= 120.2) {
            this.category = "Heavy";
        } else {
            this.category = "Invalid";
        }
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }
}
