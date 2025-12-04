### First of all

🏗️ Install [Leiningen](https://leiningen.org/#install)

### First exercise: Select the email domain of a user
Create a function that receives a username ("Bret", "Antonette", "Samantha") and, using case, returns only the email domain associated with that user:  
"Bret" → "april.biz"  
"Antonette" → "melissa.tv"  
"Samantha" → "yesenia.net"  
Any other username → "unknown"  

1. Run: `lein test :only december.core-test/a-test`
2. Failed? Fix it please!
3. Succeeded? Perfect!

### First exercise: Add a “full-address” field to a user map
Concatenates street, suite, city, and zipcode into a single string.  
Uses assoc to add a new key called :full-address to the user map, containing that string.    
=> returns the user map with an added :full-address field  

Example:  
(full-address user1)  
;; => returns the user map with an added :full-address field  

1. Run: `lein test :only december.core-test/b-test`
2. Failed? Fix it please!
3. Succeeded? Perfect!

### First exercise: Update a user’s website by id
Takes the user collection and an id.
Uses assoc (along with map or mapv) to update the :website field only for the user whose id matches.
Returns the updated collection.  

Example:  
(update-website users 2 "new-site.com")  
;; => returns the collection, but the user with id 2 now has :website "new-site.com"  

1. Run: `lein test :only december.core-test/c-test`
2. Failed? Fix it please!
3. Succeeded? Perfect!
