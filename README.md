# staging
Introduction:

This post will be for creating a simple application with spring boot and vaadin.

Spring Boot : 
Spring boot helps to create an Java application much easier than any other conventional process. As per wikipedia Spring Boot is Spring's convention-over-configuration solution for creating stand-alone, production-grade Spring-based Applications that you can "just run".
It helps to
Create stand-alone as well as production grade Spring applications. 
Embed server to run the app. 
Automatically configure Spring. 
Provide production-ready features such as metrics, health checks and externalized configuration. 
Absolutely no code generation and no requirement for XML configuration 

Vaadin :

Vaadin is a web based RIA framework written in Java. It uses GWT(Google Web Toolkit) to render the content on a page. The complete UI can be created using only Java language. It incorporates Event Driven Programming and widgets.Vaadin applications can be deployed as servlets on any java server. It can be also deployed as portlet to any java application. Liferay has a deeper integration with Vaadin Portlets.

Now follow the steps to create your first spring boot vaadin application.

Prerequisite : STS(Spring Tool Suit) is recommended for this. Any other IDE can also be used create the application.  

Step 1: Create a spring starter project in STS, select web and vaadin dependencies and finish setup.

Step 2 : Spring boot will automatically create the pom.xml file and default initialize class.
In this case these are pom.xml and WelcomeApplication.java(Deafault initilizer)

Step 3 : Maven update the project in order to resolve the dependencies.

Step 4 : Create WelcomeUI.java to create the UI.

Step 5 : To run the appliction run WelcomeApplication.java as java appliction.
