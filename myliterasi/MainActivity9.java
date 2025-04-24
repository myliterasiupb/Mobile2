package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        String cerita = "Nabi Hud A.S adalah salah satu nabi yang diutus oleh Allah kepada kaum 'Aad, sebuah kaum yang tinggal di daerah Al-Ahqaf (sekarang wilayah antara Yaman dan Oman). "
                + "Kaum 'Aad dikenal sebagai kaum yang sangat kuat, memiliki tubuh tinggi besar, dan mampu membangun bangunan megah. Namun mereka sombong dan durhaka, serta menyembah berhala.\n\n"
                + "Kehidupan dan Dakwah Nabi Hud A.S\n"
                + "Nabi Hud A.S berasal dari kaum 'Aad sendiri dan dikenal sebagai orang yang jujur serta bijaksana. Ia diutus oleh Allah SWT untuk mengajak kaumnya menyembah Allah dan meninggalkan berhala. "
                + "Namun, kaum 'Aad menolak dakwah Nabi Hud, mereka justru mengejek dan mencemoohnya. Mereka merasa tidak butuh petunjuk karena merasa sudah kuat dan makmur.\n\n"
                + "Peringatan dan Azab untuk Kaum 'Aad\n"
                + "Nabi Hud A.S dengan sabar terus memperingatkan kaumnya agar bertaubat dan kembali kepada Allah. Namun mereka tetap membangkang dan semakin sombong. "
                + "Akhirnya, Allah SWT menurunkan azab berupa angin topan yang sangat dingin dan kencang selama tujuh malam delapan hari. Angin tersebut menghancurkan kaum 'Aad hingga mereka binasa. "
                + "Hanya Nabi Hud A.S dan para pengikutnya yang beriman yang diselamatkan oleh Allah SWT.\n\n"
                + "Kisah Nabi Hud A.S menjadi pelajaran besar bagi umat manusia, bahwa kesombongan dan kedurhakaan kepada Allah hanya akan membawa kehancuran.\n\n";

        String pesanMoral = "Pesan Moral:\n"
                + "- Jangan bersikap sombong dan merasa paling kuat, karena semua kekuatan berasal dari Allah.\n"
                + "- Kesabaran dalam berdakwah adalah salah satu sifat terpuji yang harus diteladani dari Nabi Hud A.S.";


        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
