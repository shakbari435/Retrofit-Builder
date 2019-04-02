package com.phoenixdevs.retrofit;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.widget.Toast;

import com.phoenixdevs.retrofit.Retrofit.RetrofitBulider;
import com.phoenixdevs.retrofit.Retrofit.Users;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        RetrofitBulider.getApiService().getUsers().enqueue(new Callback<ArrayList<Users>>() {
            @Override
            public void onResponse(Call<ArrayList<Users>> call, Response<ArrayList<Users>> response) {


                Toast.makeText(MainActivity.this, ""+response.body().get(0).getName(), Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onFailure(Call<ArrayList<Users>> call, Throwable t) {

            }
        });







        String API_KEY="123123123123df";
        RetrofitBulider.getApiService().getUserDetails(2,API_KEY).enqueue(new Callback<Users>() {
            @Override
            public void onResponse(Call<Users> call, Response<Users> response) {


                Toast.makeText(MainActivity.this, ""+response.body().getName(), Toast.LENGTH_SHORT).show();



            }

            @Override
            public void onFailure(Call<Users> call, Throwable t) {
                Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
