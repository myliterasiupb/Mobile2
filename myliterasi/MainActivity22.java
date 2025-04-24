package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        // Menghubungkan TextView dan ImageView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);
        ImageView imageViewKambingSerigala = findViewById(R.id.imageViewKambingSerigala);

        // Set gambar dari drawable
        imageViewKambingSerigala.setImageResource(R.drawable.kambing_serigala);

        // Teks cerita "Anak Kambing dan Serigala"
        String cerita = "Di sebuah padang rumput yang luas, hiduplah seekor anak kambing yang ceria. "
                + "Ia selalu bermain di dekat rumahnya dan mendengarkan nasihat ibunya agar berhati-hati dengan serigala.\n\n"
                + "Suatu hari, saat ibunya pergi mencari makanan, anak kambing itu melihat sekumpulan bunga yang indah di tepi hutan. "
                + "Ia sangat ingin mengambilnya, tetapi tiba-tiba muncul seekor serigala lapar.\n\n"
                + "Serigala itu berkata dengan suara lembut, \"Hai anak kambing, aku hanya ingin berbicara. Jangan takut, aku tidak akan menyakitimu.\" "
                + "Namun, anak kambing ingat nasihat ibunya untuk tidak mudah percaya pada musuh.\n\n"
                + "Anak kambing pun berpikir cepat. Ia berkata dengan lantang, \"Serigala, aku tahu kau ingin memangsaku. Tapi sebelum itu, "
                + "biarkan aku menyanyikan lagu terakhirku.\" Serigala yang penasaran mengizinkannya.\n\n"
                + "Anak kambing kemudian menyanyi sekeras-kerasnya. Suaranya menggema di padang rumput, dan para anjing penjaga mendengarnya. "
                + "Mereka segera datang dan mengusir serigala. Anak kambing pun selamat dan belajar bahwa kecerdikan bisa menyelamatkan nyawa.\n\n";

        // Teks pesan moral
        String pesanMoral = "Pesan Moral:\nJangan mudah percaya pada orang yang berniat jahat. "
                + "Berpikirlah dengan cerdas dalam menghadapi bahaya dan selalu ingat nasihat orang tua.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
