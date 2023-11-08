package p1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client( "Alex", "qweqwe");
        client.infoClient();
        client.account.infoAccount();

        Client2 client2 = new Client2("Pavel");
        client2.setAccount("qwerty");


    }
}