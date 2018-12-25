package com.example.admin.kotlintest

import android.content.Context
import android.support.annotation.IdRes
import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.View
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView


class BaseViewHolder : RecyclerView.ViewHolder {

    private val views = SparseArray<View>()

    constructor(view: View, convert: LightAdapter.Convert) : super(view) {
        this.convert = convert
    }

    fun getView(@IdRes viewId: Int): View? {
        var view: View? = views.get(viewId)
        if (view == null) {
            view = itemView.findViewById(viewId)
            views.put(viewId, view)
        }
        return view
    }

    fun setText(viewId: Int, text: String): BaseViewHolder {
        var mTextView = getView(viewId) as TextView
        mTextView.text = text
        return this

    }

    var convert: LightAdapter.Convert;
}