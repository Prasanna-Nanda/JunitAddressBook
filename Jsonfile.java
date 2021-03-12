import InformationInput.JSONArray;
import JSONObject.JSONObject;
import JSONParser.JSONParser;
import PARSERException.ParserException;

import javax.swing.text.html.parser.Parser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;


public class ReadJsonFile {


    private static Object String;

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parser(new FileReader("myJson.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            System.out.println("Name is: " +name);
            String location = (String) jsonObject.get("location");
            System.out.println("location is: " +location);

            JSONArray coursesArray = (JsonArray) jsonObject.get("courses");
            Iterator<String> iterator = coursesArray.iterator();

            while(iterator.hasNext())
            {
                System.out.println("Course : " +iterator.next());
            }
        }
        catch (FileNotFoundException e) { e.printStackTrace();}
        catch (IOException e) { e.printStackTrace();}
        catch (ParserException e) { e.printStackTrace();}
        catch (Exception e) { e.printStackTrace();}
    }

    private static class JsonArray {
    }
}
