package com.tbsm.projectla;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;

import com.tbsm.projectla.models.MainModel;

/**
 * Find Contact, Location, and Organization Information from Document
 *
 */
public class App {
	private static final String testFile = "test.pdf";
	private static List<MainModel> mmList = new ArrayList<>();
    
	public static void main( String[] args ) {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		File file = new File(classLoader.getResource(testFile).getFile());
		
		System.out.println(readPdfDocument(file));
		
		// TODO: Search for Addresses in the Document and fill in MainModel and add to List
		mmList.add(new MainModel());
		
		// Print List of Main Models to Output
		int i = 0;
		for(MainModel mm : mmList) {			
			System.out.println( "********** " + ++i + " **********");
			System.out.println( "----- Contact -----");
			System.out.println( "Name: " + mm.getContactModel().getName() 
					+ ",  Phone: " + mm.getContactModel().getPhone()
					+ ",  Email: " + mm.getContactModel().getEmail()
					+ ",  Fax: " + mm.getContactModel().getFax()	);
			
			System.out.println( "----- Location -----");
			System.out.println("Location: " + mm.getLocationModel().getLocationName()
					+ " --- Address: " + mm.getLocationModel().getAddress() 					
					+ ",  City: " + mm.getLocationModel().getCity() 
					+ ", " + mm.getLocationModel().getState() 
					+ " " + mm.getLocationModel().getZip() 
					+ " - " + mm.getLocationModel().getCountry());
				System.out.println("Address Type: " + mm.getLocationModel().getAddressType()
					+ ",  Building Name: " + mm.getLocationModel().getBuildingName()
					+ ",  Complex Name: " + mm.getLocationModel().getComplexName()
					+ ",  County: " + mm.getLocationModel().getCounty()
					+ ",  Department: " + mm.getLocationModel().getDepartment()
					+ ",  Post Box: " + mm.getLocationModel().getPost_box()
					+ ",  Room: " + mm.getLocationModel().getRoom()
					+ ",  Sub Division: " + mm.getLocationModel().getSubDivision() );
			
			System.out.println( "----- Organization -----");
			System.out.println("Federal ID: " + mm.getOrganizationModel().getFederalId()
					+ ",  Legal Name: " + mm.getOrganizationModel().getLegalName()
					+ ",  Organization Name: " + mm.getOrganizationModel().getOrganization()
					+ ",  Place of Registration: " + mm.getOrganizationModel().getPlaceOfRegistration()
					+ ",  Incorporation Location: " + mm.getOrganizationModel().getIncorporationLocation()
					+ ",  Legal Classification: " + mm.getOrganizationModel().getLegalClassification() );
			
			System.out.println( " ");
			System.out.println( " ");
		}
		
    }

	private static String readPdfDocument(File file) {
    	try ( PDDocument document = PDDocument.load(file) ) {
       		document.getClass();
               
            if (!document.isEncrypted()) {            
            	PDFTextStripper stripper = new PDFTextStripper();
                return stripper.getText(document).trim();
            }

    	} catch (InvalidPasswordException e) {           
    		e.printStackTrace();
        } catch (IOException e) {           
            e.printStackTrace();
        }
    	return null;
    } 
}