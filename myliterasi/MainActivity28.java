package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main28);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        String cerita = "Pada zaman dahulu, hiduplah seorang janda tua bernama Mbok Sirni di sebuah desa dekat hutan. "
                + "Ia hidup sebatang kara dan sangat mendambakan seorang anak, namun usianya yang sudah tua membuatnya pesimis. "
                + "Suatu hari, saat sedang berdoa di ladang, tiba-tiba muncul seorang raksasa yang menawarkan bantuan.\n\n"
                + "Raksasa itu berkata bahwa ia bisa memberikan seorang anak untuk Mbok Sirni, tetapi dengan syarat, "
                + "anak itu harus diserahkan kepadanya saat telah berusia 17 tahun. "
                + "Karena sangat ingin memiliki anak, Mbok Sirni menyetujui syarat tersebut. "
                + "Kemudian, raksasa itu memberikan biji timun dan meminta Mbok Sirni menanamnya.\n\n"
                + "Beberapa hari kemudian, tumbuhlah sebuah timun yang besar dan emas. "
                + "Saat dibelah, di dalamnya terdapat seorang bayi perempuan yang cantik. "
                + "Mbok Sirni sangat bahagia dan menamai anak itu Timun Mas. "
                + "Timun Mas tumbuh menjadi gadis yang cantik, baik hati, dan rajin. "
                + "Ia sangat menyayangi Mbok Sirni, begitu pula sebaliknya.\n\n"
                + "Namun, hari demi hari berlalu, hingga usia Timun Mas menginjak 17 tahun. "
                + "Raksasa itu pun datang menagih janjinya. "
                + "Mbok Sirni sangat takut kehilangan Timun Mas, lalu memohon pada raksasa untuk menunda waktu. "
                + "Raksasa itu setuju memberi waktu beberapa hari lagi.\n\n"
                + "Dengan cemas, Mbok Sirni meminta bantuan seorang pertapa di gunung. "
                + "Sang pertapa memberinya empat bungkusan kecil berisi biji mentimun, jarum, garam, dan terasi. "
                + "Bungkusan itu harus digunakan Timun Mas untuk melawan raksasa bila ia datang mengejarnya.\n\n"
                + "Beberapa hari kemudian, raksasa datang kembali. "
                + "Timun Mas segera melarikan diri ke hutan sambil membawa bungkusan pemberian pertapa. "
                + "Saat raksasa mengejarnya, Timun Mas melempar biji mentimun. "
                + "Sekejap, hutan mentimun yang lebat dan berduri tumbuh dan menghalangi raksasa.\n\n"
                + "Namun raksasa berhasil melewati halangan itu, dan Timun Mas melempar jarum. "
                + "Tumbuhlah hutan bambu yang rimbun dan tajam. "
                + "Raksasa terluka, namun tetap mengejar. "
                + "Timun Mas lalu melempar garam, sehingga terbentuk lautan luas. "
                + "Raksasa hampir tenggelam, namun masih berhasil melewatinya.\n\n"
                + "Terakhir, Timun Mas melempar terasi. "
                + "Seketika muncul lahar panas yang mendidih. "
                + "Raksasa akhirnya tenggelam dan musnah di dalam lahar tersebut. "
                + "Timun Mas pun selamat dan kembali ke pelukan Mbok Sirni. "
                + "Mereka hidup bahagia bersama selamanya.\n\n";

        String pesanMoral = "Pesan Moral:\n"
                + "- Setiap masalah pasti ada jalan keluarnya jika kita tetap berusaha dan tidak menyerah.\n"
                + "- Keberanian dan kecerdikan bisa mengalahkan kekuatan yang besar sekalipun.\n"
                + "- Janji harus ditepati, tapi jangan ragu untuk berjuang demi orang yang kita cintai.\n"
                + "- Bersikap baik dan menghormati orang tua akan membawa kebahagiaan dan keselamatan.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
