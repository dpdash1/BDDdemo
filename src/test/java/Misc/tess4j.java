package Misc;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class tess4j {

	public static void main(String[] args) {
		
		File imageFile = new File("C:\\Users\\dp_da\\Downloads\\HINDUNILVR_Daily_02-01-2020.png");
		ITesseract instance = new Tesseract();
		
		try {
			String result = instance.doOCR(imageFile);
			System.out.println(result);
			} catch (TesseractException e) {
			System.err.println(e.getMessage());
			}

	}

}
