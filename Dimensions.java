public class Dimensions {

    //final task 5.9.2.
    public final int height;
    public final int width;
    public final int length;

    public int volume(int height, int width, int length){
         return height*width*length;
    }

    public Dimensions(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(height, width, length);
    }



    public int getHeight() {
        return height;
    }

    public Dimensions setWidht(int width) {
        return new Dimensions(height, width, length);
    }

    public int getWidth() {
        return width;
    }

    public Dimensions setLength(int length) {
        return new Dimensions(height, width, length);
    }

    public int getLength() {
        return length;
    }

    public String toString(){
        return length + " * " + width + " * " + height;
    }
}
