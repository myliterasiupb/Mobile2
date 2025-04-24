package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        String cerita = "Dahulu kala, di sebuah desa di Kalimantan Selatan, hiduplah seorang pemuda tampan bernama Awang Sukma. "
                + "Ia dikenal sebagai seorang datu yang bijaksana dan memiliki keahlian dalam meniup suling bambu. "
                + "Suara sulingnya yang merdu sering mengalun di sekitar telaga yang tenang di tengah hutan.\n\n"
                + "Suatu hari, saat Awang Sukma memainkan sulingnya di dekat telaga, ia melihat tujuh gadis cantik sedang mandi dan bermain air. "
                + "Mereka adalah para bidadari dari kayangan yang turun ke bumi untuk menikmati keindahan telaga. "
                + "Selendang mereka, yang digunakan untuk terbang kembali ke kayangan, diletakkan di tepi telaga.\n\n"
                + "Tertarik pada kecantikan mereka, Awang Sukma diam-diam mengambil salah satu selendang, milik bidadari bungsu. "
                + "Ketika para bidadari hendak kembali ke kayangan, bidadari bungsu tidak menemukan selendangnya dan terpaksa tinggal di bumi. "
                + "Awang Sukma kemudian mendekatinya, menghiburnya, dan akhirnya mereka menikah.\n\n"
                + "Mereka hidup bahagia dan dikaruniai seorang putri bernama Kumalasari. "
                + "Namun, kebahagiaan mereka tidak berlangsung lama. "
                + "Suatu hari, seekor ayam hitam masuk ke lumbung padi mereka dan menyebabkan kekacauan. "
                + "Dalam kekacauan itu, selendang bidadari yang disembunyikan Awang Sukma ditemukan oleh istrinya. "
                + "Menyadari bahwa suaminya telah menipunya, sang bidadari merasa sedih dan kecewa.\n\n"
                + "Dengan berat hati, bidadari bungsu pamit kepada suaminya dan putrinya. "
                + "Ia terbang kembali ke kayangan, meninggalkan Awang Sukma dan Kumalasari. "
                + "Sejak saat itu, Awang Sukma melarang keturunannya untuk memelihara ayam hitam, "
                + "karena dianggap sebagai penyebab perpisahannya dengan sang istri. "
                + "Telaga tempat pertemuan mereka kemudian dikenal sebagai Telaga Bidadari.\n\n";

        String pesanMoral = "Pesan Moral:\n"
                + "- Jangan mengambil sesuatu yang bukan milik kita, karena tindakan tersebut dapat menyakiti orang lain.\n"
                + "- Kejujuran adalah dasar dari hubungan yang harmonis; kebohongan sekecil apapun dapat menghancurkan kepercayaan.\n"
                + "- Setiap tindakan memiliki konsekuensi; berpikirlah sebelum bertindak.\n"
                + "- Hargai dan peliharalah kepercayaan yang diberikan oleh orang lain.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
