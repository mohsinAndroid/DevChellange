package com.devcrewchallange.viewholders;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.devcrewchallange.R;
import com.devcrewchallange.activities.BaseActivity;


public class CreateProductViewHolder extends BaseViewHolder {

    private EditText productNameEditText;
    private EditText productDescriptionEditText;
    private EditText regularPriceEditText;
    private EditText salePriceEditText;
    private EditText imageView;
    private CheckBox redCheckBox;
    private CheckBox bluekCheckBox;
    private CheckBox wallMartCheckBox;
    private CheckBox metroCheckBox;
    private Button addProductButton;


    public CreateProductViewHolder(BaseActivity view) {
        super(view);
        productNameEditText = (EditText) view.findViewById(R.id.name_edittext);
        productDescriptionEditText = (EditText) view.findViewById(R.id.description_edittext);
        regularPriceEditText = (EditText) view.findViewById(R.id.regular_price_edittext);
        salePriceEditText = (EditText) view.findViewById(R.id.sale_price_edittext);
        imageView = (EditText) view.findViewById(R.id.image_edittext);
        redCheckBox = (CheckBox) view.findViewById(R.id.red_checkbox);
        bluekCheckBox = (CheckBox) view.findViewById(R.id.blue_checkbox);
        wallMartCheckBox = (CheckBox) view.findViewById(R.id.wall_mart_checkbox);
        metroCheckBox = (CheckBox) view.findViewById(R.id.metro_checkbox);
        addProductButton = (Button) view.findViewById(R.id.create_product_button);
    }

    public EditText getProductNameEditText() {
        return productNameEditText;
    }

    public EditText getProductDescriptionEditText() {
        return productDescriptionEditText;
    }

    public EditText getRegularPriceEditText() {
        return regularPriceEditText;
    }

    public EditText getSalePriceEditText() {
        return salePriceEditText;
    }

    public EditText getImageView() {
        return imageView;
    }

    public CheckBox getRedCheckBox() {
        return redCheckBox;
    }

    public CheckBox getBluekCheckBox() {
        return bluekCheckBox;
    }

    public Button getAddProductButton() {
        return addProductButton;
    }

    public CheckBox getWallMartCheckBox() {
        return wallMartCheckBox;
    }

    public CheckBox getMetroCheckBox() {
        return metroCheckBox;
    }
}
