package java_soap_example;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

//import se.sveaekonomi.webpay.integration.exception.SveaWebPayException;
//import se.sveaekonomi.webpay.integration.response.webservice.CustomerIdentityResponse;
//import se.sveaekonomi.webpay.integration.util.security.Base64Util;

public class GetOrdersResponse extends AdminServiceResponse {

    
//    public long orderId;
//    public String orderType;
//    public boolean sveaWillBuyOrder;
//    public double amount;
//    public CustomerIdentityResponse customerIdentity;
//    public String expirationDate;
//    public String clientOrderNumber;
//    public boolean isIndividualIdentity;
//    
    public GetOrdersResponse(NodeList nodes) {
    	super( nodes );
    	
    	
//        super(soapMessage);
//        isIndividualIdentity = false;
//        customerIdentity = new CustomerIdentityResponse();
//        this.setValues(soapMessage);
    }
//    
//    public void setValues(NodeList soapMessage) {
//        int size = soapMessage.getLength();
//        
//        for (int i = 0; i < size; i++) {
//            Element node = (Element) soapMessage.item(i);
//
//            this.sveaWillBuyOrder = Boolean.parseBoolean(getTagValue(node, "SveaWillBuyOrder"));
//            
//            this.amount = Double.parseDouble(getTagValue(node, "Amount"));
//            this.orderId = Long.parseLong(getTagValue(node, "SveaOrderId"));
//            this.expirationDate = getTagValue(node, "ExpirationDate");
//            
//            // Optional values
//            String value = getTagValue(node, "OrderType");
//            if (value != null) {
//                this.orderType = value;
//            }
//            
//            value = getTagValue(node, "ClientOrderNumber");
//            if (value != null)
//                this.clientOrderNumber = value;
//            
//            setCustomerIdentityType(node);
//            
//            // Set child nodes from CustomerIdentity
//            setChildNodeValue(node, "NationalIdNumber");
//            setChildNodeValue(node, "Email");
//            setChildNodeValue(node, "PhoneNumber");
//            setChildNodeValue(node, "FullName");
//            setChildNodeValue(node, "Street");
//            setChildNodeValue(node, "CoAddress");
//            setChildNodeValue(node, "ZipCode");
//            setChildNodeValue(node, "HouseNumber");
//            setChildNodeValue(node, "Locality");
//            setChildNodeValue(node, "CountryCode");
//            setChildNodeValue(node, "CustomerType");
//        }
//    }
//    
//    private void setCustomerIdentityType(Node n) {
//        if (n.hasChildNodes()) {
//            NodeList nl = n.getChildNodes();
//            int length = nl.getLength();
//            
//            for (int j = 0; j < length; j++) {
//                Node childNode = nl.item(j);
//                String nodeName = childNode.getNodeName();
//                
//                if (nodeName.equals("CustomerType")) {
//                    this.isIndividualIdentity = getTagValue((Element) n, "CustomerType").equals("Individual") ? true : false;
//                    return;
//                }
//                
//                setCustomerIdentityType(childNode);
//            }
//        }
//    }
//    
//    private void setChildNodeValue(Node n, String tagName) {
//        String tagValue = "";
//        
//        if (n.hasChildNodes()) {
//            NodeList nl = n.getChildNodes();
//            int length = nl.getLength();
//            
//            for (int j = 0; j < length; j++) {
//                Node childNode = nl.item(j);
//                String nodeName = childNode.getNodeName();
//                
//                if (nodeName.equals(tagName)) {
//                    tagValue = getTagValue((Element) n, tagName);
//                    
//                    if (tagValue != null) {
//                        this.customerIdentity.setValue(tagName, tagValue);
//                    }
//                }
//                
//                setChildNodeValue(childNode, tagName);
//            }
//        }
//    }

	
}
