# ShearCircle Web Application Automation Testing Using Selenium
 
## This is the repository for Selenium Automation Testing Scripts to test the ShearCircle Web Application

### About the Application:
ShearCircle is an online scheduling platform connecting professionals with clients. Its an online hub where beauty and wellness professionals and enthusiasts come together and connect with each other. ShearCircle enable clients to discover new services, and choose from a wide range of options, book appointments on the go, and get inspiration from the latest trends. Professionals use this platform to show case their skills and work, connect with existing and new clients, offer special deals, and improve their business prospects.


### Technology/Tools Used To Build The Application:
This is a PHP application and the following tools/coding methodologies are used to build this application--
1) CodeIgniter Framework: The server side scripting is done using CodeIgniter Framework.
2) Angular JS 1.x: The client side scripting is done using Angular JS 1.x
3) MySQL: The Database is implemented using MySQL
4) PhpStorm IDE


### Technology/Tools Used For Automation Framework:
JDK 1.5 or above (Better choose latest version)
Eclipse (Latest version)
Selenium standalone server
Selenium java client jars
Browser driver exe files (Gecko, Chrome & IE)
Maven build tool
TestNG
POI/JXL
Log4j
Git / GitHub
Jenkins-CI
Extent Reports / ReportNG 
PageFactory Model


### About Automation Testing Framework:
Framework Used-- Hybrid Framework
Frame work is the structural way of maintaining and executing the scripts. Hybrid framework is a way to organize the code so that it can be
Reusable
Scalable
Maintainable
Understandable
Workable 


### Framework Structure:
Precondition-- Install latest Java and Eclipse.
1) In Eclipse, create a maven project (like: ShearCircle_Automation).
2) Check whether JRE library files is up to date. If not add latest JRE file by using build path
3) Add dependencies in pom.xml.(from mvn repository website: https://mvnrepository.com/). When we add dependencies, automatically all related jar file will be downloaded and attach it the current project.
4) Create three folders(Right click on project>>New>>Folder) name it as below
a) drivers -- to store the browser supported exe files.
b) screenshots -- to store the screenshots once execution done. Whether status  has pass or fail.
c) testData -- to store the input(testdata). We will use “.properties” & “.xlsx” files.
5) Go to “src/test/java” folder. Create 3 packages name it as below --
a) ProjectName.ObjectRepository -- to store the application element locaters (Page wise or entire application wise).
b) ProjectName.Testcases -- Develop the actual functional test scripts (as per the Business scenarios)
c) ProjectName.Utilities -- Reusable scripts for all the projects. In addition to that, current project reusable scripts will be implemented in separate folder structure and call the existing classes into child classes.
6) In future if there are any changes in locaters, only change the respect object value from Object repository class without modifying the actual test script.
