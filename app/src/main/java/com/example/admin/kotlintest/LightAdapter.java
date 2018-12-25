package com.example.admin.kotlintest;

import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LightAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private @NonNull
    List<?> items;
    private List<Class> mTypes = new ArrayList<>();
    private List<Integer> mLayouts = new ArrayList<>();
    private List<Convert> mConverts = new ArrayList<>();

    private List<BaseViewHolder> mBaseViewHolders = new ArrayList<>();

    public LightAdapter register(@LayoutRes int layout, Class mClass, Convert mConvert) {
        mTypes.add(mClass);
        mLayouts.add(layout);
        mConverts.add(mConvert);
        return this;
    }

    public LightAdapter() {
        this(Collections.emptyList());
    }

    public LightAdapter(List<?> items) {
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        return mTypes.indexOf(items.get(position).getClass());
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(mLayouts.get(viewType), parent, false);
        return new BaseViewHolder(itemView, mConverts.get(viewType));
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.convert.convert(holder, position);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


    public interface Convert {
        void convert(BaseViewHolder mBaseViewHolder, int position);
    }

}
