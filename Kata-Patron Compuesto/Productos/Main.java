package Productos;

public class Main {
    public static void main(String[] args) {
        ProductComponent laptop = new Product("Laptop", 1000);
        ProductComponent mouse = new Product("Mouse", 50);

        ProductPackage oficina = new ProductPackage("Oficina");
        oficina.add(laptop);
        oficina.add(mouse);

        oficina.showDetails();
    }
}
