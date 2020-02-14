package com.e.databaseexample;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<List<Temperature>> call = apiInterface.getTemperature(10,1);

        call.enqueue(new Callback<List<Temperature>>() {
            @Override
            public void onResponse(Call<List<Temperature>> call, Response<List<Temperature>> response) {
                if(response.isSuccessful()){
                    List<Temperature> temperatures = response.body();

                    for(Temperature temperature : temperatures){
                        Log.v("Temperature: ",temperature.temperature.toString());
                    }
                }

            }

            @Override
            public void onFailure(Call<List<Temperature>> call, Throwable t) {

            }
        });

        Call<List<Humidity>> call1 = apiInterface.getHumidity(10,1);

        call1.enqueue(new Callback<List<Humidity>>() {
            @Override
            public void onResponse(Call<List<Humidity>> call, Response<List<Humidity>> response) {

            }

            @Override
            public void onFailure(Call<List<Humidity>> call, Throwable t) {

            }
        });

    }
}
