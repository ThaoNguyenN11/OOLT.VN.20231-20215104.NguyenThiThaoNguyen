public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    //classifier member and instance member

    private static int nbDigitalVideoDisc = 0;
    private int id;
    public int getId(){
        return id;
    }
    public DigitalVideoDisc(){
        nbDigitalVideoDisc++;
        id = nbDigitalVideoDisc;
    }
    public int getNbDigitalVideoDisc(){
        return nbDigitalVideoDisc;
    }
    pubic void setId(){
        id = getNbDigitalVideoDisc();
        nbDigitalVideoDisc++;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
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

}


