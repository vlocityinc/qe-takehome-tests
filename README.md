# Vlocity Quality Engineering Take Home Selenium Test #1

This take home test will allow us to evaluate candidates ability to use TestNg, Selenium Webdriver, Chrome, Chrome Tools, and Java.
This take home test requires Java 8, Maven 3, and git.  If you need to adapt it to work with your environment, that is ok, just add comments in the files where appropriate.

The candidate will be writing Selenium tests against https://www.wikipedia.org/

## Verify Featured Languages
The candidate will write tests to verify the "Featured Languages", such as English, Espanol, etc.  These can be seen in this image.

![Wikipedia Image](images/wikipedia-languages.png)

If the languages seen are different, that is ok.  Use the languages you see.
It is not required that all tests pass, maybe you will find a bug somewhere.  If a test isn't passing, add a comment explaining why.

## Requirements

1. Use TestNg @DataProvider(s)
1. Write a test that verifies the languages are present by asserting their text value, based on a known list.  There should be a test result per language.
1. Write a test that verifies the hyperlinks for the Featured Languages work, that is, they return a HTTP 200 status.  There should be a test result per language.
1. Add methods or new classes where you think it is appropriate.
1. The final tests must execute when `mvn test` is run.
1. To submit your work, execute `mvn package` and submit the `target/test-results.tgz` file to Greenhouse.






