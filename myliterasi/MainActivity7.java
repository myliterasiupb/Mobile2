package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        // Teks cerita Nabi Idris A.S yang baru
        String cerita = "Nabi Idris A.S adalah seorang nabi yang sangat terkenal dalam sejarah Islam. "
                + "Ia dikenal sebagai nabi yang sangat bijaksana dan memiliki banyak pengetahuan. Ada banyak kisah "
                + "yang mengisahkan keutamaan dan kehidupan Nabi Idris A.S, yang dipercaya sebagai nabi kedua setelah Nabi Adam A.S.\n\n"
                + "Nabi Idris A.S lahir di kota Babil, yang terletak di Mesopotamia (sekarang bagian dari Irak). Nama asli Nabi Idris adalah Enoch dalam tradisi Yahudi dan Kristen. "
                + "Idris A.S adalah keturunan ke-6 dari Nabi Adam A.S, dan ia berasal dari keluarga yang sangat taat kepada Allah SWT. "
                + "Dalam Al-Qur'an, Nabi Idris A.S disebut sebagai seorang nabi yang diberikan kebijaksanaan dan pengetahuan yang luar biasa.\n\n"
                + "Keutamaan Nabi Idris A.S\n"
                + "Nabi Idris A.S dikenal sebagai nabi yang pertama kali diberikan wahyu setelah Nabi Adam A.S. "
                + "Dia juga dikaruniai kemampuan untuk menulis, sehingga dia dikatakan sebagai orang yang pertama kali menulis dengan pena. "
                + "Dalam tradisi Islam, Nabi Idris A.S dianggap sebagai orang yang pertama kali mengenal ilmu-ilmu kedokteran, matematika, astronomi, dan berbagai macam pengetahuan yang sangat bermanfaat untuk umat manusia.\n\n"
                + "Penyebaran Dakwah Nabi Idris A.S\n"
                + "Nabi Idris A.S diutus untuk menyeru umatnya agar menyembah Allah SWT dan menjauhi penyembahan berhala. "
                + "Beliau sangat tegas dalam menegakkan tauhid dan melawan penyembahan berhala yang banyak dilakukan oleh masyarakat pada waktu itu.\n\n"
                + "Kisah Perjalanan Nabi Idris A.S ke Langit\n"
                + "Salah satu kisah yang sangat terkenal dari Nabi Idris A.S adalah perjalanan beliau ke langit. "
                + "Dalam sebuah hadis yang diriwayatkan oleh Imam al-Bukhari, disebutkan bahwa Nabi Idris A.S pernah diangkat ke langit oleh Allah SWT. "
                + "Nabi Idris A.S juga diyakini menjadi salah satu dari empat nabi yang tidak merasakan kematian secara normal, yaitu Nabi Idris, Nabi Isa A.S, Nabi Khidr, dan Nabi Muhammad SAW.\n\n"
                + "Kematian Nabi Idris A.S\n"
                + "Al-Qur'an tidak secara rinci menyebutkan bagaimana Nabi Idris A.S meninggal. Namun, dalam beberapa riwayat, dikatakan bahwa Nabi Idris A.S diangkat ke langit tanpa merasakan kematian biasa. "
                + "Ia diangkat oleh Allah SWT ke langit sebagai penghargaan atas kesetiaan dan perjuangannya dalam berdakwah.\n\n"
                + "Nabi Adam hidup selama sekitar 960 tahun. Ia menyaksikan anak-cucunya berkembang biak dan menyebar ke berbagai penjuru bumi. Ketika ajalnya tiba, Allah memerintahkan malaikat untuk mencabut ruhnya. Ia wafat dengan tenang sebagai hamba Allah yang taat.\n\n"
                + "Nabi Adam A.S dimakamkan di bumi, dan kisahnya menjadi pelajaran besar bagi seluruh umat manusia. Ia adalah bapak seluruh manusia dan contoh bagi kita dalam hal ketaatan, kesabaran, dan taubat.";

        // Teks pesan moral
        String pesanMoral = "Pesan Moral:\n"
                + "Pentingnya Ilmu Pengetahuan: Nabi Idris A.S dikenal sebagai nabi yang sangat berilmu."
                + "Ketaatan kepada Allah adalah kunci untuk meraih kedamaian dan kebahagiaan sejati.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
