import dataProvider.TestData;
import java.util.*;

public class FindTrade {

    public static void main(String[] args) {
        // call data provider to get the prices
        TestData data = new TestData();
        System.out.print(data.getPrices().get(3).getPrice());

        // build the edges with the price 

        // call bellmand ford algorithm (which contains cycle detection algorithm)

        // return the path of the trade with the calculated profit
    }
}