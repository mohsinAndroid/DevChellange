package com.devcrewchallange.presenter;

import android.content.Context;

import com.devcrewchallange.data.Product;
import com.devcrewchallange.model.DatabaseHandler;
import com.devcrewchallange.view.ContactView;

import java.util.HashMap;
import java.util.Map;


public class ContactPresenter {
    Context context;
    ContactView contactView;

    public ContactPresenter(Context context, ContactView contactView) {
        this.context = context;
        this.contactView = contactView;
    }

    public void addDemoPorducts() {
        DatabaseHandler databaseHandler = new DatabaseHandler(context);

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "Best Buy");
        hashMap.put("b", "Rit Aid");
        hashMap.put("c", "Dollar General");
        hashMap.put("d", "Wall Mart");


        Product product1 = new Product("Samsung", "Founded back in 1969 as Samsung Electric Industries, Suwon, South Korea-headquartered Samsung Electronics today makes everything from televisions to semiconductors. It released its first Android smartphone in 2009, and can be credited with the launch of the first Android tablet back in 2010. The company is among the biggest players in the smartphone market in the world. It has recently developed smartphones running Tizen OS, as an alternative to its Android-based smartphones.", 700.0, 800.0, "xyz", new String[]{"red"}, hashMap);
        Product product2 = new Product("LG G4", "LG G4 smartphone was launched in April 2015. The phone comes with a 5.50-inch touchscreen display with a resolution of 1440 pixels by 2560 pixels at a PPI of 538 pixels per inch.", 600.0, 700.0, "xyz", new String[]{"red", "black"}, hashMap);
        Product product3 = new Product("Samsungn Note 8", "Founded back in 1969 as Samsung Electric Industries, Suwon, South Korea-headquartered Samsung Electronics today makes everything from televisions to semiconductors. It released its first Android smartphone in 2009, and can be credited with the launch of the first Android tablet back in 2010. The company is among the biggest players in the smartphone market in the world. It has recently developed smartphones running Tizen OS, as an alternative to its Android-based smartphones.", 200.0, 300.0, "xyz", new String[]{"purple,orange"}, hashMap);

        databaseHandler.addProduct(product1);
        databaseHandler.addProduct(product2);
        databaseHandler.addProduct(product3);
    }


}
