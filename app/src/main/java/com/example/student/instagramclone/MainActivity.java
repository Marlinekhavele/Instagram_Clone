package com.example.student.instagramclone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private static String Base_URL ="http://api.androidhive.info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create retrofit object.
        Retrofit retrofit= new Retrofit.Builder().baseUrl(Base_URL).addConverterFactory(GsonConverterFactory.create()).build();
        ApiInterface api=retrofit.create(ApiInterface.class);
        api.getUsers().enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {
                Log.i("@onResponse",response.toString());
                Log.i("@onResponse",response.body().toString());

            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {
                  Log.e("@onFailure",t.getMessage());

            }
        });
    }
}
