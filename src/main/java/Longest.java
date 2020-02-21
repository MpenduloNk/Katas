import java.util.ArrayList;

public class Longest {

    public String[] arr;

    public Longest(String[] array){
        this.arr = array;
    }

    public ArrayList<String> storedName = new ArrayList<>();
    public ArrayList<String> name = new ArrayList<>();

    public ArrayList<String> longest(){

        String longName = arr[0];
        int index = arr[0].length();

        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++){
            if (index <= arr[i].length() ){
                index = arr[i].length();
                longName = arr[i];
                storedName.add(longName);
            }
        }
        String str ="";
        for (int x = 0; x < storedName.size(); x++){
            if (longName.length() == storedName.get(x).length()){
               name.add(storedName.get(x));
            }
        }
    return name;
    }



}
