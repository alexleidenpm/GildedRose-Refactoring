// Revision 05 - Simplify if and replace with switch
package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items ) {
            updateItemQuality(item);
        }
    }

    private void updateItemQuality(Item item) {
        switch (item.name) {
            case "Aged Brie":
                incrementItemQuality(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                incrementItemQuality(item);
                if (item.sellIn < 11) {
                    incrementItemQuality(item);
                }
                if (item.sellIn < 6) {
                    incrementItemQuality(item);
                }
                break;
            case "Sulfuras, Hand of Ragnaros":
                break;
            default:
                decrementItemQuality(item);
                break;
        }

        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
        } else {
            item.sellIn = item.sellIn - 1;
        }

        if (item.sellIn < 0) {
            switch (item.name) {
                case "Aged Brie":
                    incrementItemQuality(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    item.quality = 0;
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    return;
            }
            decrementItemQuality(item);
        }
    }

    private void decrementItemQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void incrementItemQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}