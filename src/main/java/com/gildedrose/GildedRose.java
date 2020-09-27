// Revision 07 - add conjured items
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
        decrementDaysToSell(item);
        switch (item.name) {
            case "Sulfuras, Hand of Ragnaros":
                break;

            case "Aged Brie":
                incrementItemQuality(item);
                if (item.sellIn < 0) {
                    incrementItemQuality(item);
                }
                break;

            case "Backstage passes to a TAFKAL80ETC concert":
                incrementItemQuality(item);
                if (item.sellIn < 10) {
                    incrementItemQuality(item);
                }
                if (item.sellIn < 5) {
                    incrementItemQuality(item);
                }
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
                break;

            default:
                decrementItemQuality(item);
                boolean isConjured = item.name.startsWith("Conjured");
                if(isConjured)  {
                    decrementItemQuality(item);
                }
                if (item.sellIn < 0) {
                    decrementItemQuality(item);
                    if(isConjured)  {
                        decrementItemQuality(item);
                    }
                }
                break;
        }
    }

    private void decrementDaysToSell(Item item) {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros"))  {
            item.sellIn = item.sellIn - 1;
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