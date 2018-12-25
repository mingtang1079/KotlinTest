package com.example.admin.kotlintest


import com.appbaselib.base.BaseModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface API {

    /**
     * 签到信息
     *
     * @return
     */
    @POST("api/today")
    fun today(): Observable<BaseModel<List<User>>>

}
