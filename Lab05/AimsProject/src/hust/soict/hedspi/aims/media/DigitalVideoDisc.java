package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Media{

    private String director;
    private int length;
    //classifier member and instance member

    private static int nbDigitalVideoDisc = 0;

    public static void setNbDigitalVideoDisc(int nbDigitalVideoDisc) {
        DigitalVideoDisc.nbDigitalVideoDisc = nbDigitalVideoDisc;
    }

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
