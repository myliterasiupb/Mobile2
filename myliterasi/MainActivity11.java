package com.example.myliterasi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        // Ambil referensi TextView dan ImageView
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        ImageView imageViewAurora = findViewById(R.id.imageViewPrincessAurora);

        // Set gambar dari drawable
        try {
            imageViewAurora.setImageResource(R.drawable.princesaurora);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Teks cerita
        String cerita = "Dahulu kala, di sebuah kerajaan yang megah, lahirlah seorang putri cantik bernama Aurora. " +
                "Orang tuanya, Raja Stefan dan Ratu Leah, sangat bahagia dan mengadakan pesta besar untuk merayakan kelahirannya. " +
                "Mereka mengundang tiga peri baik hati, Flora, Fauna, dan Merryweather, untuk memberikan berkah kepada Aurora.\n\n" +

                "Flora memberikan berkah kecantikan, Fauna memberikan berkah suara yang merdu. Namun, sebelum Merryweather dapat memberikan berkatnya, " +
                "penyihir jahat Maleficent muncul dan mengutuk Aurora. Ia mengatakan bahwa pada ulang tahunnya yang ke-16, " +
                "Aurora akan tertusuk jarum pintal dan tertidur selamanya. Namun, Merryweather yang belum sempat memberi berkat, " +
                "mengubah kutukan itu. Aurora tidak akan mati, tetapi hanya tertidur hingga ia dibangunkan oleh ciuman cinta sejati.\n\n" +

                "Untuk melindungi Aurora, ketiga peri membawanya ke dalam hutan dan membesarkannya sebagai gadis biasa bernama Briar Rose. " +
                "Selama 16 tahun, Aurora tumbuh menjadi gadis cantik dan baik hati tanpa mengetahui identitas aslinya. " +
                "Suatu hari, saat berjalan di hutan, ia bertemu seorang pangeran tampan bernama Phillip, dan mereka saling jatuh cinta.\n\n" +

                "Tanpa mengetahui bahwa ia adalah seorang putri yang sudah dijodohkan sejak lahir dengan Pangeran Phillip, " +
                "Aurora kembali ke rumah peri. Namun, Maleficent berhasil menemukan Aurora dan membuatnya tertusuk jarum pintal, " +
                "sehingga ia tertidur sesuai kutukan yang telah diberikan.\n\n" +

                "Ketiga peri pun membawa Pangeran Phillip ke istana, tetapi Maleficent menculiknya dan menahannya di kastilnya. " +
                "Dengan bantuan para peri, Phillip berhasil melarikan diri, bertarung dengan Maleficent yang berubah menjadi naga, dan mengalahkannya.\n\n" +

                "Akhirnya, Phillip mencapai menara tempat Aurora tertidur dan menciumnya dengan cinta sejati. " +
                "Aurora pun terbangun dari tidurnya, dan mereka hidup bahagia selamanya sebagai pangeran dan putri dari kerajaan mereka.";

        // Set teks ke TextView
        textViewCerita.setText(cerita);
    }
}
