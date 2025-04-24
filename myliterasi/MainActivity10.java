package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        String cerita = "Nabi Shaleh A.S adalah salah satu nabi yang diutus oleh Allah kepada kaum Tsamud. "
                + "Kaum Tsamud tinggal di daerah antara Madinah dan Syam, dan dikenal sebagai bangsa yang pandai memahat gunung serta membangun rumah yang kokoh. "
                + "Mereka diberi kekuatan dan kenikmatan yang besar, namun tidak bersyukur kepada Allah dan malah menyembah berhala.\n\n"
                + "Dakwah Nabi Shaleh A.S\n"
                + "Nabi Shaleh A.S menyeru kaumnya untuk menyembah Allah dan meninggalkan berhala. "
                + "Ia mengingatkan mereka agar bersyukur dan tidak sombong atas kekuatan yang mereka miliki. "
                + "Namun, kaum Tsamud menolak dakwah beliau dan malah mengejek serta menuduhnya sebagai pendusta.\n\n"
                + "Mukjizat Unta Betina\n"
                + "Sebagai bukti kenabiannya, Allah memberikan mukjizat berupa seekor unta betina yang keluar dari batu besar. "
                + "Nabi Shaleh memperingatkan kaumnya agar tidak mengganggu unta itu dan membiarkannya makan dan minum dengan bebas. "
                + "Namun, kaum Tsamud justru membunuh unta tersebut dan menantang azab Allah.\n\n"
                + "Azab untuk Kaum Tsamud\n"
                + "Nabi Shaleh A.S memperingatkan bahwa mereka akan mendapat azab dalam tiga hari. "
                + "Setelah itu, Allah menurunkan suara petir yang menggelegar dan gempa bumi yang dahsyat, menghancurkan kaum Tsamud. "
                + "Hanya Nabi Shaleh A.S dan para pengikutnya yang beriman yang diselamatkan.\n\n"
                + "Kisah Nabi Shaleh A.S adalah pelajaran penting tentang akibat kesombongan dan penolakan terhadap perintah Allah.\n\n";

        String pesanMoral = "Pesan Moral:\n"
                + "- Jangan menyakiti makhluk Allah, bahkan hewan pun harus dihormati.\n"
                + "- Taatilah petunjuk Allah dan jangan menolak kebenaran.\n"
                + "- Kesabaran dan keteguhan dalam menyampaikan kebenaran adalah teladan dari Nabi Shaleh A.S.";


        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
