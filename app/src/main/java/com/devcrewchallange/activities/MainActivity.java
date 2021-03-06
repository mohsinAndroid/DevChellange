package com.devcrewchallange.activities;

import android.os.Bundle;
import android.view.View;

import com.devcrewchallange.R;
import com.devcrewchallange.data.Product;
import com.devcrewchallange.presenter.ContactPresenter;
import com.devcrewchallange.util.SharedPreferenceHelper;
import com.devcrewchallange.util.Utils;
import com.devcrewchallange.view.ContactView;
import com.devcrewchallange.viewholders.ContactViewHolder;

import java.util.ArrayList;

public class MainActivity extends BaseActivity implements ContactView, View.OnClickListener {

    ContactViewHolder mHolder;
    private ContactPresenter mPresenter;

    private ArrayList<Product> mContactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHolder = new ContactViewHolder(this);
        mPresenter = new ContactPresenter(this, this);
        setListeners();


        if (!SharedPreferenceHelper.getInstance().getSharedPreferenceBoolean(this, getString(R.string.demo_products_key), false)) {
            mPresenter.addDemoPorducts();
            SharedPreferenceHelper.getInstance().setSharedPreferenceBoolean(this, getString(R.string.demo_products_key), true);
        }

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_product_button:
                Utils.getInstance().startActivity(this, ShowProductActivity.class);
                break;
            case R.id.create_product_button:
                Utils.getInstance().startActivity(this, CreateProductActivity.class);
                break;
        }
    }

    private void setListeners()

    {
        mHolder.getShowProductButton().setOnClickListener(this);
        mHolder.getCreateButton().setOnClickListener(this);

    }


}
