package Restaurante;

public abstract class MenuComponent {
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void showDetails() {
        throw new UnsupportedOperationException();
    }

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }
}
