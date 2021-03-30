import java.awt.*;

public class StoreFront {
    public static void main(String[] args) {
        Book bookItem1 = new Book("Java Rules", "Oracle");
        Clothing clothingItem1 = new Shirt("Childs Tee", Clothing.Size.SMALL, Color.RED);
        Clothing clothingItem2 = new Shirt("Mens Button Down", Clothing.Size.LARGE, Color.BLUE);

        FeatureSpot<Item> mainFeature = new FeatureSpot<>();
        mainFeature.featureItem(bookItem1, 60);
        System.out.println(mainFeature);
        mainFeature.featureItem(clothingItem1, 60);
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
        }
        System.out.println(mainFeature);
    }
}
