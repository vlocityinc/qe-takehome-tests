# QeSeleniumTakeHome

Add additonial tests to the project.  You will be writing Selenium tests against https://www.wikipedia.org/


## Verify Feature Languages
Tests to verify the "Feature Languages" English, Espanol, etc, all exists with that text.  These are the languages seen in the circle.
	* You should hard code the known language
	* Verify they have hyper links
	* Verify the URL "works" (i.e. do a get and returns 200)
	* Use a dataprovider such that you get a test result for every language

## Verify Languages are Unique

Test should click the "Read Wikipedia in your language" link
	* Write tests that verify that languages listed are unique across all of the 1 000 00+, 100 000+, 10 000+, 1 000+, 100+ sections
	* Use a dataprovider such that you get a test result for every language showing if it is unique or not.

