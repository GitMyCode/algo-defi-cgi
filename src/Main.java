import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * Created by MB on 7/1/14.
 */


public class Main{



    public static void main(String[]args){

        String lvl1_client = "level1/client-trades.txt";
        String lvl1_tp = "level1/TP-trades.txt";

        List<TradeNode> tradesClient = read_and_put_in_list(lvl1_client);
        Map<String,List<TradeNode>> mapTradesClient = map_list_with_group_key(tradesClient);

        List<TradeNode> tradesTP = read_and_put_in_list(lvl1_tp);
        Map<String,List<TradeNode>> mapTradesTP = map_list_with_group_key(tradesTP);

        System.out.println("Les transaction clients");

        Iterator<String> it = mapTradesClient.keySet().iterator();
        while (it.hasNext()){
            String group = it.next();
            System.out.println("Le group: " + group);

            List<TradeNode> listClient = mapTradesClient.get(group);
            for (int i=0; i < listClient.size(); i++){
                System.out.println(listClient.get(i));
            }
            System.out.println("\n");

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


    /*
    *
    * */
    static private Map<String,List<TradeNode>> map_list_with_group_key(List<TradeNode> tradeList ){
        Map<String, List<TradeNode>> map = new HashMap<String, List<TradeNode>>();

        for(int i =0; i< tradeList.size() ; i ++){
            TradeNode theTrade = tradeList.get(i);

            List<TradeNode> listTrades = map.get(theTrade.getGroup());
            if (listTrades == null){
                listTrades = new ArrayList<TradeNode>();
            }
            listTrades.add(theTrade);

            map.put(theTrade.getGroup(),listTrades);

        }

        return map;
    }
}

