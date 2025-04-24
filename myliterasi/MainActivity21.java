package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        // Menghubungkan TextView dan ImageView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);
        ImageView imageViewKancilTikus = findViewById(R.id.imageViewKancilTikus);

        // Set gambar dari drawable
        imageViewKancilTikus.setImageResource(R.drawable.kancil_tikus);

        // Teks cerita "Kancil dan Tikus"
        String cerita = "Di sebuah hutan yang lebat, hiduplah seekor kancil yang cerdik dan seekor tikus kecil yang gesit. "
                + "Meskipun tubuhnya kecil, tikus selalu ceria dan membantu hewan-hewan lain di hutan.\n\n"
                + "Suatu hari, kancil terjebak dalam sebuah lubang yang cukup dalam. Ia berusaha melompat keluar, tapi gagal. "
                + "Kancil mulai panik dan mencari cara lain untuk keluar.\n\n"
                + "Tikus yang kebetulan lewat mendengar suara kancil. Ia pun mendekati lubang dan melihat sahabatnya terjebak. "
                + "\"Jangan khawatir, Kancil! Aku akan membantumu!\" kata tikus dengan penuh semangat.\n\n"
                + "Tikus kemudian memanggil teman-temannya, seperti burung dan monyet, untuk membantu menarik kancil keluar dengan akar pohon. "
                + "Berkat kerja sama mereka, akhirnya kancil berhasil keluar dari lubang dengan selamat.\n\n"
                + "Kancil sangat berterima kasih kepada tikus dan teman-temannya. Sejak saat itu, kancil sadar bahwa tubuh kecil "
                + "bukanlah halangan untuk berbuat kebaikan. Ia belajar untuk lebih menghargai semua makhluk di hutan.\n\n";

        // Teks pesan moral
        String pesanMoral = "Pesan Moral:\nKebaikan tidak diukur dari ukuran tubuh, tetapi dari ketulusan hati. "
                + "Bekerja sama dan saling membantu akan membuat kehidupan lebih indah.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
