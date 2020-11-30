package com.zainpradana.restoujk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PaketA extends AppCompatActivity {
    TextView tvMenuPaket;
    EditText etHarga, etJumlah, etDiskon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_a);

        tvMenuPaket = findViewById(R.id.tv_menu_paket);
        etHarga = findViewById(R.id.et_harga);
        etJumlah = findViewById(R.id.et_jumlah);
        etDiskon = findViewById(R.id.et_diskon);

    }

    public void keMenuUtama(View view) {
        Intent i = new Intent(PaketA.this, MainActivity.class);
        startActivity(i);
    }

    public void keHitungPesanan(View view) {
        if (!etJumlah.getText().toString().equals("")) {
            Intent i = new Intent(PaketA.this, HitungPesanan.class);
            i.putExtra("Nama Paket", tvMenuPaket.getText());
            i.putExtra("Harga", Integer.parseInt(etHarga.getText().toString()));
            i.putExtra("Jumlah", Integer.parseInt(etJumlah.getText().toString()));
            i.putExtra("Diskon", Double.parseDouble(etDiskon.getText().toString()));
            startActivity(i);
        } else {
            Toast.makeText(this, "Data Belum Lengkap", Toast.LENGTH_SHORT).show();
        }

    }
}