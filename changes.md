06 - join switch code blocks

If we have a look to the current code, we can see that name property is evaluated (switch) in two different parts

There is also a middle part which decrements sellin always except with item Sulfuras

- updateQuality() in GildedRose class:
    - I will first decrement the sellin variable before the switch block for all except Sulfuras.
    I could also add in every other case of the switch and avoid one comparison
    - I will then invert again the condition and extract this code into a method decrementDaysToSell(). 
    I think the code is clearer 
    - decrementing sellin at the beginning makes that the conditions for backstage passes are updated to 10 and 5 days
    This was also stated in the requirements: 
    "Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less"
    Again, the code is easier to understand
    - To join the second switch case we have to duplicate the codition 
    "if (item.sellIn < 0)" in every case of the switch, except Sulfuras 
    
---

05 - Simplify if and replace with switch

- updateQuality() in GildedRose class:
    - group the different if conditions on item names into switch clausules 

---

04 - Extract code that update quality into methods

- updateQuality() in GildedRose class:
    - incrementItemQuality() always checks if quality<50
    - decrementItemQuality() check  quality > 0. If another condition is used we can just change their order
    - decrementItemQuality() fixed bug with automatic refactoring
    
---

03 - Simplify conditions. 

- updateQuality() in GildedRose class:
    - Backstage passes condition is always false --> remove if() block
    - Backstage passes condition is always true --> remove if() condition, keep block code 
    - 'item.quality - item.quality' expression can be simplified with 0
     
---

02 - Used positive conditions
     
Trying to find logic in updateQuality(). It's still very difficult to follow the nested conditions inside the method. Even more, when you find positive and negative conditions involved.
     
To simplify the code I will convert all negative conditions to positive
     
Additionally, I would like to separate the different cases, so I will break the first big if loop with and OR condition into two blocks
     
- updateQuality() in GildedRose class:
    - Refactor negative conditions (!item) to positive
    - split OR condition ( || ) in if block into two blocks
     
---

01 - Extract code from the main loop to a method 

I try to understand what the code does high level, without entering into the nested conditional loops details

I noticed that basically it loops through a list of items and updates its quality.

Items haven't any dependency between them, and their properties evaluated one at a time

--> updateQuality() in GildedRose class:
- Improve readability. Use item instead of items[i]
- use foreach structure
- extract code inside main loop to updateItemQuality()

---

00 - Initial code

- Changed tested days to 10.
- Added test_results.txt file 
