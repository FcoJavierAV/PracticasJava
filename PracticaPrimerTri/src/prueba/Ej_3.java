package ej_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Ej_3 {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            File ficheroXML = new File("./equipo_futbol.xml");

            Document documento = db.parse(ficheroXML);

            documento.getDocumentElement().normalize();
            BufferedWriter br = new BufferedWriter(new FileWriter("./equipo_futbol.txt", true));
            
            
            System.out.println("Elemento raiz: " + documento.getDocumentElement().getNodeName() + System.getProperty("line.separator")
                    + "--------------------------------");
            br.write("Elemento raiz: " + documento.getDocumentElement().getNodeName() + System.getProperty("line.separator")
                    + "--------------------------------");
            
            NodeList nl = documento.getElementsByTagName("equipo");
            
            for (int i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);
                
                Element elemento = (Element) nodo;

                NodeList nodosHijos = elemento.getChildNodes();
                
                for (int j = 0; j < nodosHijos.getLength(); j++) {
                    Node nHijos = nodosHijos.item(j);
                    
                    if (nHijos.getNodeType() == Node.ELEMENT_NODE && "nombre".equals(nHijos.getNodeName())) {
                        System.out.println("Etiqueta: " + nHijos.getNodeName() + "     ||  Valor: " + nHijos.getTextContent());
                        br.write(System.getProperty("line.separator") + "Etiqueta: " + nHijos.getNodeName() + "     ||  Valor: " + nHijos.getTextContent()
                       + System.getProperty("line.separator"));
                    }
                    if (nHijos.getNodeType() == Node.ELEMENT_NODE && "ciudad".equals(nHijos.getNodeName())) {
                        System.out.println("Etiqueta: " + nHijos.getNodeName() + "     ||  Valor: " + nHijos.getTextContent());
                        br.write(System.getProperty("line.separator") + "Etiqueta: " + nHijos.getNodeName() + "     ||  Valor: " + nHijos.getTextContent()
                        + System.getProperty("line.separator"));
                    }

                    if (nHijos.getNodeType() == Node.ELEMENT_NODE && "entrenador".equals(nHijos.getNodeName())) {
                        System.out.println(System.getProperty("line.separator") + "Etiqueta: " + nHijos.getNodeName() + " ||  Valor: " + nHijos.getTextContent());
                        br.write(System.getProperty("line.separator") + "Etiqueta: " + nHijos.getNodeName() + "     ||  Valor: " + nHijos.getTextContent()
                        + System.getProperty("line.separator"));
                    }
                    if (nHijos.getNodeType() == Node.ELEMENT_NODE && "jugadores".equals(nHijos.getNodeName())) {
                        Element elemento_2 = (Element) nodo;
                        if (elemento_2.hasChildNodes()) {
                            NodeList nodosHijos_2 = nHijos.getChildNodes();
                            for (int k = 0; k < nodosHijos_2.getLength(); k++) {
                                Node nodosHijos_3 = nodosHijos_2.item(k);
                                
                                System.out.print(nodosHijos_3.getTextContent());
                                br.write(nodosHijos_3.getTextContent());
                            }
                        }
                    }
                }
                
            }
            br.close();
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.getStackTrace();
        }
    }

}
