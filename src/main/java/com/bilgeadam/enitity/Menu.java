package com.bilgeadam.enitity;

public abstract class Menu {
    // her ürün de ortak olduğu için abstract ve nesnesi olamsın
    private int fiyat;
    private String ad;
    private int urunId;

    public int getFiyat() {
        return fiyat;
    }

    public Menu(int fiyat, String ad, int urunId) {
        this.fiyat = fiyat;
        this.ad = ad;
        this.urunId = urunId;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "fiyat=" + fiyat +
                ", ad='" + ad + '\'' +
                ", urunId=" + urunId +
                '}';
    }
}
