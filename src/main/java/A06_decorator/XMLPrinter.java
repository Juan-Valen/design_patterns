package A06_decorator;

class XMLPrinter implements Printer {
    private Printer printer;

    public XMLPrinter(Printer printer) {
        this.printer = printer;
    }

    public void print(String text) {
        printer.print("<message>"+text+"</message>");
    }
}
