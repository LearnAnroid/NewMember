package sax2;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import jdk.nashorn.internal.ir.ContinueNode;
//sax đọc theo từng tag thứ tự từ trên xuống
public class saxbook {	
	static boolean flag=false;
	boolean priceflag=false;

		 public static void main(String argv[]) {

			    try {

				SAXParserFactory factory = SAXParserFactory.newInstance();
				SAXParser saxParser = factory.newSAXParser();

				DefaultHandler handler = new DefaultHandler() {

		

				public void startElement(String uri, String localName,String qName, 
			                Attributes attributes) throws SAXException {

					//System.out.println("start element: "+qName);
					if(qName.equals("book")){
						flag=true;
						
						
					}
					
						

				}

				public void endElement(String uri, String localName,
					String qName) throws SAXException {
					
					
					//System.out.println("End Element :" + qName);
					

				}

				public void characters(char ch[], int start, int length) throws SAXException {
					
				String str=new String(ch, start, length);
					
				
				}
			     };

			       saxParser.parse("C:\\Users\\everything\\Desktop\\lap trinh huong dich vu\\sax2\\src\\sax2\\book.xml", handler);
			 
			     } catch (Exception e) {
			       e.printStackTrace();
			     }
			  
			   }
	}

