package com.example.testapp;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView apiResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiResponse = findViewById(R.id.api_response);

        apicall();
    }

    @Override
    public void onBackPressed(){
        finishAffinity();
    }

    private void apicall(){
        final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setCancelable(false);
        progressDialog.setMessage("Loading...");
        progressDialog.show();

        (APIHelper.getClient().getResponse()).enqueue(new Callback<MyPojo>() {
            @Override
            public void onResponse(Call<MyPojo> call, Response<MyPojo> response) {
                Log.d("ResponseGET", response.body().getDesc());
                progressDialog.dismiss();

                Records[] arr = response.body().getRecords();

                String retVal = response.body().getDesc() + "\n \n";

                for(int i=0; i<arr.length; i++){
                    String state = arr[i].getStates_uts();
                    String num = arr[i].getNumbers_of_projects();
                    retVal += "State: " + state + " => " + num + "\n";
                }

                apiResponse.setText(retVal);
            }

            @Override
            public void onFailure(Call<MyPojo> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_LONG).show();
                progressDialog.dismiss();
            }
        });
    }
}
