package com.seriescoding.restexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.seriescoding.restexample.model.User
import com.seriescoding.restexample.service.UserService
import com.seriescoding.restexample.util.ServiceProvider
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userService = ServiceProvider.getService(UserService::class.java)

        userService.users().enqueue(object : Callback<List<User>> {

            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                Log.d(packageName, "Users list fetched from the service")
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Log.e(packageName, "Failed to fetch users list from service")
            }
        })

    }
}
