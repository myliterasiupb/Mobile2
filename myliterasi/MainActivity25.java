package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        String cerita = "Dahulu kala, di sebuah desa nelayan di pesisir Sumatra Barat, hiduplah seorang janda bernama Mande Rubayah bersama putra semata wayangnya, Malin Kundang. "
                + "Mereka hidup dalam kesederhanaan. Malin tumbuh menjadi anak yang cerdas dan rajin membantu ibunya. "
                + "Suatu hari, Malin memutuskan untuk merantau demi memperbaiki nasib. "
                + "Meskipun berat hati, sang ibu merelakan kepergian anaknya dengan harapan Malin akan kembali sebagai anak yang sukses.\n\n"
                + "Bertahun-tahun berlalu, Mande Rubayah setia menanti kepulangan Malin. "
                + "Suatu hari, sebuah kapal megah berlabuh di pelabuhan desa. "
                + "Dari kapal itu turun seorang pria tampan berpakaian mewah bersama istrinya yang cantik. "
                + "Mande Rubayah mengenali pria itu sebagai Malin Kundang dan segera menghampirinya. "
                + "Namun, Malin yang kini kaya raya merasa malu mengakui ibunya yang berpakaian lusuh di hadapan istrinya. "
                + "Ia menghardik dan menolak mengakui Mande Rubayah sebagai ibunya.\n\n"
                + "Hati sang ibu hancur melihat perlakuan anaknya. "
                + "Dengan penuh kesedihan, ia berdoa kepada Tuhan agar Malin Kundang dihukum atas kedurhakaannya. "
                + "Tak lama setelah kapal Malin berlayar kembali, badai dahsyat menghantam kapal tersebut. "
                + "Petir menyambar dan menghancurkan kapal, serta mengubah Malin Kundang menjadi batu. "
                + "Batu tersebut masih dapat ditemukan di Pantai Air Manis, Padang, sebagai pengingat akan kisah anak durhaka.\n\n";

        String pesanMoral = "Pesan Moral:\n"
                + "- Hormatilah dan berbaktilah kepada orang tua, terutama ibu yang telah melahirkan dan membesarkan kita.\n"
                + "- Jangan pernah melupakan asal-usul dan orang-orang yang telah berjasa dalam hidup kita.\n"
                + "- Kesombongan dan pengingkaran terhadap orang tua dapat membawa kehancuran.\n"
                + "- Kekayaan dan status sosial tidak seharusnya membuat kita lupa diri dan durhaka.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
