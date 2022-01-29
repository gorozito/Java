package modelo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(TestOCR.leerBB());
		/*
		try {
		    File img = new File("C:\\Users\\nico\\eclipse-workspace\\OCRpoliza\\src\\images\\image1.png");
		    BufferedImage image = ImageIO.read(img ); 
		    System.out.println(image);
		} catch (IOException e) { 
		    e.printStackTrace(); 
		}
		*/
	}

}
