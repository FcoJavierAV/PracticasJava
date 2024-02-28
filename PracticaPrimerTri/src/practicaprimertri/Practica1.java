package practicaprimertri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import practicaprimertri.Producto;

public class Practica1 {

    private static Producto producto;
    private static String ruta = "./src/practicaprimertri/MiIventario.txt";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("Elije una opción 1(Procesar XML), 2(Guardar documento XML en fichero de texto), 3(Leer fichero de texto), 4(Crear objeto producto) o 5(Salir)");
            menu = sc.nextInt();
            switch (menu) {

                case 1:

                    try {

                    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                    DocumentBuilder db = dbf.newDocumentBuilder();
                    File fichXML = new File("./src/practicaprimertri/MiInventario.xml");
                    Document doc = db.parse(fichXML);

                    doc.getDocumentElement().normalize();

                    System.out.print("Elemento raiz:" + doc.getDocumentElement().getNodeName() + "\n");

                    NodeList listaEquipos = doc.getElementsByTagName("producto");

                    for (int i = 0; i < listaEquipos.getLength(); i++) {

                        Node nodo = listaEquipos.item(i);
                        Element elem = (Element) nodo;

                        System.out.print("\nSu código es " + elem.getAttribute("codigo"));

                        NodeList nodoHijos = elem.getChildNodes();

                        for (int j = 0; j < nodoHijos.getLength(); j++) {
                            Node nodoHijo = nodoHijos.item(j);

                            if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "peso".equals(nodoHijo.getNodeName())) {
                                System.out.print("\n Etiqueta: " + nodoHijo.getNodeName() + "\n" + " Valor:" + nodoHijo.getTextContent());
                            }
                            if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "nombre".equals(nodoHijo.getNodeName())) {
                                System.out.print("\n Etiqueta: " + nodoHijo.getNodeName() + "\n" + " Valor:" + nodoHijo.getTextContent());
                            }
                            if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "aula".equals(nodoHijo.getNodeName())) {
                                System.out.print("\n Etiqueta: " + nodoHijo.getNodeName() + "\n" + " Valor:" + nodoHijo.getTextContent());
                            }
                            if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "piso".equals(nodoHijo.getNodeName())) {
                                System.out.print("\n Etiqueta: " + nodoHijo.getNodeName() + "\n" + " Valor:" + nodoHijo.getTextContent() + "\n");
                            }
                        }
                    }
                } catch (ParserConfigurationException | SAXException | IOException ex) {
                    ex.printStackTrace();
                }

                break;

                case 2:

                    try {

                    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                    DocumentBuilder db = dbf.newDocumentBuilder();

                    File ficheroXML = new File("./src/practicaprimertri/MiInventario.xml");

                    Document documento = db.parse(ficheroXML);

                    documento.getDocumentElement().normalize();
                    BufferedWriter br = new BufferedWriter(new FileWriter(ruta));

                    br.write("Elemento raiz: " + documento.getDocumentElement().getNodeName() + System.getProperty("line.separator")
                            + "--------------------------------");

                    NodeList nl = documento.getElementsByTagName("producto");

                    for (int i = 0; i < nl.getLength(); i++) {
                        Node nodo = nl.item(i);

                        Element elem = (Element) nodo;

                        System.out.print("\nSu código es " + elem.getAttribute("codigo"));
                        br.write(System.getProperty("line.separator") + "Etiqueta:  codigo    ||  Valor: " + elem.getAttribute("codigo")
                                + System.getProperty("line.separator"));

                        NodeList nodosHijos = elem.getChildNodes();

                        for (int j = 0; j < nodosHijos.getLength(); j++) {
                            Node nHijos = nodosHijos.item(j);

                            if (nHijos.getNodeType() == Node.ELEMENT_NODE && "peso".equals(nHijos.getNodeName())) {

                                br.write(System.getProperty("line.separator") + "Etiqueta: " + nHijos.getNodeName() + "     ||  Valor: " + nHijos.getTextContent()
                                        + System.getProperty("line.separator"));
                            }

                            if (nHijos.getNodeType() == Node.ELEMENT_NODE && "nombre".equals(nHijos.getNodeName())) {

                                br.write(System.getProperty("line.separator") + "Etiqueta: " + nHijos.getNodeName() + "     ||  Valor: " + nHijos.getTextContent()
                                        + System.getProperty("line.separator"));
                            }

                            if (nHijos.getNodeType() == Node.ELEMENT_NODE && "aula".equals(nHijos.getNodeName())) {

                                br.write(System.getProperty("line.separator") + "Etiqueta: " + nHijos.getNodeName() + "     ||  Valor: " + nHijos.getTextContent()
                                        + System.getProperty("line.separator"));
                            }

                            if (nHijos.getNodeType() == Node.ELEMENT_NODE && "piso".equals(nHijos.getNodeName())) {

                                br.write(System.getProperty("line.separator") + "Etiqueta: " + nHijos.getNodeName() + "     ||  Valor: " + nHijos.getTextContent()
                                        + System.getProperty("line.separator"));
                            }

                        }

                    }
                    br.close();
                } catch (ParserConfigurationException | SAXException | IOException e) {
                    e.getStackTrace();
                }
                break;

                case 3:

                    try {

                    FileReader lector = new FileReader(ruta);
                    BufferedReader br = new BufferedReader(lector);

                    String linea = "";
                    int contador = 0;
                    do {
                        contador++;
                        linea = br.readLine();
                        if (linea != null) {
                            System.out.println(contador + ":" + linea);
                        }
                    } while (linea != null);

                    //cierro todo
                    br.close();
                    lector.close();

                } catch (FileNotFoundException e) {
                    System.out.println("No existe el fichero");
                    e.getMessage();
                } catch (IOException e) {
                    e.getMessage();
                }

                break;

                case 4:

                    String codigo,
                     peso = "",
                     nombre = "",
                     aula = "",
                     piso = "";

                    try {

                        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                        DocumentBuilder db = dbf.newDocumentBuilder();
                        File fichXML = new File("./src/practicaprimertri/MiInventario.xml");
                        Document doc = db.parse(fichXML);

                        doc.getDocumentElement().normalize();

                        System.out.print("Elemento raiz:" + doc.getDocumentElement().getNodeName() + "\n");

                        NodeList listaEquipos = doc.getElementsByTagName("producto");
                        for (int i = 0; i < listaEquipos.getLength(); i++) {

                            Node nodo = listaEquipos.item(i);
                            Element elem = (Element) nodo;

                            codigo = elem.getAttribute("codigo");

                            NodeList nodoHijos = elem.getChildNodes();

                            for (int j = 0; j < nodoHijos.getLength(); j++) {
                                Node nodoHijo = nodoHijos.item(j);

                                if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "peso".equals(nodoHijo.getNodeName())) {
                                    peso = nodoHijo.getTextContent();
                                }
                                if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "nombre".equals(nodoHijo.getNodeName())) {
                                    nombre = nodoHijo.getTextContent();
                                }
                                if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "aula".equals(nodoHijo.getNodeName())) {
                                    aula = nodoHijo.getTextContent();
                                }
                                if (nodoHijo.getNodeType() == Node.ELEMENT_NODE && "piso".equals(nodoHijo.getNodeName())) {
                                    piso = nodoHijo.getTextContent();
                                }
                            }
                            Producto pro = new Producto(codigo, peso, nombre, aula, piso);
                            System.out.println(pro);
                        }
                        System.out.println("Objeto creado correctamente");

                    } catch (ParserConfigurationException | SAXException | IOException ex) {
                        ex.printStackTrace();
                    }

                    break;

                case 5:
                    System.out.println("Saliendo del sistema");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }

        } while (menu != 5);

    }

}
