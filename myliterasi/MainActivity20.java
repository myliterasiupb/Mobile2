package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        // Menghubungkan TextView dan ImageView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);
        ImageView imageViewSerigala = findViewById(R.id.imageViewSerigala);

        // Set gambar dari drawable
        imageViewSerigala.setImageResource(R.drawable.serigala_baik);

        // Teks cerita "Serigala yang Baik Hati"
        String cerita = "Di sebuah hutan lebat, hiduplah seekor serigala yang dikenal dengan sifatnya yang baik hati. "
                + "Berbeda dengan serigala lain yang sering menakut-nakuti hewan kecil, serigala ini justru sering membantu mereka.\n\n"
                + "Suatu hari, seekor kelinci kecil terperangkap di dalam semak berduri. Ia tidak bisa keluar karena kakinya terluka. "
                + "Serigala yang sedang berjalan di hutan mendengar tangisan kelinci dan segera mendekat.\n\n"
                + "Alih-alih memangsa kelinci, serigala itu dengan hati-hati mengangkatnya dan membersihkan luka di kakinya. "
                + "Setelah beberapa hari dirawat, kelinci pun sembuh dan sangat berterima kasih kepada serigala.\n\n"
                + "Berita tentang kebaikan serigala itu menyebar ke seluruh hutan. Hewan-hewan yang sebelumnya takut padanya "
                + "sekarang menghormatinya dan menganggapnya sebagai teman.\n\n";

        // Teks pesan moral
        String pesanMoral = "Pesan Moral:\nKebaikan hati dapat mengubah cara orang lain memandang kita. "
                + "Tidak peduli bagaimana kita dinilai, tetaplah berbuat baik karena itu akan membawa kebahagiaan.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
