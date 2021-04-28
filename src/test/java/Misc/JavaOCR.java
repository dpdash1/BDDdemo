package Misc;

import com.asprise.ocr.Ocr;

public class JavaOCR {

	public static void main(String[] args) {
		
		
		Ocr.setUp();
		Ocr ocr = new Ocr();
		ocr.startEngine("eng", Ocr.SPEED_SLOW);
		//String s = ocr.recognize("C:\\Users\\dxd265\\Downloads\\HDFC_Daily_02-01-2020.png", 0, 0, 0, 0, 0, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT, args);
		//String s = ocr.recognize("C:\\Users\\dxd265\\Downloads\\HDFC_Daily_02-01-2020.png", -1, 55, 439, 152, 453, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		//good one
		//String s = ocr.recognize("C:\\Users\\dxd265\\Downloads\\HDFC_Daily_02-01-2020.png", -1, 50, 440, 153, 455, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);

		String s = ocr.recognize("C:\\Users\\dp_da\\Downloads\\INFY_Daily_02-01-2020.png", 0, 55, 440, 153, 453, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		String s1 = ocr.recognize("C:\\Users\\dp_da\\Downloads\\HINDUNILVR_Daily_02-01-2020.png", 0, 55, 440, 153, 453, Ocr.RECOGNIZE_TYPE_TEXT, Ocr.OUTPUT_FORMAT_PLAINTEXT);
		System.out.println("Result: " + s);
		System.out.println("Result: " + s1);
		ocr.stopEngine();

	}

}
