
public class Review02 {

    public static void main(String[] args) {
        // 1から100までの数値を出力
        for (int i = 1; i < 100; i++) {
            // 3と5で割り切れる数を選出
            if (i % 3 == 0 && i % 5 == 0 ) {
            // FizzBuzzを表示する
            System.out.println("FizzBuzz");
            // 5で割り切れる数を選出
            } else if (i % 5 == 0) {
            // Buzzを表示する
                System.out.println("Buzz");
            // 3で割り切れる数を選出
            } else if (i % 3 == 0 ){
            // FizzBuzzを表示する
               System.out.println("Fizz");
            } else {
            System.out.println(i);
        }
      }
   }
}
