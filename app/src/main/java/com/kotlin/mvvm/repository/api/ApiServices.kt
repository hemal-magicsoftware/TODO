package com.kotlin.mvvm.repository.api

import androidx.lifecycle.LiveData
import androidx.room.Delete
import com.kotlin.mvvm.repository.api.network.Resource
import com.kotlin.mvvm.repository.model.TodoModel
import okhttp3.Response
import okhttp3.ResponseBody
import retrofit2.http.*

interface ApiServices {
    /**
     * Fetch Todos
     */
    @GET("todo")
    fun getTodos(): LiveData<Resource<List<TodoModel>>>

    /**
     * Add Todos
     */
    @POST("todo")
    fun addTodo(@Body hashMap: HashMap<String, Any>): LiveData<Resource<TodoModel>>

    /**
     * Update Todos
     */
    @FormUrlEncoded
    @PUT("todo/{id}")
    fun updateTodo(
        @Path("id") id: String,
        @Field("title") title: String,
        @Field("body") body: String,
        @Field("completed") completed: Boolean
    ): LiveData<Resource<TodoModel>>

    /**
     * Delete Todos
     */
    @DELETE("todo/{id}")
    fun deleteTodo(@Path("id") id: String): LiveData<Resource<TodoModel>>

}
