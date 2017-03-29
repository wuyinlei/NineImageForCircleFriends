package com.mingchu.nineimageforcirclefriends;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.google.gson.Gson;
import com.mingchu.nineimageforcirclefriends.bean.CircleDataBean;
import com.mingchu.nineimageforcirclefriends.bean.CircleDataBean.DataBean.ListBean;
import com.mingchu.nineimageforcirclefriends.utils.JsonUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView mListView;
    private List<ListBean> mListBeen = new ArrayList<>();
    private DynamicsAdapter mDynamicsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initData();

    }

    private void initData() {
        String result = JsonUtils.getJson(this, "data.json");
        Gson gson = new Gson();
        CircleDataBean dataBean = gson.fromJson(result, CircleDataBean.class);
        if (dataBean!= null){
            mListBeen = dataBean.getData().getList();
            if (mListBeen != null && mListBeen.size() > 0){
                mDynamicsAdapter.setListBeen(mListBeen);
            }
        }
    }


    private void initView() {

        mListView = (ListView) findViewById(R.id.list_item);
        mDynamicsAdapter = new DynamicsAdapter(this);
        mListView.setAdapter(mDynamicsAdapter);
    }
}
