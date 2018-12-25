package com.example.admin.kotlintest

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.TextView
import com.appbaselib.base.BaseActivity
import com.appbaselib.rx.get2
import kotlinx.android.synthetic.main.activity_main2.*
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

class Main2Activity : BaseActivity() {

    private lateinit var mLightAdapter: LightAdapter
    private var list = mutableListOf<Any>()

    override fun getToolbar(): Toolbar? {
        return null
    }


    override fun initView(mSavedInstanceState: Bundle?) {

        list.add(Testone("請問"))
        list.add(TestTwo("2342423424"))
        list.add(TestThree("two"))
        list.add(Testone("發士大夫"))
        list.add(TestTwo("twy567686o"))
        list.add(TestThree("two"))
        list.add(Testone("顺丰的  "))
        list.add(TestTwo("867867"))
        list.add(TestThree("two"))
        list.add(Testone("个"))
        list.add(TestTwo("645465464"))
        list.add(TestThree("two"))
        list.add(Testone("on过分e"))
        list.add(TestTwo("78674567gh"))
        list.add(TestThree("two"))
        mLightAdapter = LightAdapter(list).register(R.layout.one, Testone::class.java, LightAdapter.Convert { mBaseViewHolder, position ->

        //    (mBaseViewHolder.getView(R.id.tv) as TextView).text = list.get(position).toString()
        })
                .register(R.layout.two, TestTwo::class.java, object : LightAdapter.Convert {
                    override fun convert(mBaseViewHolder: BaseViewHolder?, position: Int) {

                        (mBaseViewHolder?.getView(R.id.yyy) as TextView).text = list.get(position).toString()

                    }

                })
                .register(R.layout.three, TestThree::class.java, LightAdapter.Convert { mBaseViewHolder, position ->

                })

        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerview.adapter = mLightAdapter
    }

    override fun getContentViewLayoutID(): Int {
        return R.layout.activity_main2
    }

    override fun getLoadingTargetView(): View? {
        return null

    }


}
