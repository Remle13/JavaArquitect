package mx.coppel.java;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class App 
{
	private static String FILE = "C:\\JavaArchitect\\example.pdf";
	
	public static void main( String[] args )
    {        
        try {

        	System.out.println( "Inicio Generar PDF" );
			
        	Document document = new Document();
            
        	PdfWriter.getInstance(document, new FileOutputStream(FILE));
        	document.open();            
            
        	Paragraph paragraph = new Paragraph("TEXTO EXPORTADO A PDF");
        	document.add(paragraph); 
            
        	document.close();
            
        	System.out.println( "Fin Generar PDF" );
        } catch (Exception e) {
        	e.printStackTrace();
        }        
    }     
}
