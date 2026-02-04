package A02_abstract_factory.factory;

import A02_abstract_factory.model.*;

public interface UIFactory {

    public Button createButton();

    public Checkbox createCheckbox();

    public TextField createTextField();

}
