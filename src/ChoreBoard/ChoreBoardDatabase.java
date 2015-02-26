/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChoreBoard;
import java.util.*;
/**
 *
 * @author idelgado
 */

public class ChoreBoardDatabase
{
    ArrayList<String> myDatabase;
    int dbLength;
    
    public ChoreBoardDatabase()
    {
       ChoresAndPointsImporter importData = new ChoresAndPointsImporter(); 
       myDatabase = importData.getImportedData();
       dbLength = myDatabase.size();
    }
    
    public String[] getChores()
    {
       String[] taskList = new String[dbLength/2];
       for(int i = 0; i < dbLength; i = i + 2)
       {
           taskList[i] = myDatabase.get(i);
       }
       return taskList;
    }
    
}
