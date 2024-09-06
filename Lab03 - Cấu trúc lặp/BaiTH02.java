public class BaiTH02 {
    public void finder69(){
        for (int i = 0; i <=100; i ++){
            if(i==69){
                System.out.println("Ơ Rê Ka - Tìm ra rồi !"+ i);
            }
        }
    }
    public static void main(String[] args) {
        BaiTH02 b = new BaiTH02();
        for (int i = 0; i <= 100; i ++){
            if (i % 2 ==0){
                System.out.println(i);
            }
        }
        b.finder69();
    }
}
