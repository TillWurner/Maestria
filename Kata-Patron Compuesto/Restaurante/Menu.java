package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private String name;
    private List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (MenuComponent component : components) {
            total += component.getPrice();
        }
        return total;
    }

    @Override
    public void showDetails() {
        for (MenuComponent component : components) {
            component.showDetails();
        }
        System.out.println("Menú: " + name + ", Precio Total: $" + getPrice());
    }
}
