import model.BlackAndWhitePrinter;
import model.ColorPrinter;
import model.Printer;

public class PrinterTest {
    public static void main(String[] args) {
        Printer printer1 = new Printer();
        Printer printer2 = new ColorPrinter();
        Printer printer3 = new BlackAndWhitePrinter();
        printer1.printing();
        printer2.printing();
        printer3.printing();
    }
}
