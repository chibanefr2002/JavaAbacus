package abstraction;

public class TestComputer {
	public static void main(String[] args){
		Abacus abacus = new DesktopComputer();
		abacus.addNumbers();
		abacus.substract();
		Calculator calculator = new DesktopComputer();
		calculator.division();
		calculator.multiply();
		
		DesktopComputer desktopComputer = new DesktopComputer();
		desktopComputer.squareRoots();
		desktopComputer.exponential();
		
		Lcd lcd = new DesktopComputer();
		lcd.lcdScreen();
		
		Laptop laptop = new Laptop();
		laptop.sonyLaptop();
		Transistor Transistor = new UltraThinLaptop();
		Transistor.generateBinaryNumbers();
		//Keyboard keyboard = new DesktopComputer();
		//keyboard.WirelessKeyboard();
		
	}

}
