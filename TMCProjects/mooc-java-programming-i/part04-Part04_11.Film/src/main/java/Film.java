public class Film {
    private int filmAgeRating;
    private String name;

    public Film(String name, int ageRating) {
        this.name = name;
        this.filmAgeRating = ageRating;
    }
    
    public String name(){
        return this.name;
    }

    public int ageRating(){
        return this.filmAgeRating;
    }
}