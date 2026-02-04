package A02_abstract_factory.model;


public class ButtonA extends Button {

    @Override
    public void display() {
        System.out.printf("[ %s ]\n", text);
    };
}
