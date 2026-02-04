package A02_abstract_factory.model;

public class CheckboxA extends Checkbox {

    @Override
    public void display() {
        System.out.printf("[ ] %s\n", text);
    };
}
