package vijay;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class MyProgram {

	public static void main(StringProgram[] args) throws InterruptedException, AWTException {

		Robot r = new Robot();
		int count = 0;

		System.out.println("Started");
		for (int i = 0; i < 1000; i++) {
			count++;
			Thread.sleep(30000);
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
			Thread.sleep(30000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			System.out.println(count);
         
		}
	}
}
