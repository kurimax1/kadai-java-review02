
public class SevenNumber {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // 7の倍数 または 数値に7が含まれる場合
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                System.out.println("clap!");
            } else {
                System.out.println(i);
            }
        }
    }
}
