package entity;

public class Photo  {
    private int width;
    private int length;
    String path;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Photo(int width, int length, String path) {
        this.width = width;
        this.length = length;
        this.path = path;
    }


}
