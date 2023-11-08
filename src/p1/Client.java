package p1;

public class Client {  // Внешний класс, имеет доступ к вложенному классу

    private  String name;
    Account account;

    public  Client(String name, String password){
    this.name = name;
    account = new Account(password);

    }
    public  void  infoClient(){
        System.out.printf("Client \t Name: %s \t Password: %s \n", name, account.password); // метод 1


    }

    public  class Account{  // Вложеный класс Account, объекты созданы внутри внешнего класса
        private  String password;

        public Account(String password){
            this.password = password;

        }

        public  void  infoAccount(){  // вложеный метод 2
            System.out.printf("Account Login: %s \t Password: %s\n", Client.this.name, password);  // Обращаемся к класссу Client
        }  // Client.this.name, password - это команда обращения к внешнему классу


    }
}
