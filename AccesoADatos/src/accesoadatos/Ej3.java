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

public class Ej3 {

    public static void main(String[] args) {

        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            File fichXML = new File("./src/accesoadatos/equipo_futbol.xml");
            Document doc = db.parse(fichXML);

            doc.getDocumentElement().normalize();

            System.out.println("Elemento raiz:" + doc.getDocumentElement().getNodeName());

            NodeList listaEquipos = doc.getElementsByTagName("equipo");
            for (int i = 0; i < listaEquipos.getLength(); i++) {

                Node nodo = listaEquipos.item(i);
                Element elem = (Element) nodo;

                NodeList nodoHijos = elem.getChildNodes();

                for (int j = 0; j < nodoHijos.getLength(); j++) {
                    Node nodoHijo = nodoHijos.item(j);

                    if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "nombre".equals(nodoHijo.getNodeName())) {
                        System.out.println("Etiqueta: " + nodoHijo.getNodeName() + " Valor:" + nodoHijo.getTextContent());
                    }
                    if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "ciudad".equals(nodoHijo.getNodeName())) {
                        System.out.println("Etiqueta: " + nodoHijo.getNodeName() + " Valor:" + nodoHijo.getTextContent());
                    }

                    if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "entrenador".equals(nodoHijo.getNodeName())) {
                        System.out.println("Etiqueta: " + nodoHijo.getNodeName() + " Valor:" + nodoHijo.getTextContent());
                    }
                    if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "jugadores".equals(nodoHijo.getNodeName())) {

                        Element elem2 = (Element) nodoHijo;

                        if (elem2.hasChildNodes()) {

                            NodeList listaJugador = elem2.getChildNodes();

                            for (int k = 0; k < listaJugador.getLength(); k++) {

                                Node nodo3 = listaJugador.item(k);

                                System.out.println(nodo3.getTextContent());

                            }
                        }

                    }

                }
            }
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            ex.printStackTrace();
        }

    }

}
