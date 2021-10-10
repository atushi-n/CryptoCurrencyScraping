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
        frame.setVisible(true);


        for (; ; ) {

            Document doc = null;
            try {
                doc = Jsoup.connect("https://www.google.com/search?q=BTC").get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Elements elements = doc.select(".DFlfde.SwHCTb");
            frame.setLabel(elements.get(0).text());

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
