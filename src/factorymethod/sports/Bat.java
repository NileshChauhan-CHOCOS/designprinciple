package factorymethod.sports;

public abstract class Bat {
    private int length;
    private int width;
    private String material;
    private String imageUrls;

    public int getLength() {
        return length;
    }

    public Bat setLength(int length) {
        this.length = length;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Bat setWidth(int width) {
        this.width = width;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public Bat setMaterial(String material) {
        this.material = material;
        return this;
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public Bat setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
        return this;
    }
}
