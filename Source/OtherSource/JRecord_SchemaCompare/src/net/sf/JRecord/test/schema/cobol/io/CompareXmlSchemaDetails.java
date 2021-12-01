package net.sf.JRecord.test.schema.cobol.io;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;

import net.sf.JRecord.JRecordInterface1;
import net.sf.JRecord.def.IO.builders.IIOBuilder;
import net.sf.JRecord.test.schema.cobol.gen.data.LayoutDtls;

/**
 * Purpose:  Compare the 'Layout' read from a file against the one
 *          Generated by JRecord.
 *            This is to support testing of JRecord for multiple 
 *          Xml schema's.
 * 
 * @author Bruce Martin
 *
 */
public class CompareXmlSchemaDetails {

	public CompareXmlSchemaDetails(IParms parms) throws IOException {
		String[] filenames = parms.getFileNames();
		Comparator<String> cmp = String.CASE_INSENSITIVE_ORDER;
		CompareLayoutDtls copmpareLayouts = new CompareLayoutDtls();
		
		ReadJrSchema reader = new ReadJrSchema(parms.getInputFileName());
		
		LayoutDtls schema = reader.read();
		int nameCompare = 0;
		
		if (schema == null) {
			throw new RuntimeException("Compare File is empty");
		}
		
		for (String fn : filenames) {
			String filename = new File(fn) .getName();
			while (schema != null && (nameCompare = cmp.compare(filename, schema.copyBookDtls.getCopybookName())) > 0) {
				schema = reader.read();
			}
			
			if (schema == null) {
				System.out.println("Error eof of compare file reached at copybook: " + fn);
				return;
			}
			
			
			if (nameCompare == 0) { // i.e. They equals
				if (schema.dialectDtls != null) {
					try {
						IIOBuilder iob = JRecordInterface1.SCHEMA_XML
									.newIOBuilder(fn);
						copmpareLayouts.compare( iob.getLayout(), schema );		
					} catch (Exception e) {
						System.out.println("Skipping Copybook: " + fn + " Due to load error- " + e);
						e.printStackTrace();
						schema = reader.read();
						break;
					}
				}
				schema = reader.read();
			} else {
				System.out.println("Skipping Copybook: " + fn + " No Matching record on the compare file");
			}
		}
		System.out.println("Processed File: " + parms.getInputFileName());
	}
	
}
