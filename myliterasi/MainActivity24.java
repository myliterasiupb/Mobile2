package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        String cerita = "Dahulu kala, di sebuah desa di Sumatera Utara, hiduplah seorang petani bernama Toba."
                + "Ia hidup sendiri dan sehari-hari bekerja menggarap ladang serta memancing ikan di sungai untuk memenuhi kebutuhannya. "
                + "Suatu hari, saat memancing, Toba berhasil menangkap seekor ikan mas yang besar dan berkilauan. "
                + "Ketika hendak memasaknya, ikan tersebut berubah menjadi seorang wanita cantik. "
                + "Wanita itu mengaku berasal dari kerajaan bawah laut dan bersedia menjadi istri Toba dengan syarat Toba tidak boleh mengungkapkan asal-usulnya kepada siapa pun. "
                + "Toba setuju, dan mereka pun menikah.\n\n"
                + "Beberapa tahun kemudian, mereka dikaruniai seorang anak laki-laki yang diberi nama Samosir. "
                + "Samosir tumbuh menjadi anak yang aktif dan sering membantu ayahnya mengantarkan makanan ke ladang. "
                + "Suatu hari, ibunya meminta Samosir mengantarkan makanan ke ladang untuk Toba. "
                + "Namun, di tengah perjalanan, Samosir merasa lapar dan memakan sebagian besar makanan tersebut. "
                + "Ketika Toba mengetahui hal ini, ia marah besar dan tanpa sadar berkata, 'Dasar anak ikan!' "
                + "Mendengar itu, Samosir menangis dan berlari pulang untuk menanyakan kebenaran kepada ibunya.\n\n"
                + "Sang ibu sangat sedih karena Toba telah melanggar janjinya dengan mengungkapkan asal-usulnya. "
                + "Ia kemudian menyuruh Samosir pergi ke bukit tertinggi di desa. "
                + "Setelah Samosir pergi, sang ibu kembali ke wujud aslinya sebagai ikan dan menghilang di sungai. "
                + "Tak lama kemudian, hujan deras turun tanpa henti, menyebabkan desa tersebut terendam air dan membentuk sebuah danau besar yang kini dikenal sebagai Danau Toba. "
                + "Pulau di tengah danau tersebut dinamai Pulau Samosir, sesuai dengan nama anak mereka.\n\n";

        String pesanMoral = "Pesan Moral:\n"
                + "- Menepati janji adalah hal yang sangat penting; melanggarnya dapat membawa konsekuensi buruk.\n"
                + "- Mengendalikan emosi dan tidak mengucapkan kata-kata kasar, terutama kepada anak-anak, sangatlah penting.\n"
                + "- Kejujuran dan tanggung jawab harus diajarkan sejak dini kepada anak-anak.\n"
                + "- Komunikasi yang baik dalam keluarga dapat mencegah kesalahpahaman dan konflik.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
