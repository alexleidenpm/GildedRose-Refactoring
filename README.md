This is my personal solution (using Java) to the technical assessment https://github.com/emilybache/GildedRose-Refactoring-Kata from a recruitment process 

Requirements from published on https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/master/GildedRoseRequirements.txt 

After reading the document, and having a look to the GitHub repository I understood that I was facing a code refactoring code.

I didn't know this exercise, even though I found out to be very popular and running for over 8 years with different solutions. I had a look to the author of this repository (Emily Bache) and found out that she used this very same exercise to give a lesson about Advanced Testing and Refactoring Techniques.
The first step prior to refactoring code is creating a nest of test. Emily encourages the use of approval tests prior to start refactoring and recommends https://approvaltests.com/   I consider it could be a necessary approach (in a real life complex scenario), but in my opinion, out of scope of this assesment (I will try it later for myself)

I had much fun trying myself to solve the assessment, even though I had to take out time from my family and complete it during the weekend. I could complement some new lessons I learned by reading refactoring theory with my intuition and previous knowledge in rewriting code (something that I've been forced to do several times during my 25 years working as an IT consultant)

The exercise can be solved in many programming languages. I've chosen Java, because I find the output to be more readable, and I have already the environment installed (from a recent Spring Boot Microservices project). But I will consider repeating this exercise using other languages as Pyhon or Scala because it will help me to refresh my coding skills. I am already thinking in bringing the refactoring theory beyond the limitations of the assesment (you are not allow to modify the base class Item) to use class inheritance.

Since the original code is on GitHub, I will use a public repository in one of my accounts to publish my solution.  https://github.com/alexleidenpm/GildedRose-Refactoring
I would also follow good Git practices, creating branches for each change  (But I will not merge those branches and delete them afterwards, so you can see the steps I made in every commit). Working alone in this project, it was not also necessary to enforce pull requests.

After cloning the repository, I copied the Java dependencies (pom.xml) and java source code into a new maven's project in IntellIJ IDEA (a Java IDE I'm comfortable with) and added to my local git repository. I added target folder to .gitignore. I created a README.md file and pushed the changes to GitHub.
