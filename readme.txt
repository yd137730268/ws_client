1. generate the client code by cxf command wsdl2java/wsdl2java.bat;
	wsdl2java/wsdl2java.bat url
	
exception:
1. wsdl2java : failed to read document, change the JDK version;
2. test the service : cannot create a secure XmlInputFactory, add jar files :
				stax2-api-3.1.4.jar
				woodstox-core-asl-4.4.1.jar 
3. cxf 2.7.18支持map复杂类型，不需要在接口添加@XmlJavaTypeAddpter(class[ ? XmlAddpter])实现转换器