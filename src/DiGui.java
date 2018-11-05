public class DiGui {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1;i <= 10;i++){
            sum *= i;
        }
        System.out.println(sum);

        System.out.println(test(10));

    }
    public static int test(int i){
        if(i == 1){
            return 1;
        }
        return test(i - 1)*i;
        /* 第一次：test(9)*10
          第二次：test(8)*9*10
          .
          .
          .
          test(1)***10
          1***10
        */
    }
}
