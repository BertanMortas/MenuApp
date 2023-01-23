package com.bilgeadam.enitity.Icecekler;

public abstract class Alkollu extends Icecekler {

    public Alkollu(int fiyat, String ad, int urunId, boolean yasBuyuk18) {
        super(fiyat, ad, urunId, yasBuyuk18);

    }
    public String toString() {
        return "Icecekler{" +
                "fiyatı=" + getFiyat() +
                " ad=" + getAd() +
                " urun id=" + getUrunId() +
                " yaş sınırı geçilme=" + isYasBuyuk18() +
                '}';
    }
}
