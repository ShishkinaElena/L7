package p1;

public class Client2 {
    private  String name;


    public  Client2(String name){
        this.name = name;
    }
    public  void  setAccount(String pass){  // Метод
        class Account {
            public void infoAccount() {
                System.out.printf("Account Login: %s \t Password: %s\n", name, pass);
            }
        }

            Account account = new Account();
            account.infoAccount();

    }

}
