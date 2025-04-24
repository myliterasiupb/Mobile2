package com.example.myliterasi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        // Ambil referensi TextView dan ImageView
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        ImageView imageViewMoana = findViewById(R.id.imageViewMoana);

        // Set gambar dari drawable
        try {
            imageViewMoana.setImageResource(R.drawable.princesmoana);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Teks cerita Princess Moana
        String cerita = "Di sebuah pulau tropis bernama Motunui, hiduplah seorang gadis pemberani bernama Moana. " +
                "Sejak kecil, Moana merasa panggilan dari lautan dan ingin menjelajah samudra. " +
                "Namun, ayahnya, Kepala Suku Motunui, melarangnya pergi karena bahaya di luar sana.\n\n" +

                "Suatu hari, tanah dan laut di sekitar pulau mulai mati karena kutukan. " +
                "Nenek Moana memberitahunya bahwa satu-satunya cara untuk menyelamatkan pulau adalah dengan mengembalikan " +
                "hati Te Fiti, dewi penciptaan, yang dicuri oleh setengah-dewa Maui.\n\n" +

                "Dengan keberanian, Moana berlayar melintasi lautan untuk menemukan Maui dan memintanya mengembalikan hati Te Fiti. " +
                "Namun, Maui awalnya menolak. Dengan ketekunan dan semangatnya, Moana berhasil meyakinkan Maui untuk membantunya.\n\n" +

                "Mereka menghadapi berbagai tantangan, termasuk pertempuran dengan monster kelapa Kakamora dan menghadapi makhluk lava jahat bernama Te Kā. " +
                "Namun, Moana menyadari bahwa Te Kā sebenarnya adalah Te Fiti yang kehilangan hatinya. Dengan keberanian, ia mengembalikan hati Te Fiti, " +
                "dan kutukan pun terangkat. Alam kembali hidup dan seimbang.\n\n" +

                "Setelah menyelesaikan misinya, Moana kembali ke Motunui dan mengajarkan rakyatnya cara menjadi pelaut hebat seperti leluhur mereka. " +
                "Ia membuktikan bahwa takdirnya bukan ditentukan oleh orang lain, tetapi oleh keberaniannya sendiri.\n\n" +

                "Moana tidak hanya menjadi pemimpin bagi rakyatnya, tetapi juga inspirasi bahwa keberanian dan keyakinan dapat mengubah dunia.";

        // Set teks ke TextView
        textViewCerita.setText(cerita);
    }
}
