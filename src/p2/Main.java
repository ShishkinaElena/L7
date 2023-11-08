package p2;

public class Main {
    public static  void  main(String[] args){
        Calc.DataSum dataSum = Calc.getSum(10, 20);
        System.out.printf("Сумма = %d \n", dataSum.getRes()); // обращаемся  dataSum и забираем результат

    }

}
