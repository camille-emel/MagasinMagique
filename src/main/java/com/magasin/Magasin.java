package com.magasin;

class Magasin {
    Item[] items;

    public Magasin(Item[] items) {
        this.items = items;
    }
    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            //Comté
            if (items[i].name.equals("Comté")) {
                if (items[i].quality < 50) {
                    if (items[i].sellIn > 0) {
                        items[i].quality += 1;
                    }
                    else {
                        items[i].quality += 2;
                    }
                }
            }
            //Pass VIP
            else if (items[i].name.equals("Pass VIP Concert")) {
                if (items[i].quality < 50) {
                    if (items[i].sellIn <= 0) {
                        items[i].quality = 0;
                    }
                    else if (items[i].sellIn < 6) {
                        items[i].quality += 3;
                    }
                    else if (items[i].sellIn < 11) {
                        items[i].quality += 2;
                    }
                    else {
                        items[i].quality += 1;
                    }
                }
            }
            //Kryptonite
            else if (items[i].name.equals("Kryptonite")) {
                items[i].quality = 80;
            }
            //Pouvoir magique
            else if (items[i].name.equals("Pouvoirs magiques")) {
                if (items[i].sellIn > 0 ) {
                    items[i].quality -= 2;
                }
                else if (items[i].sellIn <= 0 ) {
                    items[i].quality -= 4;
                }
                if (items[i].quality < 0) {
                    items[i].quality = 0;
                }
            }
            //All others products
            else {
                if (items[i].sellIn > 0 ) {
                    items[i].quality -= 1;
                }
                else if (items[i].sellIn <= 0 ) {
                    items[i].quality -= 2;
                }
            }
            //Secure quality
            if (items[i].quality > 50 && !items[i].name.equals("Kryptonite")) {
                items[i].quality = 50;
            }
            if (items[i].quality < 0) {
                items[i].quality = 0;
            }
        }
    }
}
