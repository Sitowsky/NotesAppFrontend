
package clientews.servicio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserDaoService", targetNamespace = "http://dao/", wsdlLocation = "http://desktop-cfan1cq:8080/UserDaoService/UserDao?wsdl")
public class UserDaoService
    extends Service
{

    private final static URL USERDAOSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERDAOSERVICE_EXCEPTION;
    private final static QName USERDAOSERVICE_QNAME = new QName("http://dao/", "UserDaoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://desktop-cfan1cq:8080/UserDaoService/UserDao?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERDAOSERVICE_WSDL_LOCATION = url;
        USERDAOSERVICE_EXCEPTION = e;
    }

    public UserDaoService() {
        super(__getWsdlLocation(), USERDAOSERVICE_QNAME);
    }

    public UserDaoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERDAOSERVICE_QNAME, features);
    }

    public UserDaoService(URL wsdlLocation) {
        super(wsdlLocation, USERDAOSERVICE_QNAME);
    }

    public UserDaoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERDAOSERVICE_QNAME, features);
    }

    public UserDaoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserDaoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IUserDao
     */
    @WebEndpoint(name = "UserDaoPort")
    public IUserDao getUserDaoPort() {
        return super.getPort(new QName("http://dao/", "UserDaoPort"), IUserDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IUserDao
     */
    @WebEndpoint(name = "UserDaoPort")
    public IUserDao getUserDaoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dao/", "UserDaoPort"), IUserDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERDAOSERVICE_EXCEPTION!= null) {
            throw USERDAOSERVICE_EXCEPTION;
        }
        return USERDAOSERVICE_WSDL_LOCATION;
    }

}
