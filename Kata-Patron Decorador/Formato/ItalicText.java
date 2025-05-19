package Formato;

public class ItalicText extends TextDecorator {
    public ItalicText(Text innerText) {
        super(innerText);
    }

    @Override
    public String render() {
        return "*" + innerText.render() + "*";
    }
}
