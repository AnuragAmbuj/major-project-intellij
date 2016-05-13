How to Import
===========
###***Read this document in a Markdown Reader and not not in plain text editor. Use suitable olugins in popular editors such as Visual Studio Code, Sublime Editor, Textmate, Emacs e.t.c***
+ Clone the project using

```
    git clone https://github.com/AnuragAmbuj/major-project-intellij.git
```    


+ Now Open IntelliJ IDEA
+ ***File -> Open*** , then locate the root folder for the project and click on Open
+ The project gets imported

____

##Fixing Library and Dependency issues in IntelliJ

+ It is assumed that your IDEA is already configured with App Engine and JDK v1.7.0_95 (do not use JDK 1.8.0)
+ Now goto ***File->Project Structure***
+ Click on ***Libraries*** and then click on +.
+ Locate your app engine folder and add all the required jars
+ Click on ***Apply***

###If any dependency issue occures, please make sure IntelliJ correctly knows  JDK and App Engine SDK Path.
###Use following steps to clear project dependency issues:
+ In the same dialog box, click on ***Modules***
+ Click on ***Dependencies*** 
+ Set up Module SDK if not already set up
+ Then click on ***+*** in right corner
+ Click on ***Library*** in the drop down menu that appears
+ Click on ***Java/JARS or directories*** and then locate the root of the library folder
+ Thus all the dependency issues should be fixed

----

##Creating Run Congiguration for the imported project
+ Follow the video supplied
+ Now the module can successfully run on Development server
+ Deployment server configurations and other steps can be found on [Google App Engine Website](https://www.google.com/appengine/).
##Find two applications deployed on:
    + Older version, also deployed on Android with app-id [jaikisaan-mproject](http://jaikisaan-mproject.appspot.com)
    + Newer version, deployed only on Google Cloud with app-id [kisaanmajor](https://kisaanmajor.appspot.com)
-----
##Thank You
    


