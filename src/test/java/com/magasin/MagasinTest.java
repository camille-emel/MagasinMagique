package com.magasin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagasinTest {

    @Test
    void comteday10() {
        Item[] items = new Item[] { new Item("Comté", 10, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
    }
    @Test
    void comteday1() {
        Item[] items = new Item[] { new Item("Comté", 1, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
    }
    @Test
    void comteday0() {
        Item[] items = new Item[] { new Item("Comté",0 , 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
    }
    @Test
    void kryptoniteday10() {
        Item[] items = new Item[] { new Item("Kryptonite", 10, 80) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
    }
    @Test
    void kryptoniteday1() {
        Item[] items = new Item[] { new Item("Kryptonite", 1, 80) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
    }
    @Test
    void vipday11() {
        Item[] items = new Item[] { new Item("Pass VIP Concert", 11, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
    }
    @Test
    void vipday10() {
        Item[] items = new Item[] { new Item("Pass VIP Concert", 10, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
    }
    @Test
    void vipday5() {
        Item[] items = new Item[] { new Item("Pass VIP Concert", 5, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(13, app.items[0].quality);
    }
    @Test
    void vipday0() {
        Item[] items = new Item[] { new Item("Pass VIP Concert", 0, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
    @Test
    void trucday10() {
        Item[] items = new Item[] { new Item("Truc", 10, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(9, app.items[0].quality);
    }
    @Test
    void trucday0() {
        Item[] items = new Item[] { new Item("Truc", 0, 10) };
        Magasin app = new Magasin(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);
    }
}
