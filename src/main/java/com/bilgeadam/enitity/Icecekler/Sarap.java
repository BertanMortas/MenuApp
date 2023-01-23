package com.bilgeadam.enitity.Icecekler;

public class Sarap extends Icecekler{
    public Sarap(boolean yasBuyuk18) {
        super(90, "sarap", 2030, yasBuyuk18);
        if (!yasBuyuk18) {
            setFiyat(0);
            setAd(null);
            setUrunId(0);
        }
    }
}
