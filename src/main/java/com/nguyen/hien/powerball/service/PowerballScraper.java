package com.nguyen.hien.powerball.service;

import java.io.IOException;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PowerballScraper {

    public void scrapePastPowerballResults(){
        JSONObject jsonObject = new JSONObject();

        Document doc = null;
        for (int i = 1; i < 11; i++) {

            try {
                doc = Jsoup.connect("http://www.calottery.com/play/draw-games/powerball/winning-numbers/?page=" + i).get();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Elements rows = doc.select("tr");
            for (Element row : rows) {
                Elements columns = row.select("td");

                for (Element column : columns) {
                    Elements spans = column.select("span");
                    //System.out.print(column.text());
                    for (Element span : spans) {
                        if (span.text().length() == 2) {
                            System.out.print(span.text() + " ");
                        } else {
                            if (span.text().length() > 5)
                                System.out.print(span.attr("title") + ": ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
