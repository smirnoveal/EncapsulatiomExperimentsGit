public class Cat {
    private String cat;
    private String name;
    private boolean breed;
    private double weight;

    public Cat(String name, boolean breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBreed() {
        return breed;
    }

    public void setBreed(boolean breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
