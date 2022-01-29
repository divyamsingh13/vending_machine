import java.util.Objects;

public class Items {
    int id;
    String name;
    String manufacturer;
    int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Items(int id, String name, String manufacturer, int price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return id == items.id && price == items.price && Objects.equals(name, items.name) && Objects.equals(manufacturer, items.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, manufacturer, price);
    }
}
