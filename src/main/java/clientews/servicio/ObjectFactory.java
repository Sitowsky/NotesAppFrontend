
package clientews.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientews.servicio package. 
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

    private final static QName _AddNResponse_QNAME = new QName("http://interfaces/", "addNResponse");
    private final static QName _GetAllN_QNAME = new QName("http://interfaces/", "getAllN");
    private final static QName _DeleteNResponse_QNAME = new QName("http://interfaces/", "deleteNResponse");
    private final static QName _GetAllByUserResponse_QNAME = new QName("http://interfaces/", "getAllByUserResponse");
    private final static QName _DeleteN_QNAME = new QName("http://interfaces/", "deleteN");
    private final static QName _UpdateNResponse_QNAME = new QName("http://interfaces/", "updateNResponse");
    private final static QName _UpdateN_QNAME = new QName("http://interfaces/", "updateN");
    private final static QName _AddN_QNAME = new QName("http://interfaces/", "addN");
    private final static QName _GetAllNResponse_QNAME = new QName("http://interfaces/", "getAllNResponse");
    private final static QName _GetAllByUser_QNAME = new QName("http://interfaces/", "getAllByUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientews.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddN }
     * 
     */
    public AddN createAddN() {
        return new AddN();
    }

    /**
     * Create an instance of {@link GetAllNResponse }
     * 
     */
    public GetAllNResponse createGetAllNResponse() {
        return new GetAllNResponse();
    }

    /**
     * Create an instance of {@link GetAllByUser }
     * 
     */
    public GetAllByUser createGetAllByUser() {
        return new GetAllByUser();
    }

    /**
     * Create an instance of {@link UpdateN }
     * 
     */
    public UpdateN createUpdateN() {
        return new UpdateN();
    }

    /**
     * Create an instance of {@link UpdateNResponse }
     * 
     */
    public UpdateNResponse createUpdateNResponse() {
        return new UpdateNResponse();
    }

    /**
     * Create an instance of {@link DeleteN }
     * 
     */
    public DeleteN createDeleteN() {
        return new DeleteN();
    }

    /**
     * Create an instance of {@link GetAllByUserResponse }
     * 
     */
    public GetAllByUserResponse createGetAllByUserResponse() {
        return new GetAllByUserResponse();
    }

    /**
     * Create an instance of {@link DeleteNResponse }
     * 
     */
    public DeleteNResponse createDeleteNResponse() {
        return new DeleteNResponse();
    }

    /**
     * Create an instance of {@link AddNResponse }
     * 
     */
    public AddNResponse createAddNResponse() {
        return new AddNResponse();
    }

    /**
     * Create an instance of {@link GetAllN }
     * 
     */
    public GetAllN createGetAllN() {
        return new GetAllN();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "addNResponse")
    public JAXBElement<AddNResponse> createAddNResponse(AddNResponse value) {
        return new JAXBElement<AddNResponse>(_AddNResponse_QNAME, AddNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "getAllN")
    public JAXBElement<GetAllN> createGetAllN(GetAllN value) {
        return new JAXBElement<GetAllN>(_GetAllN_QNAME, GetAllN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "deleteNResponse")
    public JAXBElement<DeleteNResponse> createDeleteNResponse(DeleteNResponse value) {
        return new JAXBElement<DeleteNResponse>(_DeleteNResponse_QNAME, DeleteNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "getAllByUserResponse")
    public JAXBElement<GetAllByUserResponse> createGetAllByUserResponse(GetAllByUserResponse value) {
        return new JAXBElement<GetAllByUserResponse>(_GetAllByUserResponse_QNAME, GetAllByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "deleteN")
    public JAXBElement<DeleteN> createDeleteN(DeleteN value) {
        return new JAXBElement<DeleteN>(_DeleteN_QNAME, DeleteN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "updateNResponse")
    public JAXBElement<UpdateNResponse> createUpdateNResponse(UpdateNResponse value) {
        return new JAXBElement<UpdateNResponse>(_UpdateNResponse_QNAME, UpdateNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "updateN")
    public JAXBElement<UpdateN> createUpdateN(UpdateN value) {
        return new JAXBElement<UpdateN>(_UpdateN_QNAME, UpdateN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "addN")
    public JAXBElement<AddN> createAddN(AddN value) {
        return new JAXBElement<AddN>(_AddN_QNAME, AddN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "getAllNResponse")
    public JAXBElement<GetAllNResponse> createGetAllNResponse(GetAllNResponse value) {
        return new JAXBElement<GetAllNResponse>(_GetAllNResponse_QNAME, GetAllNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://interfaces/", name = "getAllByUser")
    public JAXBElement<GetAllByUser> createGetAllByUser(GetAllByUser value) {
        return new JAXBElement<GetAllByUser>(_GetAllByUser_QNAME, GetAllByUser.class, null, value);
    }

}
