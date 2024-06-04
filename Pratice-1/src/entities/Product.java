package entities;

public class Product {
    private Integer id;
    private String name;
    private Double price;

    public Product() {
    }

    public Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //    função para aumentar o preço do produto
    public void increasePrice(double percentage) {
        price += price * percentage / 100;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("R$%.2f", price);
    }
}
