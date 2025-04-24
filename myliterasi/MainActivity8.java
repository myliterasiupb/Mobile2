package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        // Teks cerita Nabi Nuh A.S yang baru
        String cerita = "Nabi Nuh A.S adalah salah satu nabi yang diutus oleh Allah untuk memberi petunjuk dan mengajak umat manusia kembali kepada jalan yang benar. "
                + "Ia diutus pada masa umat manusia sudah jauh menyimpang dari ajaran Allah, banyak yang menyembah berhala, dan hidup dalam kedurhakaan.\n\n"
                + "Kelahiran dan Keluarga Nabi Nuh A.S\n"
                + "Nabi Nuh A.S berasal dari keturunan yang saleh, ia adalah anak dari Lamik dan cucu dari Metusyalikh. Nabi Nuh hidup di zaman yang sangat lama, diperkirakan ia hidup lebih dari 950 tahun. "
                + "Ia memiliki tiga anak laki-laki: Sam, Ham, dan Yafits. Nabi Nuh A.S dikenal sebagai seorang yang sangat sabar dan taat kepada Allah SWT.\n\n"
                + "Dakwah Nabi Nuh A.S\n"
                + "Nabi Nuh A.S diutus untuk menyeru umatnya agar meninggalkan penyembahan berhala dan kembali menyembah Allah yang Maha Esa. "
                + "Ia mendakwahkan agama Allah selama bertahun-tahun, namun hanya sedikit yang mengikuti ajarannya. Umat manusia pada waktu itu sangat keras kepala, mereka mengejek Nuh dan menuduhnya sebagai orang gila. "
                + "Namun, Nabi Nuh A.S tetap sabar dan tidak berhenti berdakwah, meskipun hanya segelintir orang yang mengikuti.\n\n"
                + "Perintah Membangun Kapal\n"
                + "Setelah bertahun-tahun berdakwah, Allah SWT memerintahkan Nabi Nuh untuk membangun sebuah kapal besar. Allah memberitahukan bahwa umat manusia yang ingkar akan mendapat azab berupa banjir besar yang akan menenggelamkan seluruh umat yang tidak beriman. "
                + "Nabi Nuh A.S mengikuti perintah tersebut dan membangun kapal di atas bukit, meskipun umatnya mengejek dan mencemooh dia.\n\n"
                + "Banjir Besar dan Azab Allah\n"
                + "Ketika kapal selesai dibangun, Allah memerintahkan agar Nuh membawa masuk ke dalam kapal semua orang yang beriman dan sepasang hewan dari setiap jenis. Setelah itu, hujan turun deras dan air mulai meluap, "
                + "hingga akhirnya seluruh bumi terendam oleh banjir besar yang menenggelamkan umat manusia yang kafir. Di antara mereka, termasuklah anak Nabi Nuh, yang tetap menolak ajaran ayahnya. Nabi Nuh A.S sangat sedih karena anaknya tidak mau percaya dan mengikuti ajarannya.\n\n"
                + "Setelah banjir surut, kapal Nabi Nuh mendarat di sebuah gunung yang disebut Jabal Judi. Hanya yang beriman yang selamat, sedangkan umat yang kafir dan anak Nabi Nuh yang menolak tetap tenggelam.\n\n";

        // Teks pesan moral
        String pesanMoral = "Pesan Moral:\n"
                + "- Sabar dalam menghadapi cobaan dan ujian dalam dakwah.\n"
                + "- Ketaatan kepada Allah akan mendatangkan keselamatan dan kebahagiaan sejati.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
