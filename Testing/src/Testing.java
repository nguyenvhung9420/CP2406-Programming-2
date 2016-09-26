import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by Jake on 14/09/2016.
 */
public class Testing {
    public static void main(String[] args) {
        ArrayList<String> arrays = new ArrayList<>();

        arrays.add("string1");
        arrays.add("string2");

        System.out.println(arrays.size());

        arrays.remove(0);
        arrays.remove(0);

        System.out.println(arrays.size());


//        // Code used to parse XML document based off code from http://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
//        try {
//            File inputFile = new File("MstCards_151021.plist");
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
//            Document doc = dBuilder.parse(inputFile);
//            //doc.getDocumentElement().normalize();
//            NodeList nList = doc.getElementsByTagName("dict");
//
//            for (int temp = 1; temp < nList.getLength(); temp++) {
//                Node nNode = nList.item(temp);
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) nNode;
////                    //Loop 2 times
////                    for (int i = 0; i < 2; i++){
////                        System.out.println(stringIndex);
////                        System.out.println(eElement.getElementsByTagName("key").item(keyIndex++).getTextContent() + ": " + eElement.getElementsByTagName("string").item(stringIndex++).getTextContent());
////                    }
//
//                    String cardFileName = eElement.getElementsByTagName("string").item(0).getTextContent();
//                    String cardImageName = eElement.getElementsByTagName("string").item(1).getTextContent();
//
//                    //Deal with cardType
////                    System.out.println(keyIndex);
////                    System.out.println(eElement.getElementsByTagName("key").item(keyIndex++).getTextContent() + ": " + eElement.getElementsByTagName("key").item(keyIndex).getTextContent());
//                    String cardType = eElement.getElementsByTagName("key").item(3).getTextContent();
//
//                    // check card type
//                    switch (cardType) {
//                        case "play":
////                            //Loop 4 times
////                            for (int i = 0; i < 4; i++) {
////                                System.out.println(stringIndex);
////                                System.out.println(eElement.getElementsByTagName("key").item(keyIndex++).getTextContent() + ": " + eElement.getElementsByTagName("string").item(stringIndex++).getTextContent());
////                            }
//
//                            String cardTitle = eElement.getElementsByTagName("string").item(2).getTextContent();
//                            String cardChemistry = eElement.getElementsByTagName("string").item(3).getTextContent();
//                            String cardClassification = eElement.getElementsByTagName("string").item(4).getTextContent();
//                            String cardCrystalSystem = eElement.getElementsByTagName("string").item(5).getTextContent();
//
//                            //Deal with array
//                            ArrayList<String> cardOccurrences = new ArrayList<>();
////                            System.out.println(eElement.getElementsByTagName("key").item(keyIndex++).getTextContent());
////                            // There are 5 more string tags in the play cardType after the array, algorithmically work out how many are in array
//                            for (int j = 6; j <= eElement.getElementsByTagName("string").getLength()-6; j++) {
////                                System.out.println(stringIndex);
////                                System.out.println("\t" + eElement.getElementsByTagName("string").item(stringIndex++).getTextContent());
//                                cardOccurrences.add(eElement.getElementsByTagName("string").item(j).getTextContent());
//                            }
//
//                            int stringIndex = eElement.getElementsByTagName("string").getLength() - 5;
//                            String cardHardness = eElement.getElementsByTagName("string").item(stringIndex++).getTextContent();
//                            String cardSpecificGravity = eElement.getElementsByTagName("string").item(stringIndex++).getTextContent();
//                            String cardCleavage = eElement.getElementsByTagName("string").item(stringIndex++).getTextContent();
//                            String cardCrustalAbundance = eElement.getElementsByTagName("string").item(stringIndex++).getTextContent();
//                            String economicValue = eElement.getElementsByTagName("string").item(stringIndex++).getTextContent();
//
//
////                            //Loop 5 times
////                            for (int i = 0; i < 5; i++) {
////                                System.out.println(stringIndex);
////                                System.out.println(eElement.getElementsByTagName("key").item(keyIndex++).getTextContent() + ": " + eElement.getElementsByTagName("string").item(stringIndex++).getTextContent());
////                            }
//
////                            card = new Card();
//
//                            break;
//                        case "trump":
//                            //Loop 2 times
//                            for (int i = 0; i < 2; i++){
////                                System.out.println(stringIndex);
////                                System.out.println(eElement.getElementsByTagName("key").item(keyIndex++).getTextContent() + ": " + eElement.getElementsByTagName("string").item(stringIndex++).getTextContent());
//                            }
//                            break;
//                        case "rule":
//                            //Loop 2 times
//                            for (int i = 0; i < 2; i++){
////                                System.out.println(stringIndex);
////                                System.out.println(eElement.getElementsByTagName("key").item(keyIndex++).getTextContent() + ": " + eElement.getElementsByTagName("string").item(stringIndex++).getTextContent());
//                            }
//                            break;
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
