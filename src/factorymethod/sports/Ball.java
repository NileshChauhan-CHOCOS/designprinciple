package factorymethod.sports;

public abstract class Ball {
    private int weight;
    private String material;
    private double radius;
    private String imagesUrl;

    public int getWeight() {
        return weight;
    }

    public Ball setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getMaterial() {
        return material;
    }

    public Ball setMaterial(String material) {
        this.material = material;
        return this;
    }

    public double getRadius() {
        return radius;
    }

    public Ball setRadius(double radius) {
        this.radius = radius;
        return this;
    }

    public String getImagesUrl() {
        return imagesUrl;
    }

    public Ball setImagesUrl(String imagesUrl) {
        this.imagesUrl = imagesUrl;
        return this;
    }
}
