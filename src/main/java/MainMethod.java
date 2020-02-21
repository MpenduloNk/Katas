import java.awt.*;

public class MainMethod {

    public static void main(String[] args){
        ArrCombine exe =  new ArrCombine();
        String[] arr = {"the","quick",  "fox", "brown","chicke", "ate", "import"};
        int[] arrNum1 = {11,22,33};
        int[] arrNum2 = {1,2,3};

        EvenOdd even = new EvenOdd();
        even.evenOrOdd(5);

        Hello h = new Hello();
        h.hello(" Nkosinathi");

        Square sqr = new Square();
        sqr.square(4);


        int first = 5;
        Triangle tri = new Triangle();
        tri.triangle(first);


        Isosceles is = new Isosceles();
        is.isosceles(5);

        exe.combine(arrNum1, arrNum2);
        String[] nameX = {"Write","Good","Code","Every","Day"};

        Longest lng = new Longest(arr);
        System.out.println(lng.longest());


        FrameString frame = new FrameString(nameX);;
        frame.StartWords();



    }
}
