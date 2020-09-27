01 - Extract code from the main loop to a method 

- I try to understand what the code does high level, without entering into the nested conditional loops details
- I noticed that basically it loops through a list of items and updates its quality.
- Items haven't any dependency between them, and their properties evaluated one at a time

--> updateQuality() in GildedRose class:
- Improve readability. Use item instead of items[i]
- use foreach structure
- extract code inside main loop to updateItemQuality()

---

00 - Initial code

- Changed tested days to 10.
- Added test_results.txt file 
