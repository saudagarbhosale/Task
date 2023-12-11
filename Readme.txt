#Tendable Tech Challenge
#Focus on the validate the required point as mention in the test, validate is done through the automation point of view 
1.Confirm accessibility of the top-level menus: Home, Our Story, Our Solution, and Why 
 Tendable.
2. Verify that the "Request a Demo" button is present and active on each of the 
aforementioned top-level menu pages.
3. Navigate to the "Contact Us" section, choose "Marketing", and complete the form—
excluding the "Message" field. On submission, an error should arise. Ensure your script 
confirms the error message's appearance. If the error is displayed, mark the test as PASS. If 
absent, it's a FAIL.

Technologies Used:
1. Selenium WebDriver with Java Language binding
2. Cucumber BBD approach
3. WebDriverManager
4. JDK 1.8
5. Maven (Build tool)
6. Maven Plugins
8. cucumber testNg
9. HTML repoting


* Test first- Opening the browser with application and identify the webelement using respected locators. Creating page object module
with pagefactory class. create feature files, test runer class and stepdefination class in src/test/java. result is stored in target folder with html repoting.
Validation point of view I am using Assert.
Cucumber BDD approach it will help us to get clear Idea How test work. 

Test 1: Confirm accessibility of the top-level menus
   Given Open the browser with application
   user landing on homepage
   verify on homepage and Request a Demo
   verify user can access Our Story	menu Request a Demo
   verfiy user can access Our Solution menu Request a Demo
   verify user can access Why Tendable menu Request a Demo
Test 2: Validate error massage  
Open the browser with application
nevigate to the Contact Us section and choose Marketing
complete marketing for with required details exclude massage field submite form
verify error massage    