package com.zainpradana.restoujk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.text.NumberFormat;
import java.util.Locale;

public class HitungPesanan extends AppCompatActivity {
    EditText etMenuPaket, etHarga, etJumlah, etJumlahHargaPesanan, etJumlahDiskon, etTotalBayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_pesanan);

        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        etMenuPaket = findViewById(R.id.et_menu_paket);
        etHarga = findViewById(R.id.et_harga);
        etJumlah = findViewById(R.id.et_jumlah);
        etJumlahHargaPesanan = findViewById(R.id.et_jumlah_harga_pesanan);
        etJumlahDiskon = findViewById(R.id.et_jumlah_diskon);
        etTotalBayar = findViewById(R.id.et_total_bayar);

        etMenuPaket.setText(getIntent().getStringExtra("Nama Paket"));

        int harga = getIntent().getIntExtra("Harga", 0);
        etHarga.setText(formatRupiah.format(harga));

        int jumlah = getIntent().getIntExtra("Jumlah", 0);
        etJumlah.setText(String.valueOf(jumlah));

        int jumlahHargaPesanan = harga * jumlah;
        etJumlahHargaPesanan.setText(formatRupiah.format(jumlahHargaPesanan));

        double diskon = getIntent().getDoubleExtra("Diskon", 0);
        double jumlahDiskon = (diskon / 100) * harga;

        etJumlahDiskon.setText(formatRupiah.format(jumlahDiskon));

        double totalBayar = jumlahHargaPesanan - jumlahDiskon;
        etTotalBayar.setText(formatRupiah.format(totalBayar));
    }

    public void keMenuUtama(View view) {
        Intent i = new Intent(HitungPesanan.this, MainActivity.class);
        startActivity(i);
    }
}