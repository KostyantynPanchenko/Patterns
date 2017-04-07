
package proxy;

public class Client {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        access.grantInternetAccess();
        
        OfficeInternetAccess access2 = new ProxyInternetAccess("Bob");
        access2.grantInternetAccess();
    }
}
