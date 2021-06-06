import java.util.ArrayList;

public class Search {

    public boolean linearSearch(ArrayList<Integer> searchedArray, int searchedNumber){
        for(int number : searchedArray){
            if(number==searchedNumber){
                return true;
            }
        }return false;
    }

}
