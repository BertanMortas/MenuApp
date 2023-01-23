package com.bilgeadam.enitity.Icecekler;

public class Bira extends Alkollu {
    public Bira(boolean yasBuyuk18) {
        super(70, "bira", 2010, yasBuyuk18);
        if (!yasBuyuk18) {
            setFiyat(0);
            setAd(null);
            setUrunId(0);
        }
    }
}
