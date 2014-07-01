import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MB on 7/1/14.
 */


public class Main{



    public static void main(String[]args){
        System.out.println("allo");

        String lvl1_client = "level1/client-trades.txt";
        String lvl1_tp = "level1/TP-trades.txt";

        List<TradeNode> tradesClient = read_and_put_in_list(lvl1_client);
        List<TradeNode> tradesTP = read_and_put_in_list(lvl1_tp);


        System.out.println("Les transaction clients");
        for (int i=0; i < tradesClient.size(); i++){
            System.out.println(tradesClient.get(i));
        }
    }


    /*
    * This methode receive a file path and read it. It puts the lines in a TradeNode object then insert
    * this object in a List<TradeNode>. The list is return
    * */
    static private List<TradeNode> read_and_put_in_list( String fileToRead){

        List<TradeNode> tradeNodeList = new ArrayList<TradeNode>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileToRead));
            String line = null;
            while( (line = reader.readLine()) != null){
                TradeNode node = new TradeNode(line);
                tradeNodeList.add(node);
            }
        }catch (Exception e ){
            System.out.println(e);
        }

        return  tradeNodeList;
    }
}

