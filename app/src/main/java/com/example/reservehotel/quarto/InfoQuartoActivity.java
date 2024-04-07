package com.example.reservehotel.quarto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.reservehotel.MainActivity;
import com.example.reservehotel.R;
import com.example.reservehotel.reserva.ReservaActivity;

public class InfoQuartoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_quarto);
    }

    public void backTelaPrincipal(View view) {
        Intent in = new Intent(InfoQuartoActivity.this, MainActivity.class);
        startActivity(in);
    }
}