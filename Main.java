public class Main
{

    public static void main(String[] args)
    {
        Printer printer = new Printer(10,0,false);

        printer.fillUpToner(50);

        printer.print();
        System.out.println("Toner level = " +printer.getTonerLevel() + "\nIs duplex printer ? " + printer.isDuplexPrinter());

    }

}
