package A02_abstract_factory;

import A02_abstract_factory.factory.*;
import A02_abstract_factory.model.*;

public class Main {

    public static void main(String[] args) {
        UIFactory ui = new BFactory();
        Checkbox checkbox = ui.createCheckbox();
        checkbox.setText("Good");
        TextField textfield = ui.createTextField();
        Button button = ui.createButton();
        button.setText("submit");

        checkbox.display();
        textfield.display();
        button.display();

    }
}
