
public class Review01 {

	//mainの定義
	public static void main(String[] args) {
		
		//変数を宣言
		//消費税額
        int shouhinkakaku = 1500;
        //税率(％)
        int zeiritsu = 8;
        //消費税額
        int shouhizeigaku;
        //税込み価格
        int zeikomikakaku;
        //消費税額の計算
        shouhizeigaku = tax(shouhinkakaku,zeiritsu);
        //税込価格の計算
        zeikomikakaku = shouhinkakaku + shouhizeigaku;
        
        //実行結果を定義
        System.out.println(shouhinkakaku + "円の商品の税込価格は" + zeikomikakaku + "円（消費税は" + shouhizeigaku +"円）です。");
	}
	
	//消費税額を計算してmainメソッドに返す
	public static int tax(int shouhinkakaku,int zeiritsu) {
		int tax_num = shouhinkakaku * zeiritsu / 100;
        return tax_num;

	}
	
}
