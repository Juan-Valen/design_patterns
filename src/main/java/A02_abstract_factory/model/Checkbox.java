package A02_abstract_factory.model;

public abstract class Checkbox {

    public String text;

    public abstract void display();

    public void setText(String text) {
        this.text = text;
    };

}
