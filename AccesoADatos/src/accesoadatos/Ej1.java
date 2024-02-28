package accesoadatos;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Ej1 {

    public static void main(String[] args) {

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            File fichXML = new File("./src/accesoadatos/ejemplo.xml");
            Document doc = db.parse(fichXML);
            doc.getDocumentElement().normalize();

            System.out.println("Elemento raiz:" + doc.getDocumentElement().getNodeName());
            NodeList listaAnimales = doc.getElementsByTagName("animal");

            for (int i = 0; i < listaAnimales.getLength(); i++) {
            
                Node nodo = listaAnimales.item(i);
              
                Element elem = (Element) nodo;
              
                System.out.println("El valor de id es: " + elem.getAttribute("id"));

                NodeList nodoHijos = elem.getChildNodes();

                for (int j = 0; j < nodoHijos.getLength(); j++) {
                    Node nodoHijo = nodoHijos.item(j);
  
                    if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "nombre".equals(nodoHijo.getNodeName())) {
                        System.out.println("Etiqueta: " + nodoHijo.getNodeName() + " Valor:" + nodoHijo.getTextContent());
                    }
                    if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "tipo".equals(nodoHijo.getNodeName())) {
                        System.out.println("Etiqueta: " + nodoHijo.getNodeName() + " Valor:" + nodoHijo.getTextContent());
                    }

                    if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "color".equals(nodoHijo.getNodeName())) {
                        System.out.println("Etiqueta: " + nodoHijo.getNodeName() + " Valor:" + nodoHijo.getTextContent());
                    }
                    if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "edad".equals(nodoHijo.getNodeName())) {
                        System.out.println("Etiqueta: " + nodoHijo.getNodeName() + " Valor:" + nodoHijo.getTextContent());
                    }
                }
            }
            System.out.println("------------FIN DE LECTURA DE DOCUMENTO XML-------------");

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace();
        }

    }

}
