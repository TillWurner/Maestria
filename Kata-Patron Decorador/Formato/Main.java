package Formato;

public class Main {
    public static void main(String[] args) {
        Text simpleText = new PlainText("Hola Mundo");

        Text bold = new BoldText(simpleText);

        System.out.println("Texto: " + bold.render()); 
    }
}
