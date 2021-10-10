import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame(new Dimension(500, 500), "BTCチャート");
        frame.setLabel(getPrice());
        frame.setVisible(true);


        for (; ; ) {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            frame.setLabel(getPrice());

        }


    }

    private static String getPrice() {
        Document doc = null;
        try {
            doc = Jsoup.connect("https://www.google.com/search?q=BTC").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements elements = doc.select(".DFlfde.SwHCTb");
        return elements.get(0).text();
    }
}
