### JaxBBasic Example

In this project, Just created the schema file (simple.xsd) and binding file(simple.xjb).

Then put the jaxb plugin in the pom file. 

Hit the command. ```mvn clean install``` OR Right click the xsd file and click Generate->jaxb Classes

It generates the *.Java DTO files inside the target.


Now you can use the dto files to fill some values and unmarshall it to xml which is not covered here yet.

NOTE: The @XmlRootElement annotation missing exception is thorws by this xsd by default. Just add it manually in the personDto file.