package com.bilgeadam.enitity.yemekler;

import com.bilgeadam.enitity.Enum.EtMalzemeler;

public class Hamburger extends Yemekler {

    public Hamburger() {
        super(130, "Hamburger", 3330, 30);
        if (EtMalzemeler.kirmiziEt.equals(getAd())){

        }

    }
}
