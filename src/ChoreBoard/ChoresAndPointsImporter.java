/*
 * This class will read in the CSV file and import it into the database 
 */
package ChoreBoard;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author idelgado
 */
public class ChoresAndPointsImporter
{
    String csvFile = "E:\\NetbeansWorkspace\\ChoreBoard\\src\\ChoreBoard\\ChoresAndPoints.csv";
    BufferedReader br;
    String line = "";
    String csvSplitBy = ",";
    ArrayList<String> chores = new ArrayList<String>();
    
    public ChoresAndPointsImporter()
    {
       try
       {
          br = new BufferedReader(new FileReader(csvFile));
          
          while((line = br.readLine()) != null)
          {
             for(String element : line.split(csvSplitBy))
             {
                chores.add(element);
             }
             
          }
        }
       catch(IOException io)
       {
           System.out.println("Could Not Find" + csvFile);
       }
    }
    
    public ArrayList getImportedData()
    {
       return chores;
    }
}
