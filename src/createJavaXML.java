import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class createJavaXML {
    public static void main(String[] args) {
        try {

            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            //创建一个新的document对象
            Document document=builder.newDocument();
            //创建根节点
            Element  root=document.createElement("LANGUAGE");
            root.setAttribute("cat","it");

            Element lan1=document.createElement("lan");
            lan1.setAttribute("id","1");
            Element name1=document.createElement("name");
            name1.setTextContent("JAVA");
            Element ide1=document.createElement("ide");
            ide1.setTextContent("ECLIPSE");
            lan1.appendChild(name1);
            lan1.appendChild(ide1);

            Element lan2=document.createElement("lan");
            lan2.setAttribute("id","2");
            Element name2=document.createElement("name");
            name2.setTextContent("SWIFT");
            Element ide2=document.createElement("ide");
            ide2.setTextContent("XCODE");
            lan1.appendChild(name2);
            lan1.appendChild(ide2);

            Element lan3=document.createElement("lan");
            lan3.setAttribute("id","3");
            Element name3=document.createElement("name");
            name3.setTextContent("C#");
            Element ide3=document.createElement("ide");
            ide3.setTextContent("VISUAL STUDIO");
            lan3.appendChild(name3);
            lan3.appendChild(ide3);

            root.appendChild(lan1);
            root.appendChild(lan2);
            root.appendChild(lan3);
            document.appendChild(root);

            System.out.println("=================================");
            //System.out.println(document.toString()); //不能这样直接输出
            //输出
            TransformerFactory transformerFactory=TransformerFactory.newInstance();
            Transformer        transformer=transformerFactory.newTransformer();
            StringWriter writer=new StringWriter();
            transformer.transform(new DOMSource(document),new StreamResult(writer));
            System.out.println(writer.toString());

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
