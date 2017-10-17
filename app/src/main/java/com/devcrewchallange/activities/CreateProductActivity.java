package com.devcrewchallange.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.devcrewchallange.R;
import com.devcrewchallange.presenter.CreateProductPresenter;
import com.devcrewchallange.view.CreateProductView;
import com.devcrewchallange.viewholders.CreateProductViewHolder;

import java.util.HashMap;

public class CreateProductActivity extends BaseActivity implements CreateProductView, View.OnClickListener {

    private CreateProductViewHolder viewHolder;
    private CreateProductPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_product);

        viewHolder = new CreateProductViewHolder(this);
        presenter = new CreateProductPresenter(this, this);

        setListeners();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.create_product_button:
                createProduct();
                Toast.makeText(this, "Product Added", Toast.LENGTH_LONG).show();
                finish();
                break;
        }

    }

    private void setListeners() {viewHolder.getAddProductButton().setOnClickListener(this);}


    private void createProduct() {


        String[] colors = new String[]{"", ""};
        HashMap<String, String> stores = new HashMap<>();

        if (viewHolder.getRedCheckBox().isChecked()) {
            colors[0] = "red";
        }

        if (viewHolder.getBluekCheckBox().isChecked()) {
            colors[1] = "blue";
        }


        if (viewHolder.getWallMartCheckBox().isChecked()) {
            stores.put("a", "Wall Mart");
        }

        if (viewHolder.getWallMartCheckBox().isChecked()) {
            stores.put("b", "Metro");
        }


        presenter.createProduct(viewHolder.getProductNameEditText().getText().toString(), viewHolder.getProductDescriptionEditText().getText().toString(), viewHolder.getRegularPriceEditText().getText().toString(), viewHolder.getSalePriceEditText().getText().toString(), "img", colors, stores);

    }

}
