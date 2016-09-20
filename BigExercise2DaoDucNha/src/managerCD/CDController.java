
package managerCD;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.SAXException;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 19-9-2016 
 * Class CDController to manager list cd
 */
public class CDController {

    List<CD> listCds = new ArrayList<>();
    Database db = new Database();

    //Create new cd output a new cd
    public CD createNewCD() throws IOException, NumberFormatException {
        CD nCd = new CD();
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input Name CD: ");
            String name = input.readLine();
            System.out.println("Input Name Singer: ");
            String singer = input.readLine();
            System.out.println("Input number song of CD: ");
            int numberSongs = Integer.parseInt(input.readLine());
            System.out.println("Input price of CD: ");
            double price = Double.parseDouble(input.readLine());
            nCd = new CD(name, singer, numberSongs, price);
            return nCd;
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return nCd;
    }

    //Add a cd to SQL file
    public void addNewCD(CD c) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            String sql = "insert into cd values (null, '" + c.getName()
                    + "', '" + c.getSinger() + "', " + c.getNumberSongs()
                    + ", " + c.getPrice() + ");";
            PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Add a new CD susscess!!!");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Eror: " + ex.getMessage());
        }
    }

    //return list cd from sql file
    public List<CD> getListCD() throws SQLException, ClassNotFoundException {
        List<CD> lsCd = null;
        try (Connection conn = db.connect()) {
            lsCd = new ArrayList<>();
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM `cd`";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                CD cd = new CD();
                cd.setId(resultSet.getInt("id"));
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setNumberSongs(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));
                lsCd.add(cd);
            }
            conn.close();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return lsCd;
    }

    //Search cd by name and output list cd have name like
    public void searchCD(String name) throws IOException, NumberFormatException, SQLException, ClassNotFoundException {
        List<CD> lCDs;
        try (Connection conn = db.connect()) {
            lCDs = new ArrayList<>();
            java.sql.Statement statement = conn.createStatement();
            String sql = "select * from cd where name like '%" + name + "%';";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                CD cd = new CD();
                cd.setId(resultSet.getInt("id"));
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setNumberSongs(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));
                lCDs.add(cd);
            }
            conn.close();
            lCDs.stream().forEach((CD element) -> System.out.println(element.toString()));
        } catch (NumberFormatException | SQLException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.toString());
        }
    }

    //update number song and price of CD by id
    public void updateCD(int id) throws IOException, SQLException, ClassNotFoundException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try (Connection conn = db.connect()) {

            System.out.println("Input new number song of CD: ");
            int newNumberSongs = Integer.parseInt(input.readLine());
            System.out.println("Input new Pricer of CD: ");
            double newPrice = Double.parseDouble(input.readLine());
            String sql = "update cd set  numbersongs = " + newNumberSongs + ", price = " + newPrice + " where id = " + id;

            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Update susscess!!!");
        } catch (IOException | SQLException | ClassNotFoundException e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    //remove  a CD by id
    public void removeCD(int id) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            String sql = "delete from cd where id = " + id;
            java.sql.PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Remove CD susscess!!!");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    //output list cd in database
    public void printListCD() throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            List<CD> l = this.getListCD();
            l.stream().forEach((CD c) -> System.out.println(c.toString()));
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //add list cd from database to file cd.txt
    public void addCDToFile() throws IOException, SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            List<CD> list = this.getListCD();
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/managerCD/cd.txt"));
            out.writeInt(list.size());

            for (CD element : list) {
                out.writeObject(element);
                out.flush();
            }
            out.reset();
            out.close();
            System.out.println("Add List Cd from database susscess!!!");
        } catch (IOException | SQLException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //read list cd from file cd.txt
    public void readCDtoFile() throws IOException, ClassNotFoundException {
        try {
            List<CD> list = new ArrayList<>();
            FileInputStream file = new FileInputStream("src/managerCD/cd.txt");
            if (file.available() != 0) {
                ObjectInputStream in = new ObjectInputStream(file);
                int size = in.readInt();

                for (int i = 0; i < size; i++) {
                    list.add((CD) in.readObject());
                }
                in.close();
                list.stream().forEach((CD cd) -> System.out.println(cd.toString()));
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //read list cd from database and add list to file cd.xml 
    public void addListCDToXMLFile() throws IOException, SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            listCds = this.getListCD();
            try {
                DocumentBuilderFactory docfFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docfFactory.newDocumentBuilder();
                Document doc = docBuilder.newDocument();

                Element rootElement;
                String filePath = "src/managerCD/cd.xml";
                File xmlFile = new File(filePath);

                //root elements
                if (xmlFile.isFile()) {
                    doc = docBuilder.parse(xmlFile);
                    doc.getDocumentElement().normalize();
                    rootElement = doc.getDocumentElement();

                } else {
                    rootElement = doc.createElement("CDs");
                    doc.appendChild(rootElement);
                }

                //remove all element in xml file
                while (rootElement.hasChildNodes()) {
                    rootElement.removeChild(rootElement.getFirstChild());
                }

                
                for (int i = 0; i < listCds.size(); i++) {
                    
                    //element cd
                    Element cd = doc.createElement("cd");
                    rootElement.appendChild(cd);

                    //element id
                    Element id = doc.createElement("id");
                    id.appendChild(doc.createTextNode(Integer.toString(listCds.get(i).getId())));
                    cd.appendChild(id);

                    //element name
                    Element name = doc.createElement("name");
                    name.appendChild(doc.createTextNode(listCds.get(i).getName()));
                    cd.appendChild(name);
                    //element singer
                    Element singer = doc.createElement("singer");
                    singer.appendChild(doc.createTextNode(listCds.get(i).getSinger()));
                    cd.appendChild(singer);

                    //element numberSongs
                    Element numberSongs = doc.createElement("numbersongs");
                    numberSongs.appendChild(doc.createTextNode(Integer.toString(listCds.get(i).getNumberSongs())));
                    cd.appendChild(numberSongs);

                    //element price
                    Element price = doc.createElement("price");
                    price.appendChild(doc.createTextNode(Double.toString(listCds.get(i).getPrice())));
                    cd.appendChild(price);
                }

                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();

                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File(filePath));
                transformer.transform(source, result);
                System.out.println("Add list CD to XML File is sussess!!!");

            } catch (Exception e) {
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    //get a CD in file cd.xml
    public CD getCD(Node node) {
        CD cd1 = new CD();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            int id = Integer.parseInt(element.getElementsByTagName("id").item(0).getTextContent());
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            String singer = element.getElementsByTagName("singer").item(0).getTextContent();
            int numbersongs = Integer.parseInt(element.getElementsByTagName("numbersongs").item(0).getTextContent());
            double price = Double.parseDouble(element.getElementsByTagName("price").item(0).getTextContent());
            cd1 = new CD(id, name, singer, numbersongs, price);
        }
        return cd1;
    }

    //get list Cd from cd.xml and return a list cd, if cd.xml empty return null
    public List<CD> getListCdFromXMLFile() throws IOException, ParserConfigurationException, SAXException {
        String filePath = "src/managerCD/cd.xml";
        File file = new File(filePath);
        List<CD> listcd = null;
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;
        try {
            docBuilder = docFactory.newDocumentBuilder();
            org.w3c.dom.Document doc = docBuilder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("cd");
            listcd = new ArrayList<>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                listcd.add(getCD(nodeList.item(i)));
            }
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return listcd;
    }
}
