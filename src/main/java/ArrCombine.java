import java.util.ArrayList;
import java.util.stream.IntStream;

public class ArrCombine {











//    static String lon (String [] feli){
//        int max = 0;
//        String fel = "";
//        for (String f : feli) {
//            if(f.length() > max){
//                max = f.length();
//                fel = f;
//            }
//        }
//        return fel;
//    }



    public void combine(int[] arrNum, int[] arrTwo){
        //int n = arrTwo.length - arrTwo.length + 1;
        ArrayList<Integer> joinedArr = new ArrayList<>();
        for (int i = 0; i < arrNum.length; i++){
            joinedArr.add(arrNum[i]);
            for (int x = 0; x < 1; x++){
                joinedArr.add(arrTwo[i]);
            }
        }
        System.out.println(joinedArr);
    }






}
