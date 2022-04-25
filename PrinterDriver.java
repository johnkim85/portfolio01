package pP1;

interface Printable{
	public void print(String doc);
}
class SprinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}
class LPrinterDriver implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}
public class PrinterDriver {
	public static void main(String[] args) {
		String myDoc="This is a report about...";
		Printable prn=new SprinterDriver();
		prn.print(myDoc);
		System.out.println();
		prn=new LPrinterDriver();
		prn.print(myDoc);
	}
}