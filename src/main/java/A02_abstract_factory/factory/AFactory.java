package A02_abstract_factory.factory;

import A02_abstract_factory.model.*;

public class AFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new ButtonA();
    };

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxA();
    };

    @Override
    public TextField createTextField() {
        return new TextFieldA();
    };

}
