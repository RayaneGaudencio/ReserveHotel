package com.example.reservehotel.reserva;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.reservehotel.MainActivity;
import com.example.reservehotel.R;

public class ReservaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);
    }

    public void telaReserva(View view) {
        setContentView(R.layout.activity_reserva);
    }

    public void telaPrincipal(View view) {
        Intent in = new Intent(ReservaActivity.this, MainActivity.class);
        startActivity(in);
    }
}