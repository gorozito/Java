package modelo;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class TestOCR {

	public TestOCR() {
		// TODO Auto-generated constructor stub
	}
	
	public static String leerBB() {
		
        ITesseract instance = new Tesseract();  // JNA Interface Mapping       
        //instance.setDatapath("C:\\Users\\nico\\eclipse-workspace\\Tess4J\\tessdata");
        String result = "FAIL"; 
        File img = new File("C:\\Users\\nico\\eclipse-workspace\\OCRpoliza\\src\\images\\image1.png");
        try { result = instance.doOCR(ImageIO.read(img)); } catch (TesseractException e) { System.err.println(e.getMessage()); } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //return result; // no quito los espacios porque el vacio me sirve para indicar que el villano esta en la mesa. 
        return result;
        //return result.replaceAll("\\s",""); // quito espacios en blanco
        // si retorna -1 es porque hubo un error en la lectura
        
	}

}
