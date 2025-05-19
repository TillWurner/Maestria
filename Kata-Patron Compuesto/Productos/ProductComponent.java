package Productos;

public abstract class ProductComponent {
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public void showDetails() {
        throw new UnsupportedOperationException();
    }

    public void add(ProductComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(ProductComponent component) {
        throw new UnsupportedOperationException();
    }
}
