Sample Selgp Saucelabs Tests project
---

In order to run the tests, you will need to install [Apache Maven](http://maven.apache.org), and Appium (according to the Appium [installation instructions](https://github.com/appium/appium).

To compile the test package run:

    mvn -U clean install compile assembly:single

To run the whole suite on Saucelabs using FF:

    java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=FFSL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar

To run the whole suite on Saucelabs using CHROME:

    java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=CHSL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar

To run the whole suite on Saucelabs using SAFARI:

	java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=SFSL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar

To run the whole suite on Saucelabs using OPERA:

	java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=OPSL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar

To run the whole suite on Saucelabs using IE6:

	java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE6SL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar

To run the whole suite on Saucelabs using IE7:

	java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE7SL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar

To run the whole suite on Saucelabs using IE8:

    java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE8SL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar

To run the whole suite on Saucelabs using IE9:

    java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE9SL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar

To run the whole suite on Saucelabs using IE10:

    java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE10SL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar


To run the whole suite on Saucelabs using IE11:

    java -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE11SL -Denvironment=DEVELOPMENT -Dreports.dir=/Users/guillemhernandezsola/reports -Dtests.package=com.selgp.opensauce.selenium.tests -jar target/selgp-webdriver-demo-tests-1.0.0-SNAPSHOT-jar-with-dependencies.jar

