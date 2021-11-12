package com.company;

import java.io.Serializable;
import java.util.Comparator;

public class Currency implements Serializable {
    private static final long serialVersionUID = -2958706369661932574L;
    public static Comparator<Currency> byNameAsc = Comparator.comparing((o) -> {
        return o.getCurrency();
    });
    public static Comparator<Currency> byNameDesc = (o1, o2) -> {
        return o2.getCurrency().compareTo(o1.getCurrency());
    };
    public static Comparator<Currency> byIdAsc = (o1, o2) -> {
        return o1.getId() > o2.getId() ? 1 : (o1.getId() < o2.getId() ? -1 : 0);
    };
    public static Comparator<Currency> byIdDesc = (o1, o2) -> {
        return o1.getId() < o2.getId() ? 1 : (o1.getId() > o2.getId() ? -1 : 0);
    };
    private int id;
    private String pointDate;
    private String date;
    private double ask;
    private double bid;
    private double trendAsk;
    private double trendBid;
    private String currency;

    public Currency() {
    }

    public String toString() {
        String var10000 = this.currency.toUpperCase();
        return "\n" + var10000 + " [id: " + this.id + " pointDate: " + this.pointDate + " date: " + this.date + " ask: " + String.format("%2.2f", this.ask) + " bid: " + String.format("%2.2f", this.bid) + " trendAsk: " + String.format("%2.2f", this.trendAsk) + " trendBid: " + String.format("%2.2f", this.trendBid) + "]";
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPointDate() {
        return this.pointDate;
    }

    public void setPointDate(String pointDate) {
        this.pointDate = pointDate;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAsk() {
        return this.ask;
    }

    public void setAsk(double ask) {
        this.ask = ask;
    }

    public double getBid() {
        return this.bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public double getTrendAsk() {
        return this.trendAsk;
    }

    public void setTrendAsk(double trendAsk) {
        this.trendAsk = trendAsk;
    }

    public double getTrendBid() {
        return this.trendBid;
    }

    public void setTrendBid(double trendBid) {
        this.trendBid = trendBid;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
