package A14_builder;

import com.sun.javafx.collections.SourceAdapterChange;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);

        director.constructComputer();

        Computer pc = builder.getComputer();

        System.out.println("Gaming Computer:");
        System.out.println(builder.getComputer());

        builder = new OfficeComputerBuilder();
        director = new ComputerDirector(builder);

        director.constructComputer();

        pc = builder.getComputer();

        System.out.println("Office Computer:");
        System.out.println(builder.getComputer());
    }

}
