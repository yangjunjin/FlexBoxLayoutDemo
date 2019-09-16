package com.cq.flexboxlayoutdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.flexbox.FlexboxLayoutManager;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ${YangJunJin}
 * on 2019/9/6
 */
public class FlexBoxAdapter extends RecyclerView.Adapter<FlexBoxAdapter.ViewHolder> {
    List<String> mlist = Arrays.asList("我们", "世界真的没脸", "你们dfd辅导费", "android", "Java", "Html", "sqlite", "哈哈哈android java 哈哈哈", "你们dfd", "我诶","我们", "世界真的没脸", "你们dfd辅导费", "android", "Java", "Html", "sqlite", "哈哈哈android java 哈哈哈", "你们dfd", "我诶");

    @NonNull
    @Override
    public FlexBoxAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tag, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlexBoxAdapter.ViewHolder holder, final int position) {
        holder.tvName.setText(mlist.get(position));
        holder.tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(mlist.get(position));
            }
        });
    }

    interface OnClickListener {
        void onClick(String text);
    }

    OnClickListener mListener;

    public FlexBoxAdapter setmListener(OnClickListener mListener) {
        this.mListener = mListener;
        return this;
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
