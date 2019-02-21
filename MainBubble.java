import Controller.BubbleController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainBubble {
    public static void main(String[] args) {
        List<Integer> myList =
                new ArrayList<>(Arrays.asList(1,4,3,2,5,6,556,7,8,7));
        BubbleController bc = new BubbleController();
        System.out.println(bc.sortASC(myList));

    }


}
