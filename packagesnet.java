import java.net.InetAddress;

class packagesnet {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getLocalHost();

        System.out.println("Computer Name: " + address.getHostName());
        System.out.println("IP Address: " + address.getHostAddress());
    }
}
