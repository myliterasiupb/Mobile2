package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        // Menghubungkan TextView dan ImageView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);
        ImageView imageViewBeruangLebah = findViewById(R.id.imageViewBeruangLebah);

        // Set gambar dari drawable
        imageViewBeruangLebah.setImageResource(R.drawable.beruang_lebah);

        // Teks cerita "Beruang dan Lebah"
        String cerita = "Suatu hari, di dalam hutan yang lebat, seekor beruang besar sedang berjalan mencari makan. "
                + "Ia sangat lapar dan mencium aroma madu yang menggoda di udara.\n\n"
                + "Beruang itu mengikuti aroma tersebut dan menemukan sarang lebah di atas pohon. "
                + "Dengan rakus, ia mulai memanjat pohon dan mencakar sarang lebah untuk mengambil madu.\n\n"
                + "Namun, saat ia mencakar sarang lebah, lebah-lebah di dalamnya marah besar. "
                + "Mereka keluar beramai-ramai dan mulai menyerang beruang tersebut dengan sengatan mereka.\n\n"
                + "Beruang yang kesakitan pun lari terbirit-birit sambil berusaha mengusir lebah-lebah yang mengerumuninya. "
                + "Setelah berlari cukup jauh, akhirnya lebah-lebah berhenti mengejarnya.\n\n"
                + "Dengan tubuh yang penuh sengatan, beruang menyadari kesalahannya. "
                + "Ia terlalu serakah dan ingin mendapatkan madu dengan cara yang kasar tanpa berpikir akibatnya.\n\n";

        // Teks pesan moral
        String pesanMoral = "Pesan Moral:\nKeserakahan dapat membawa bencana. "
                + "Sebelum bertindak, kita harus berpikir tentang akibatnya dan menghormati hak makhluk lain.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
