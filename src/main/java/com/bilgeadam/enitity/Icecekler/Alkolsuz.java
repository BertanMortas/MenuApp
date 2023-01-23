package com.bilgeadam.enitity.Icecekler;

public abstract class Alkolsuz extends Icecekler{

    public Alkolsuz(int fiyat, String ad, int urunId) {
        super(fiyat, ad, urunId, true);
    }
}
