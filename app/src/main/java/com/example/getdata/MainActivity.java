package com.example.getdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.getdata.adapter.RecyclerViewAdapter;
import com.example.getdata.interfaces.WeatherApi;
import com.example.getdata.modelclasses.MainArray;
import com.example.getdata.modelclasses.SubArray;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    List<SubArray> mainArraylist;


    ListView listView;
    TextView textView;



    RecyclerView myr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // listView = findViewById(R.id.idList);
        textView = findViewById(R.id.idText);
        myr=(RecyclerView)findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        myr.setLayoutManager(mLayoutManager);
        mainArraylist = new ArrayList<>();



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://8b7dcc2a6a7f.ngrok.io/api/v1/lmw/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WeatherApi myapi = retrofit.create(WeatherApi.class);

  /*      Call<MainArray> call = myapi.getdata(1,1991);
        Call<MainArray> call2 = myapi.get_gadget();*/

       //Call<MainArray> call = myapi.getImagess("http://de1572dbb46e.ngrok.io/api/v1/lmw/gadget/search?sector_id=1&gadget_year=1991");
     Call<MainArray> call = myapi.getImagess("http://8b7dcc2a6a7f.ngrok.io/api/v1/lmw/gadget/");
       //Call<MainArray> call = myapi.getImagess("http://8b7dcc2a6a7f.ngrok.io/api/v1/lmw/posts");



 /*       call.enqueue(new Callback<MainArray>() {
            @Override
            public void onResponse(Call<MainArray> call, Response<MainArray> response) {

                if(!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "No data found : "+response.code(),Toast.LENGTH_SHORT).show();
                }

                Log.e("Home  - --", "onResponse: " + response.body());

                MainArray mydata = response.body();
                mainArraylist = mydata.getData();

                RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(MainActivity.this, mainArraylist);
                myr.setAdapter(myAdapter);

            }

            @Override
            public void onFailure(Call<MainArray> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Fail "+t, Toast.LENGTH_SHORT).show();

            }
        });*/



        call.enqueue(new Callback<MainArray>() {
            @Override
            public void onResponse(Call<MainArray> call, Response<MainArray> response) {

              if(!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "No data found : "+response.code(),Toast.LENGTH_SHORT).show();
                }


                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this, "Success "+response.code(),Toast.LENGTH_SHORT).show();
                }

                MainArray mydata = response.body();
                mainArraylist = mydata.getData();


                RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(MainActivity.this, mainArraylist);
                 myr.setAdapter(myAdapter);

                int a= mainArraylist.size();




                Toast.makeText(MainActivity.this, ""+a, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<MainArray> call, Throwable t) {

                Toast.makeText(MainActivity.this, ""+t,Toast.LENGTH_SHORT).show();
            }
        });




    }
}