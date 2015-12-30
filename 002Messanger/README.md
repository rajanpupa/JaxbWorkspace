## 002 Messanger application

	* Create a new maven project
	* select the artifact Id as `jersey-quickstart-webapp`. If not available in tomcat, create new.
		
		```Group Id 		: org.glassfish.jersey.archetypes
			Artifact Id	: jersey-quickstart-webapp
			Version 		: 2.16 or later
		```
		
	* Select the above created artifact id and click finish.
	
	### Note
	
	The servlet api may be missing from the dependencies.
	You can run the app from tomcat or even jetty if you put the jetty plugin in the plugins section of your pom.xml	