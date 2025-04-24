package com.example.myliterasi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        // Ambil referensi TextView dan ImageView
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        ImageView imageViewJasmine = findViewById(R.id.imageViewJasmine);

        // Set gambar dari drawable
        try {
            imageViewJasmine.setImageResource(R.drawable.princesjasmine);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Teks cerita Princess Jasmine
        String cerita = "Di kota Agrabah, hiduplah seorang putri bernama Jasmine. " +
                "Ia adalah putri Sultan yang cerdas dan mandiri, tetapi merasa terkungkung dalam istana. " +
                "Jasmine ingin bebas menentukan hidupnya sendiri dan tidak ingin menikah hanya karena aturan kerajaan.\n\n" +

                "Suatu hari, Jasmine menyamar sebagai rakyat biasa dan pergi ke pasar. " +
                "Di sana, ia bertemu dengan seorang pemuda miskin bernama Aladdin. " +
                "Aladdin baik hati dan menolong Jasmine saat ia dalam kesulitan. Mereka pun mulai saling menyukai.\n\n" +

                "Namun, penasihat jahat Sultan, Jafar, ingin mendapatkan kekuatan tak terbatas. " +
                "Ia mencari lampu ajaib yang berada di dalam Gua Keajaiban. " +
                "Dengan tipu muslihat, Jafar memanfaatkan Aladdin untuk mengambil lampu tersebut. " +
                "Tanpa sengaja, Aladdin menggosok lampu dan membebaskan jin yang dapat mengabulkan tiga permintaan.\n\n" +

                "Aladdin meminta untuk menjadi seorang pangeran agar bisa bertemu kembali dengan Jasmine. " +
                "Ia datang ke istana sebagai Pangeran Ali yang kaya raya. " +
                "Namun, Jasmine tidak tertarik pada kekayaan, ia lebih menyukai hati yang tulus.\n\n" +

                "Ketika Jafar mengetahui identitas asli Aladdin, ia mencuri lampu ajaib dan menjadi penguasa dengan bantuan jin. " +
                "Jafar menangkap Jasmine dan Sultan, serta menguasai Agrabah dengan kejahatannya.\n\n" +

                "Dengan kecerdikannya, Aladdin berhasil mengalahkan Jafar dengan membuatnya terjebak dalam lampu ajaib. " +
                "Jin kemudian membuang lampu itu jauh agar Jafar tidak kembali.\n\n" +

                "Setelah semuanya kembali normal, Sultan menyadari bahwa Jasmine harus menikahi seseorang yang ia cintai. " +
                "Akhirnya, Jasmine dan Aladdin menikah dan memimpin Agrabah dengan keadilan dan kebijaksanaan.\n\n" +

                "Jasmine membuktikan bahwa wanita bisa memilih jalan hidupnya sendiri, " +
                "dan cinta sejati datang dari hati, bukan dari status atau kekayaan.";

        // Set teks ke TextView
        textViewCerita.setText(cerita);
    }
}
