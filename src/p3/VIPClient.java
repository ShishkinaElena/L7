package p3;

public class VIPClient extends Client{  // делаем наследование при помощи слова  extends из класса Client

    private int countMoney;

    public VIPClient(String name, int countMoney) {   // конструктор производного класса (вызов конструктора -  super)
        super(name);
        this.countMoney = countMoney;
    }

    @Override
    public void info() {  // Переопределение метода, который есть в родительском классе
        super.info();
        System.out.printf("Name: %s \n", getName());
       // System.out.printf("%s have %d $ \n", getName(), countMoney);
        //super.info();
    }
    /* public void inform(){
        System.out.printf("%s have %d $ \n", getName(), countMoney);
    }*/

}
