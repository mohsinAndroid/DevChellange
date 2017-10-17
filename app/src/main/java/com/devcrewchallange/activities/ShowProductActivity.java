package com.devcrewchallange.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.devcrewchallange.R;
import com.devcrewchallange.adapters.ProductAdapter;
import com.devcrewchallange.presenter.ShowProductPresenter;
import com.devcrewchallange.view.ShowProductView;
import com.devcrewchallange.viewholders.ShowProductViewHolder;

public class ShowProductActivity extends BaseActivity implements ShowProductView {

    private ShowProductViewHolder holder;
    private ShowProductPresenter presenter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_product);
        holder = new ShowProductViewHolder(this);
        presenter = new ShowProductPresenter(this, this);
        setUpProductRecyclerView();

    }


    private void setUpProductRecyclerView() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        ProductAdapter productAdapter = new ProductAdapter(presenter.getAllProducts());

        holder.getShowProductRecyclerView().setLayoutManager(linearLayoutManager);
        holder.getShowProductRecyclerView().setAdapter(productAdapter);


    }

}
