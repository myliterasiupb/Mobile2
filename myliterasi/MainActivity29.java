package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity29 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        String cerita = "Nabi Ibrahim A.S adalah salah satu nabi besar yang sangat dihormati dalam Islam. "
                + "Beliau dikenal sebagai Bapak Para Nabi karena dari keturunannya lahir nabi-nabi besar seperti Nabi Ishaq, Nabi Yaqub, dan Nabi Muhammad SAW. "
                + "Nabi Ibrahim A.S lahir di daerah Ur, Babilonia (sekarang wilayah Irak), di tengah masyarakat yang menyembah berhala.\n\n"
                + "Masa Kecil dan Keteguhan Iman\n"
                + "Sejak kecil, Nabi Ibrahim A.S sudah mempertanyakan kebiasaan menyembah patung dan benda-benda langit. "
                + "Ia menyadari bahwa berhala tidak bisa menciptakan, mendengar, atau menolong manusia. "
                + "Dengan akalnya yang cerdas, ia mulai berdakwah kepada ayahnya, Azar, dan kaumnya agar menyembah Allah SWT, Tuhan yang Maha Esa.\n\n"
                + "Penghancuran Berhala dan Hukuman Raja Namrud\n"
                + "Suatu hari, ketika semua orang pergi merayakan pesta, Nabi Ibrahim menghancurkan semua berhala di kuil kecuali satu berhala terbesar. "
                + "Ia meletakkan kapak di tangan berhala itu untuk menunjukkan bahwa berhala tidak punya kuasa. "
                + "Ketika ditanya, ia menjawab bahwa mungkin berhala besar itu yang melakukannya. "
                + "Kaumnya marah dan membawa Nabi Ibrahim ke hadapan Raja Namrud. "
                + "Raja memerintahkan agar Nabi Ibrahim dibakar hidup-hidup. "
                + "Namun, Allah menyelamatkannya dengan memerintahkan api agar menjadi dingin dan tidak membakar beliau.\n\n"
                + "Hijrah dan Pembangunan Ka'bah\n"
                + "Setelah banyak tantangan, Nabi Ibrahim A.S hijrah ke negeri Syam, Palestina, Mesir, dan akhirnya ke Mekkah. "
                + "Di Mekkah, bersama putranya Nabi Ismail A.S, beliau membangun Ka'bah sebagai tempat ibadah kepada Allah. "
                + "Ka'bah hingga kini menjadi kiblat umat Islam di seluruh dunia.\n\n"
                + "Perintah Menyembelih Nabi Ismail A.S\n"
                + "Salah satu ujian terberat adalah ketika Allah memerintahkan Nabi Ibrahim A.S untuk menyembelih anaknya sendiri, Nabi Ismail A.S. "
                + "Dengan penuh keikhlasan, ia dan putranya sama-sama taat kepada Allah. "
                + "Namun, sebelum penyembelihan terjadi, Allah mengganti Nabi Ismail dengan seekor domba sebagai bentuk ujian yang telah mereka lewati dengan sabar dan ikhlas.\n\n"
                + "Wafatnya Nabi Ibrahim A.S\n"
                + "Nabi Ibrahim A.S wafat pada usia lanjut dan dimakamkan di Hebron, Palestina. "
                + "Namanya diabadikan dalam doa-doa umat Islam dan menjadi contoh ketaatan, pengorbanan, dan tauhid sejati.\n\n";

        String pesanMoral = "Pesan Moral:\n"
                + "- Keteguhan dalam mempertahankan iman sangat penting, meskipun menghadapi risiko besar.\n"
                + "- Pengorbanan yang tulus akan selalu mendapatkan balasan dari Allah SWT.";
        
        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
