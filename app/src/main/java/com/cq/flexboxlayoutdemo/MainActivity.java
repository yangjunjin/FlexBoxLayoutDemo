package com.cq.flexboxlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.flexbox.FlexboxLayoutManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        FlexboxLayoutManager manager = new FlexboxLayoutManager(MainActivity.this) {
            @Override
            public boolean canScrollVertically() {
                return true;
            }
        };
        //设置主轴排列方式
        manager.setFlexDirection(FlexDirection.ROW);
        //设置是否换行
        manager.setFlexWrap(FlexWrap.WRAP);
        recyclerView.setLayoutManager(manager);

        FlexBoxAdapter adapter = new FlexBoxAdapter();
        recyclerView.setAdapter(adapter);

        adapter.setmListener(new FlexBoxAdapter.OnClickListener() {
            @Override
            public void onClick(String text) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void v2(){
//我是最帅的咯，果然如此我
    }
}
