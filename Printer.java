public class Printer {

   private int tonerLevel;
   private int pagesPrinted;
   private boolean duplexPrinter;


    public void fillUpToner(int amountOfTonerAdded)
    {
        if (amountOfTonerAdded > 0 && amountOfTonerAdded <= 100 && tonerLevel + amountOfTonerAdded <= 100)
        {
            tonerLevel += amountOfTonerAdded;
            System.out.println("Toner added = " + amountOfTonerAdded + "\n" + "New toner volume = " + this.tonerLevel);
        }
        else
        {
            System.out.println("Maximum volume of the toner container has been exceeded. \nToner volume = " + this.tonerLevel);
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100 && this.tonerLevel + tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
            System.out.println("Toner level = " + this.tonerLevel);
        }
        this.duplexPrinter = duplexPrinter;
        if (duplexPrinter){
            System.out.println("Printer type = Duplex");
        }
        else
        {
            System.out.println("Printer type = Normal");
        }
    }

    public void print()
    {
        if (duplexPrinter)
        {
            pagesPrinted += 2;
            tonerLevel -= 2;
            System.out.println("Two pages printed. \nTotal pages printed = " +this.pagesPrinted + "Toner level = " + this.tonerLevel);
        }
        else
        {
            pagesPrinted += 1;
            tonerLevel -= 1;
            System.out.println("One page printed \nTotal pages printed = " + this.pagesPrinted + "\nToner level = "+ this.tonerLevel);
            pagesPrinted++;
        }
    }
}
