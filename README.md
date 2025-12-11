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

### Second exercise: Add a “full-address” field to a user map
Concatenates street, suite, city, and zipcode into a single string.  
Uses assoc to add a new key called :full-address to the user map, containing that string.    
=> returns the user map with an added :full-address field  

Example:  
(full-address user1)  
;; => returns the user map with an added :full-address field  

1. Run: `lein test :only december.core-test/b-test`
2. Failed? Fix it please!
3. Succeeded? Perfect!

### Third exercise: Update a user’s website by id
Takes the user collection and an id.
Uses assoc (along with map or mapv) to update the :website field only for the user whose id matches.
Returns the updated collection.  

Example:  
(update-website users 2 "new-site.com")  
;; => returns the collection, but the user with id 2 now has :website "new-site.com"  

1. Run: `lein test :only december.core-test/c-test`
2. Failed? Fix it please!
3. Succeeded? Perfect!

### Fourth exercise: Sort in ascending order by lat and if the lat is same, order by id.

1. Run: `lein test :only december.core-test/d-test`
2. Failed? Fix it please!
3. Succeeded? Perfect!

### Fifth exercise: Compose a function to extract latitude as a number and use cond-> to enrich the user map based on its value.
Create a function using comp that:  
Extracts the latitude (:address :geo :lat)  
Converts it from string to a numeric value using Double/parseDouble  
Then, using cond->, update the user map:  
If the latitude is greater than -40, add :lat-category "north".  
If the latitude is less than or equal to -40, add :lat-category "south".  
  
1. Run: `lein test :only december.core-test/e-test`
2. Failed? Fix it please!
3. Succeeded? Perfect!

### Sixth exercise: Extract name, email, city, and latitude from each user
Given the collection users, use nested destructuring to extract:
name, email, city (inside address), lat (inside address.geo)  
Then print them in the format:  
Name: <name> | Email: <email> | City: <city> | Latitude: <lat>  

1. Run: `lein test :only december.core-test/f-test`
2. Failed? Fix it please!
3. Succeeded? Perfect!
