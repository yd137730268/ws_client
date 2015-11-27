
package org.dy.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dy.ws.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWorldsByUserResponse_QNAME = new QName("http://service.ws.dy.org/", "getWorldsByUserResponse");
    private final static QName _SayHi_QNAME = new QName("http://service.ws.dy.org/", "sayHi");
    private final static QName _SayHiResponse_QNAME = new QName("http://service.ws.dy.org/", "sayHiResponse");
    private final static QName _GetWorldsByUser_QNAME = new QName("http://service.ws.dy.org/", "getWorldsByUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dy.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWorldsByUser }
     * 
     */
    public GetWorldsByUser createGetWorldsByUser() {
        return new GetWorldsByUser();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link GetWorldsByUserResponse }
     * 
     */
    public GetWorldsByUserResponse createGetWorldsByUserResponse() {
        return new GetWorldsByUserResponse();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link World }
     * 
     */
    public World createWorld() {
        return new World();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorldsByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.dy.org/", name = "getWorldsByUserResponse")
    public JAXBElement<GetWorldsByUserResponse> createGetWorldsByUserResponse(GetWorldsByUserResponse value) {
        return new JAXBElement<GetWorldsByUserResponse>(_GetWorldsByUserResponse_QNAME, GetWorldsByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.dy.org/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.dy.org/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorldsByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.dy.org/", name = "getWorldsByUser")
    public JAXBElement<GetWorldsByUser> createGetWorldsByUser(GetWorldsByUser value) {
        return new JAXBElement<GetWorldsByUser>(_GetWorldsByUser_QNAME, GetWorldsByUser.class, null, value);
    }

}
