package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        // Menghubungkan TextView dan ImageView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);
        ImageView imageViewUlat = findViewById(R.id.imageViewUlat);

        // Set gambar dari drawable
        imageViewUlat.setImageResource(R.drawable.ulat_sombong);

        // Teks cerita "Ulat yang Sombong"
        String cerita = "Di sebuah taman yang indah, hiduplah seekor ulat hijau yang sangat bangga dengan tubuhnya. "
                + "Ia merasa lebih hebat dari serangga lain karena tubuhnya panjang dan berwarna cerah.\n\n"
                + "Ulat itu sering mengejek semut, belalang, dan serangga kecil lainnya. \"Lihat tubuhku yang indah dan gemuk! "
                + "Aku pasti akan menjadi kupu-kupu paling cantik di taman ini!\" katanya dengan sombong.\n\n"
                + "Semut hanya tersenyum dan berkata, \"Hati-hati dengan kesombonganmu, Ulat. Kita semua memiliki keistimewaan sendiri.\"\n\n"
                + "Namun, ulat tidak mendengarkan nasihat itu. Ia terus membanggakan diri dan meremehkan serangga lain.\n\n"
                + "Suatu hari, ia merasakan tubuhnya semakin berat dan lambat. Ia pun mencari tempat untuk berubah menjadi kepompong. "
                + "Setelah beberapa hari, ulat berubah menjadi kepompong yang tidak bisa bergerak. Ia terkurung dalam cangkang keras.\n\n"
                + "Hari-hari berlalu, dan akhirnya ulat berubah menjadi kupu-kupu. Ia pun keluar dari kepompongnya dengan penuh harapan. "
                + "Namun, betapa terkejutnya ia saat melihat sayapnya kecil dan tidak bisa terbang jauh. "
                + "Ternyata, karena terlalu sombong dan hanya mementingkan tubuhnya yang besar dulu, ia kurang makan makanan sehat yang bisa membuatnya menjadi kupu-kupu kuat.\n\n"
                + "Dengan penuh penyesalan, ia kembali ke taman dan meminta maaf kepada teman-temannya. "
                + "Semut dan belalang pun menerimanya dengan senang hati, karena mereka tahu bahwa semua orang bisa berubah menjadi lebih baik.\n\n";

        // Teks pesan moral
        String pesanMoral = "Pesan Moral:\nJanganlah menjadi sombong, karena kesombongan bisa membuat kita meremehkan hal-hal penting. "
                + "Setiap makhluk memiliki kelebihan dan kekurangannya sendiri.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
