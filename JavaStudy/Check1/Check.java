/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int[] date = {3,1,2,7,5};
        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
       for (int i =0; i < date.length; i++){
            System.out.print(date[i] + "");

       }
        System.out.println();

        for (int i= 0; i < date.length-1; i++){

            for(int j = date.length-1; j > i; j--){


                if(date[j-1] > date[j]){
                    int box = date[j];
                    date[j] = date[j-1];
                    date[j-1] = box;
                }
            }
        }
        for (int i = 0; i < date.length; i++){
            System.out.print(date[i] + "");
        }
    }
}
    