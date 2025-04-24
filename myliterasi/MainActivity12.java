package com.example.myliterasi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        // Ambil referensi TextView dan ImageView
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        ImageView imageViewAriel = findViewById(R.id.imageViewAriel); // ✅ Perbaikan ID

        // Set gambar dari drawable
        try {
            imageViewAriel.setImageResource(R.drawable.princesariel);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Teks cerita
        String cerita = "Dahulu kala, di dasar laut yang luas dan indah, hiduplah seorang putri duyung bernama Ariel. " +
                "Ia adalah anak bungsu Raja Triton, penguasa lautan, yang memiliki suara merdu dan kecantikan luar biasa. " +
                "Ariel sangat penasaran dengan dunia manusia dan sering mengunjungi permukaan laut untuk mengamati mereka, " +
                "meskipun ayahnya melarangnya.\n\n" +

                "Suatu hari, saat badai besar melanda laut, Ariel melihat seorang pangeran tampan bernama Eric yang kapalnya " +
                "dihantam ombak besar. Tanpa ragu, Ariel menyelamatkannya dan membawanya ke pantai. " +
                "Saat Eric sadar, ia hanya sempat melihat sekilas sosok Ariel sebelum gadis itu kembali ke laut. " +
                "Sejak saat itu, Ariel semakin jatuh cinta pada dunia manusia dan ingin menjadi manusia agar bisa bersama Eric.\n\n" +

                "Karena obsesinya, Ariel pergi ke penyihir laut jahat, Ursula, yang menawarkan kesepakatan. " +
                "Ursula akan mengubah Ariel menjadi manusia, tetapi sebagai gantinya, Ariel harus menyerahkan suara merdunya. " +
                "Jika dalam tiga hari Eric tidak menciumnya dengan cinta sejati, maka Ariel akan kembali menjadi putri duyung dan menjadi milik Ursula selamanya.\n\n" +

                "Ariel setuju dan berubah menjadi manusia. Ia bertemu dengan Eric, tetapi tanpa suaranya, ia kesulitan meyakinkan pangeran bahwa dialah gadis yang menyelamatkannya. " +
                "Meski begitu, Eric mulai jatuh cinta padanya. Namun, sebelum mereka bisa berciuman, Ursula menyamar sebagai wanita cantik bernama Vanessa, menggunakan suara Ariel untuk menghipnotis Eric agar menikah dengannya.\n\n" +

                "Saat Ariel dan teman-temannya menemukan kebenaran, mereka berusaha menggagalkan pernikahan itu. " +
                "Dengan bantuan Sebastian, Flounder, dan Scuttle, Ariel berhasil merebut kembali suaranya. " +
                "Saat Eric sadar bahwa Ariel adalah gadis yang ia cari, ia bergegas untuk menciumnya, tetapi waktu sudah habis. " +
                "Ariel kembali menjadi putri duyung dan Ursula menculiknya.\n\n" +

                "Melihat putrinya dalam bahaya, Raja Triton mengorbankan dirinya untuk menyelamatkan Ariel, menyerahkan kekuatannya kepada Ursula. " +
                "Namun, Eric berani melawan Ursula dan dalam pertarungan sengit, ia berhasil mengalahkannya dengan menusukkan ujung kapal ke tubuh Ursula.\n\n" +

                "Setelah Ursula kalah, Raja Triton kembali mendapatkan kekuatannya. Menyadari bahwa Ariel benar-benar mencintai Eric, " +
                "ia mengubah Ariel menjadi manusia permanen. Akhirnya, Ariel dan Eric menikah, hidup bahagia, dan bersatu antara dunia laut dan manusia.";

        // Set teks ke TextView
        textViewCerita.setText(cerita);
    }
}
