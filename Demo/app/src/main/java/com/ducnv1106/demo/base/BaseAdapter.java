package com.ducnv1106.demo.base;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.ducnv1106.demo.BR;

import java.util.ArrayList;

public class BaseAdapter<T> extends RecyclerView.Adapter<BaseAdapter.BaseViewHolder>  {

    private ArrayList<T> data;

    private int layoutId;

    private Context context;

    private BaseListener listener;

    public void setListener(BaseListener listener) {
        this.listener = listener;
    }

    public BaseAdapter(@LayoutRes int layoutId, Context context) {
        this.layoutId = layoutId;
        this.context = context;
    }

    public void setData(ArrayList<T> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewDataBinding binding= DataBindingUtil.inflate(LayoutInflater.from(context),layoutId,parent,false);
        return new BaseViewHolder(binding);
    }

    @Override
    public int getItemCount() {
        return data==null?0:data.size();
    }

    @Override
    public void onBindViewHolder(BaseAdapter.BaseViewHolder holder, int position) {
            T item = data.get(position);
        Log.e("Adapter",data.get(position).toString());
            holder.binding.setVariable(BR.listener,listener);
             holder.binding.setVariable(BR.position,position);
            holder.binding.setVariable(BR.item,item);

    }

    public class BaseViewHolder extends RecyclerView.ViewHolder{

        private ViewDataBinding binding;

        public BaseViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }

    public interface BaseListener{
        public void onItemClicked(Integer position);
    }
}
