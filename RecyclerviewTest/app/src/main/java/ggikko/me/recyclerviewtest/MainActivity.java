package ggikko.me.recyclerviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import ggikko.me.recyclerviewtest.recyclerview.GgikkoAdapter;
import ggikko.me.recyclerviewtest.recyclerview.Write;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.recycler_view) RecyclerView recycler_view;

    private GgikkoAdapter mAdapter;

    private List<Write> writingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mAdapter = new GgikkoAdapter(writingList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recycler_view.setLayoutManager(mLayoutManager);
        recycler_view.setItemAnimator(new DefaultItemAnimator());
        recycler_view.setAdapter(mAdapter);

        setWritingList();
    }

    private void setWritingList() {
        Write list1 = new Write("Recyclerview tutorial1", "it's interesting", "ggikko");
        writingList.add(list1);
        Write list2 = new Write("Recyclerview tutorial2", "it's very easy", "ggikko");
        writingList.add(list1);
        mAdapter.notifyDataSetChanged();
    }
}
