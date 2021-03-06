
package org.mano.produto.boundary;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductWSService", targetNamespace = "http://boundary.produto.mano.org/", wsdlLocation = "http://debian:8080/Products/ProductWSService?wsdl")
public class ProductWSService
    extends Service
{

    private final static URL PRODUCTWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTWSSERVICE_EXCEPTION;
    private final static QName PRODUCTWSSERVICE_QNAME = new QName("http://boundary.produto.mano.org/", "ProductWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://debian:8080/Products/ProductWSService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTWSSERVICE_WSDL_LOCATION = url;
        PRODUCTWSSERVICE_EXCEPTION = e;
    }

    public ProductWSService() {
        super(__getWsdlLocation(), PRODUCTWSSERVICE_QNAME);
    }

    public ProductWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTWSSERVICE_QNAME, features);
    }

    public ProductWSService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTWSSERVICE_QNAME);
    }

    public ProductWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTWSSERVICE_QNAME, features);
    }

    public ProductWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductWS
     */
    @WebEndpoint(name = "ProductWSPort")
    public ProductWS getProductWSPort() {
        return super.getPort(new QName("http://boundary.produto.mano.org/", "ProductWSPort"), ProductWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductWS
     */
    @WebEndpoint(name = "ProductWSPort")
    public ProductWS getProductWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://boundary.produto.mano.org/", "ProductWSPort"), ProductWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTWSSERVICE_EXCEPTION!= null) {
            throw PRODUCTWSSERVICE_EXCEPTION;
        }
        return PRODUCTWSSERVICE_WSDL_LOCATION;
    }

}
