
public class Review02 {
    public static void main(String[] args) {
    	//iの値が1から100小さい間、処理を繰り返す
    	for (int i = 1; i <= 100; i++) {
    		//その整数が3で割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示する
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                //その整数が3で割り切れる数なら "Fizz" と表示する  
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                //その整数が5で割り切れる数なら "Buzz" と表示する   
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                //それ以外の数は、その数をそのまま表示する
            } else {
                System.out.println(i);
            }
        }
    }
}
