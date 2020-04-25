package Main;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.*;

public class DataFrame {
    public ArrayList<String[]> records;

    public DataFrame(String Name){

        this.records =  new ArrayList<String[]>();
        int i=0;

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(Name));
            while ((line = br.readLine()) != null)
            {
                String l[] = line.split(cvsSplitBy);
                this.records.set(i, l);
                i++;
            }

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

    }

    public void show(){
        for(String L[]: this.records){
            for (String S: L){
                System.out.println(S);
            }
        }
    }
}
