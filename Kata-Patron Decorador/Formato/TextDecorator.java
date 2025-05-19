package Formato;

public abstract class TextDecorator implements Text {
    protected Text innerText;

    public TextDecorator(Text innerText) {
        this.innerText = innerText;
    }
}
