package Formato;

public class BoldText extends TextDecorator {
    public BoldText(Text innerText) {
        super(innerText);
    }

    @Override
    public String render() {
        return "**" + innerText.render() + "**";
    }
}
