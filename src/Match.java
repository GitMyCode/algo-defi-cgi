import java.util.ArrayList;
import java.util.List;

/**
 * Created by MB on 7/1/14.
 */
public class Match {

    private List<TradeNode> clientTrades = new ArrayList<TradeNode>();
    private List<TradeNode> tpTrades = new ArrayList<TradeNode>();

     public List<TradeNode> getClientTrades() {
        return clientTrades;
    }

    public void setClientTrades(List<TradeNode> clientTrades) {
        this.clientTrades = clientTrades;
    }

    public List<TradeNode> getTpTrades() {
        return tpTrades;
    }

    public void setTpTrades(List<TradeNode> tpTrades) {
        this.tpTrades = tpTrades;
    }





}
