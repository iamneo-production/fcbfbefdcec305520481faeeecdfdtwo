package home.coder.project.workspace.springapp.src.main.java.com.examly.springapp.model;

public class Laptop {
    private int laptopId;
    private String laptopBrand;
    private int laptopPrice;

    public Laptop() {
    }

    public Laptop(int laptopId, String laptopBrand, int laptopPrice) {
        this.laptopId = laptopId;
        this.laptopBrand = laptopBrand;
        this.laptopPrice = laptopPrice;
    }

    // Getter methods
    public int getLaptopId() {
        return laptopId;
    }

    public String getLaptopBrand() {
        return laptopBrand;
    }

    public int getLaptopPrice() {
        return laptopPrice;
    }

    // Setter methods
    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public void setLaptopPrice(int laptopPrice) {
        this.laptopPrice = laptopPrice;
    }
}
