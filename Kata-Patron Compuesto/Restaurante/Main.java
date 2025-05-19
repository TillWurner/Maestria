package Restaurante;

public class Main {
    public static void main(String[] args) {
        MenuComponent pizza = new MenuItem("Pizza", 10);
        MenuComponent ensalada = new MenuItem("Ensalada", 5);

        Menu almuerzo = new Menu("Almuerzo");
        almuerzo.add(pizza);
        almuerzo.add(ensalada);

        almuerzo.showDetails();
    }
}
