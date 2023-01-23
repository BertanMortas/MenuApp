package com.bilgeadam.enitity.Icecekler;

import com.bilgeadam.enitity.Menu;

public abstract class Icecekler extends Menu {
    private boolean yasBuyuk18;

    public Icecekler(int fiyat, String ad, int urunId, boolean yasBuyuk18) {
        super(fiyat, ad, urunId);
        this.yasBuyuk18 = yasBuyuk18;
    }

    public boolean isYasBuyuk18() {
        return yasBuyuk18;
    }

    public void setYasBuyuk18(boolean yasBuyuk18) {
        this.yasBuyuk18 = yasBuyuk18;
    }

    @Override
    public String toString() {
        return "Icecekler{" +
                "fiyatı=" + getFiyat() +
                " ad=" + getAd() +
                " urun id=" + getUrunId() +
                " yaş sınırı geçilme=" + isYasBuyuk18() +
                '}';
    }
}
