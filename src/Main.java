import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by MB on 7/1/14.
 */

public class Main{

    public static void main(String[]args){
        System.out.println("allo");
        try{
            BufferedReader reader = new BufferedReader(new FileReader("level1/client-trades.txt"));
            ArrayList<String[]> clientTrade = new ArrayList<String[]>();
            String line = null;
            while( (line = reader.readLine()) != null){
                String[] tradeLine = new String[3];
                tradeLine = line.split(",");
                clientTrade.add(tradeLine);
            }


            while( !clientTrade.isEmpty()){
                System.out.println(clientTrade.remove(0)[0]);
            }

        }catch (Exception e ){
            System.out.println(e);
        }






    }
}

