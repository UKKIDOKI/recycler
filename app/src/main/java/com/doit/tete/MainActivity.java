package com.doit.tete;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RetrofitAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://senior.bucheon.go.kr")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);
        api.getData().enqueue(new Callback<List<Data>>() {
            @Override
            public void onResponse(Call<List<Data>> call, Response<List<Data>> response) {
                if (response.isSuccessful()) {



                        List<Device> data = response.body().get().getDevices();

                        //   data.add((Data) new Data().getDevices());

                        //    data.add(data.get(2));
                        //  data.add(data.get(3));

                        Log.d("TEST", "성공성공");
                        //      Log.d("TEST", data.get());


                        mAdapter = new RetrofitAdapter(data);
                        //   mAdapter = new RetrofitAdapter(data.get(2).getDevices());


                        //    mAdapter = new RetrofitAdapter(data.get(1).getDevices());
//                    mAdapter = new RetrofitAdapter(data.get(2).getDevices());
//                    mAdapter = new RetrofitAdapter(data.get(3).getDevices());
                        recyclerView.setAdapter(mAdapter);


                }
            }

            @Override
            public void onFailure(Call<List<Data>> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}