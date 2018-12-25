package com.example.admin.kotlintest

import android.content.Context
import android.util.AttributeSet
import com.appbaselib.base.BaseLifeCycleView
import com.appbaselib.rx.get2
import com.appbaselib.utils.ToastUtils.showToast
import kotlinx.android.synthetic.main.oneoneone.view.*

class ViewOne @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : BaseLifeCycleView(context, attrs, defStyleAttr) {
    override val contentViewLayoutID: Int
        get() = R.layout.oneoneone

    override fun onCreate() {
        super.onCreate()
        //网络请求  todo something
        Http.getDefault().today()
                .get2(context) {

                }
    }

}