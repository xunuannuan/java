public abstract class Tv
{
 public abstract void play();
}
public class HaierTv extends Tv
{
 public void play(){
  System.out.println("This is HaierTv.");
  }
}
public class HisenseTv extends Tv
{
 public void play(){
  System.out.println("This is HisenseTv.");
  }
}
public interface TVFactory
{
 public TV produceTV();
}
public class HaierTVFactory implements TVFactory
{
 public TV produceTV(){
  return new HaierTV();
  }
}
public class HisenseTVFactory implements TVFactory
{
 public TV produceTV(){
  return new HisenseTV();
  }
}
<?xml version="1.0"?>
<config>
    <brandName>HisenseTv</brandName>
</config>
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtilTV
{
 public static String getBrandName()
 {
  try{
   DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
   DocumentBuilder builder = dFactory.newDocumentBuilder();
   Document doc = builder.parse(new File("configTV.xml"));

   NodeList n1 = doc.getElementsByTagName("brandName");
   Node classNode = n1.item(0).getFirstChild();
   String brandName = classNode.getNodeValue().trim();

   return brandName;
  }catch(EXception e){
   System.out.prineln(e.getMessage());
   return null;
  }
 }
}
public class Main
{
 public static void main(String args[]){
  TV tv;
  String brandName = XMLUtilTV.getBrandName();
  tv = TVFactory.produceTv(brandName);
  tv.play();
 }
}