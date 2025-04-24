package com.example.myliterasi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        // Ambil referensi TextView dan ImageView
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        ImageView imageViewBelle = findViewById(R.id.imageViewBelle);

        // Set gambar dari drawable
        try {
            imageViewBelle.setImageResource(R.drawable.princesbelle);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Teks cerita Princess Belle
        String cerita = "Di sebuah desa kecil, hiduplah seorang gadis cantik dan cerdas bernama Belle. " +
                "Ia sangat suka membaca buku dan bermimpi menjalani petualangan yang lebih besar di luar desanya. " +
                "Namun, penduduk desa menganggapnya aneh karena kecintaannya pada buku dan pikirannya yang terbuka.\n\n" +

                "Suatu hari, ayah Belle, Maurice, tersesat di hutan dan menemukan sebuah kastil misterius. " +
                "Di dalam kastil itu, ia ditangkap oleh penghuni kastil yang ternyata adalah seekor monster buas. " +
                "Ketika Belle mengetahui hal ini, ia segera pergi ke kastil dan menawarkan diri untuk menggantikan ayahnya. " +
                "Monster itu setuju, dan Belle pun menjadi tahanan di kastil tersebut.\n\n" +

                "Awalnya, Belle merasa takut dan ingin pergi. Namun, seiring waktu, ia mulai mengenal penghuni kastil lainnya, " +
                "seperti Lumière si lilin, Cogsworth si jam, Mrs. Potts si teko, dan Chip si cangkir kecil. " +
                "Mereka semua baik hati dan menyambut Belle dengan ramah.\n\n" +

                "Sang monster, yang sebenarnya adalah seorang pangeran yang dikutuk, awalnya bersikap kasar. " +
                "Namun, Belle tetap sabar dan tidak takut menghadapinya. Lambat laun, Belle melihat sisi baik dari sang monster, " +
                "dan keduanya mulai saling memahami. Monster itu pun mulai berubah menjadi lebih lembut dan penuh perhatian kepada Belle.\n\n" +

                "Sementara itu, seorang pria sombong bernama Gaston, yang ingin menikahi Belle, " +
                "marah saat mengetahui Belle berada di kastil. Ia membangkitkan kemarahan warga desa dan mengajak mereka untuk menyerang kastil " +
                "karena menganggap monster itu berbahaya.\n\n" +

                "Saat pertempuran terjadi, Gaston melukai monster dengan serangan yang hampir fatal. " +
                "Namun, sebelum monster meninggal, Belle menyatakan cintanya kepadanya. " +
                "Karena cinta sejati Belle, kutukan yang menimpa monster pun terangkat. Monster itu berubah kembali menjadi pangeran tampan. " +
                "Kastil dan semua penghuninya juga kembali ke bentuk manusia mereka.\n\n" +

                "Akhirnya, Belle dan sang pangeran hidup bahagia bersama. Belle menyadari bahwa cinta sejati datang dari hati, " +
                "bukan dari penampilan luar. Ia pun mendapatkan petualangan yang selalu ia impikan, " +
                "bukan melalui perjalanan jauh, tetapi melalui perjalanan hatinya.";

        // Set teks ke TextView
        textViewCerita.setText(cerita);
    }
}
