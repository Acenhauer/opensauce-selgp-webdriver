Sample Selgp Saucelabs Tests project
---

In order to run the tests from this repo, you will need to install [Apache Maven](http://maven.apache.org), and Appium (according to the Appium [installation instructions](https://github.com/appium/appium).

Checkout this repo from Github

    git clone git@github.com:guillemhs/opensauce-selgp.git

Go to the folder where have checkout the code from opensauce selgp and compile it locally using this command:

    mvn -U clean install

Check out this repo from GitHub:

    git clone git@github.com:guillemhs/opensauce-selgp-webdriver.git

Go to the main folder of opensauce-selgp-webdriver and then compile the test package running the following command:

    mvn -U clean install compile assembly:single

To run the whole suite on Saucelabs using FF:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=FFSL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

To run the whole suite on Saucelabs using CHROME:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=CHSL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

To run the whole suite on Saucelabs using SAFARI:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=SFSL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

To run the whole suite on Saucelabs using OPERA:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=OPSL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

To run the whole suite on Saucelabs using IE6:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE6SL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

To run the whole suite on Saucelabs using IE7:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE7SL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

To run the whole suite on Saucelabs using IE8:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE8SL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

To run the whole suite on Saucelabs using IE9:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE9SL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

To run the whole suite on Saucelabs using IE10:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE10SL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

To run the whole suite on Saucelabs using IE11:

    mvn -Dhub=http://YOUR_SAUCE_USER:YOUR_SAUCE_API_KEY@ondemand.saucelabs.com:80/wd/hub
    -Duser=YOUR_SAUCE_USER -Dapikey=YOUR_SAUCE_API_KEY -Dbrowser=IE11SL
    -Denvironment=DEVELOPMENT -Dtests.package=com.selgp.opensauce.selenium.tests
    test

