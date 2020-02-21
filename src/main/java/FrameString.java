public class FrameString extends Longest{

    public String[] array;
    public FrameString(String[] arr) {
        super(arr);
        this.array = arr;
    }


    public  void StartWords(){

        int n = longest().get(0).length() + 4;


        for (int x = 0; x < n; x++){
            System.out.print("*");
        }
        System.out.println();

        for (int j = 0; j< array.length; j++){
            System.out.print("* "+array[j]);

            int indexSpace = (((n - array[j].length()) -2));
//            int indexSpace = ((longest().get(0).length() - array[j].length()) + 1);
            for (int i = 1; i <= indexSpace; i++){
                if (indexSpace == i){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int x = 0; x < n; x++){
            System.out.print("*");

        }
        System.out.println();
    }
}
