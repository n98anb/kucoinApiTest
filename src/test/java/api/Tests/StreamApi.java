package api.Tests;

import api.Data.TickerData;
import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class StreamApi {

    public final static String URL = "https://api.kucoin.com/api/v1/market/allTickers";

    /** Метод, который отправляет GET запрос и записывает все валюты в массив
     */
    public List<TickerData> getTickers(){
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get(URL)
                .then()
                .extract().jsonPath().getList("data.ticker", TickerData.class);
    }

    /**
     * Находит все валюты, оканчивающиеся на "USDT"
     */

    @Test
    public void checkCrypto(){
        List<TickerData> usdTickers = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT")).collect(Collectors.toList());
        Assert.assertTrue(usdTickers.stream().allMatch(x->x.getSymbol().endsWith("USDT")));
    }

    /**
     * Сортирует валюты от самых выросших, к самым упавшим, показывает 10 сымах выросших, проверяет что самая выросшая за сагодня
     * это "BABYBNB-USDT" (может быть другая, смотреть сайт)
     */

    @Test
    public void sortHighToLow(){
        List<TickerData> highToLow = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT")).sorted(new Comparator<TickerData>() {
            @Override
            public int compare(TickerData o1, TickerData o2) {
                return o2.getChangeRate().compareTo(o1.getChangeRate());
            }
        }).collect(Collectors.toList());
        int i =0;
        List<TickerData> high10 = highToLow.stream().limit(10).collect(Collectors.toList());
        Assert.assertEquals(high10.getFirst().getSymbol(), "BABYBNB-USDT");
    }
}
