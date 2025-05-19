package Formato;

public class UnderlineText extends TextDecorator {
    public UnderlineText(Text innerText) {
        super(innerText);
    }

    @Override
    public String render() {
        return "__" + innerText.render() + "__";
    }
}
