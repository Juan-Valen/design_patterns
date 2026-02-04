package A02_abstract_factory.factory;

import A02_abstract_factory.model.*;

public class BFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new ButtonB();
    };

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxB();
    };

    @Override
    public TextField createTextField() {
        return new TextFieldB();
    };

}
