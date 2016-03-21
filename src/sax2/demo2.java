package sax2;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import jdk.nashorn.internal.ir.ContinueNode;
//sax đọc theo từng tag thứ tự từ trên xuống
public class demo2 {
	 public static void main(String argv[]) {

		    try {

			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();

			DefaultHandler handler = new DefaultHandler() {

			boolean bfname = false;
			boolean bfage = false;
			boolean bnname = false;
			boolean bsalary = false;
			boolean falg=false;

			public void startElement(String uri, String localName,String qName, 
		                Attributes attributes) throws SAXException {

				System.out.println("start element: "+qName);
				if(attributes.getLength()!=0){
					for(int i=0;i<attributes.getLength();i++){
						System.out.println("thuộc tính:"+attributes.getLocalName(i)+"="+attributes.getValue(i));
					}
				}
				//System.out.println("start element"+qName);
				/*try {
					if(attributes.getValue("id") != null){
						System.out.println("// atributes "+attributes.getValue("id"));
						
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				if(qName.equals("studentkind")){
					if(attributes.getValue(0).equals("s002")){
						
						falg=true;
						
						}
				}
				if(falg){
                	if (qName.equalsIgnoreCase("name")) {
						bfname = true;
					}

					if (qName.equalsIgnoreCase("age")) {
						bfage = true;
					}
				
				}
				
				
				
				
				
				
				
				
				
				/*
				try {
					if(attributes.getValue(0).equals("s02")){	
						System.out.println("Start Element :" + qName);
		                     falg=true;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
					
                    if(falg){
                    	if (qName.equalsIgnoreCase("name")) {
    						bfname = true;
    					}

    					if (qName.equalsIgnoreCase("age")) {
    						bfage = true;
    					}
                    }*/
				

			}

			public void endElement(String uri, String localName,
				String qName) throws SAXException {
				
				
				System.out.println("End Element :" + qName);
				/*if(qName.equals("studentkind")){
					
					bfname=false;
					bfage=false;
					falg=false;
				}*/
				

				//System.out.println("End Element :" + qName);
				//if(qName.equals("student")){
					//System.out.println("End Element :" + qName);
					//bfname=false;
					//bfage=false;
					//falg=false;
				//}
				

			}

			public void characters(char ch[], int start, int length) throws SAXException {
				System.out.println( new String(ch, start, length).trim());
			/*	if (bfname) {
					System.out.println("name : " + new String(ch, start, length));
					bfname=false;
					
				}

				if (bfage) {
					System.out.println("age : " + new String(ch, start, length));
					bfage=false;
				}

			*/
			}
		     };

		       saxParser.parse("src\\sax2\\onenew.xml", handler);
		 
		     } catch (Exception e) {
		       e.printStackTrace();
		     }
		  
		   }
}
