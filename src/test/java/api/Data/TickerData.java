package api.Data;

public class TickerData {
    private String symbol;
    private String symbolName;
    private String buy;
    private String sell;
    private String bestBidSize;
    private String bestAskSize;
    private String changeRate;
    private String changePrice;
    private String high;
    private String low;
    private String vol;
    private String volValue;
    private String last;
    private String averagePrice;
    private String takerFeeRate;
    private String makerFeeRate;
    private String takerCoefficient;
    private String makerCoefficient;

    public TickerData(String symbol, String symbolName, String buy, String sell, String bestBidSize, String bestAskSize, String changeRate, String changePrice, String high, String low, String vol, String volValue, String last, String averagePrice, String takerFeeRate, String makerFeeRate, String takerCoefficient, String makerCoefficient) {
        this.symbol = symbol;
        this.symbolName = symbolName;
        this.buy = buy;
        this.sell = sell;
        this.bestBidSize = bestBidSize;
        this.bestAskSize = bestAskSize;
        this.changeRate = changeRate;
        this.changePrice = changePrice;
        this.high = high;
        this.low = low;
        this.vol = vol;
        this.volValue = volValue;
        this.last = last;
        this.averagePrice = averagePrice;
        this.takerFeeRate = takerFeeRate;
        this.makerFeeRate = makerFeeRate;
        this.takerCoefficient = takerCoefficient;
        this.makerCoefficient = makerCoefficient;
    }

    public TickerData() {
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public String getBuy() {
        return buy;
    }

    public String getSell() {
        return sell;
    }

    public String getBestBidSize() {
        return bestBidSize;
    }

    public String getBestAskSize() {
        return bestAskSize;
    }

    public String getChangeRate() {
        return changeRate;
    }

    public String getChangePrice() {
        return changePrice;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getVol() {
        return vol;
    }

    public String getVolValue() {
        return volValue;
    }

    public String getLast() {
        return last;
    }

    public String getAveragePrice() {
        return averagePrice;
    }

    public String getTakerFeeRate() {
        return takerFeeRate;
    }

    public String getMakerFeeRate() {
        return makerFeeRate;
    }

    public String getTakerCoefficient() {
        return takerCoefficient;
    }

    public String getMakerCoefficient() {
        return makerCoefficient;
    }
}
