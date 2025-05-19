package Productos;

import java.util.ArrayList;
import java.util.List;

public class ProductPackage extends ProductComponent {
    private String name;
    private List<ProductComponent> components = new ArrayList<>();

    public ProductPackage(String name) {
        this.name = name;
    }

    @Override
    public void add(ProductComponent component) {
        components.add(component);
    }

    @Override
    public void remove(ProductComponent component) {
        components.remove(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (ProductComponent component : components) {
            total += component.getPrice();
        }
        return total;
    }

    @Override
    public void showDetails() {
        for (ProductComponent component : components) {
            component.showDetails();
        }
        System.out.println("Paquete: " + name + ", Precio Total: $" + getPrice());
    }
}
