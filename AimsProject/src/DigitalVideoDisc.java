public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, int length, float cost){
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.length = length;
    }


    public java.lang.String getTitle() {
        return title;
    }
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost){
        super();
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, int length, float cost){
        super();
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.length = length;
    }


    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public java.lang.String getCategory() {
        return category;
    }

    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    public java.lang.String getDirector() {
        return director;
    }

    public void setDirector(java.lang.String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    private float cost;

}
