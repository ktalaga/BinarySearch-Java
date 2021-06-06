import java.util.ArrayList;

public class Search {

    public boolean linearSearch(ArrayList<Integer> searchedArray, int searchedNumber){
        for(int number : searchedArray){
            if(number==searchedNumber){
                return true;
            }
        }return false;
    }

    public boolean binarySearch(ArrayList<Integer> searchedArray, int searchedNumber) {
        if(searchedArray.size() == 0){
            return false;
        }

        int midIndex = 0;
        if(searchedArray.size() >1){
            midIndex = (int) Math.ceil((double) searchedArray.size()/2);
        }
        int midPoint = searchedArray.get(midIndex);

        if(midPoint == searchedNumber){
            return true;
        }
        ArrayList<Integer> newSearchArea;

        if(searchedNumber < midPoint){
            newSearchArea = new ArrayList<Integer>(searchedArray.subList(0, midIndex));
        } else {
            newSearchArea = new ArrayList<Integer>(searchedArray.subList(midIndex+1, searchedArray.size()));
        }
        return binarySearch(newSearchArea, searchedNumber);
    }

}
