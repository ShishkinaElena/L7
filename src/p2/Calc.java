package p2;

public class Calc {
    public static class DataSum {
        private int x;
        private int y;
        private int res;


        public DataSum(int x, int y, int res) {
            this.x = x;
            this.y = y;
            this.res = res;

        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getRes() {
            return res;
        }
    }

    public static DataSum getSum(int x, int y) {  // создаем метод для возврата объекта DataSum
        int res = 1;
        res = x+y;
        return new DataSum(x,y,res);

    }


}
