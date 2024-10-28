import java.util.ArrayList;
import java.util.Collections;

public class BogoOffer {

    public static void main(String[] args) {
        int priceList[] = new int[]{10, 20, 30, 40};
        ArrayList<Integer> productPriceList = new ArrayList<>();
        for (int price : priceList) {
            productPriceList.add(price);
        }
        
        ArrayList<Integer> payableItems = new ArrayList<>();
        ArrayList<Integer> freeItems = new ArrayList<>();

        Collections.sort(productPriceList, Collections.reverseOrder());
        System.out.println("Sorted list : " +  productPriceList);
        
        for (int i = 0; i < productPriceList.size(); i += 2) {
            payableItems.add(productPriceList.get(i));
            
            if (i + 1 < productPriceList.size()) {
                freeItems.add(productPriceList.get(i + 1));
            }
        }

        System.out.println("Free Items list : " + freeItems);
        System.out.println("Payable Items list: " + payableItems);
    }
}
