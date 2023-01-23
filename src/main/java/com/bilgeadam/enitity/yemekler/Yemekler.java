package com.bilgeadam.enitity.yemekler;

import com.bilgeadam.enitity.Enum.EtMalzemeler;
import com.bilgeadam.enitity.Menu;

public abstract class Yemekler extends Menu {
// nesnesi üretilemesin diye abstract
    private int hazirlanmaSuresi;

    public int getHazirlanmaSuresi() {
        return hazirlanmaSuresi;
    }

    public void setHazirlanmaSuresi(int hazirlanmaSuresi) {
        this.hazirlanmaSuresi = hazirlanmaSuresi;
    }

    public Yemekler(int fiyat, String ad, int urunId, int hazirlanmaSuresi) {
        super(fiyat, ad, urunId);
        this.hazirlanmaSuresi = hazirlanmaSuresi;
    }
    @Override
    public String toString() {
        return "AnaYemek{" +
                " hazirlanmaSuresi=" + hazirlanmaSuresi +
                " fiyat=" + getFiyat() +
                " ad=" + getAd() +
                " urun id=" + getUrunId() +
                '}';
    }
}
