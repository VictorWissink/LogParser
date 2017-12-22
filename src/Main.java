import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class Main {



    public static void main(String[] args) {
        String path;

        //check if arguments are provided

        try {
            path = args[0];
            System.out.println(path);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Program has not found any arguments. Add a program argument that refers to a requirementslog in json");
            throw e;
        }

        try {

            File requirementLog = new File(path);
            String fileContents = FileUtils.readFileToString(requirementLog, "UTF-8");



            if (fileContents != null && fileContents.length() > 0 && fileContents.charAt(fileContents.length() - 3) == ',') {
                fileContents = fileContents.substring(0, fileContents.length() - 3);
            }

            String resultsJSONString = "[" + fileContents + ']';

            JsonElement jelement = new JsonParser().parse(resultsJSONString);

            JsonArray results = jelement.getAsJsonArray();

            System.out.println(results.get(1).toString() + "   " + results.size());


        } catch (IOException e) {
            System.out.println("can't read JSON file");

        }




//        File CP_file = new File(path);


    }
}
