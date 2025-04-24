package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        String cerita = "Dahulu kala, di tanah Pasundan (sekarang Jawa Barat), hiduplah seorang putri cantik bernama Dayang Sumbi. "
                + "Ia adalah putri raja yang sangat pandai menenun kain. Suatu hari, saat sedang menenun, alat tenunnya jatuh. "
                + "Karena malas mengambilnya sendiri, Dayang Sumbi bersumpah bahwa siapa pun yang mengambilkan alat itu untuknya, "
                + "jika perempuan akan dijadikan saudara, jika laki-laki akan dijadikan suami.\n\n"
                + "Ternyata yang mengambil alat itu adalah seekor anjing jantan bernama Tumang. "
                + "Tumang bukan anjing biasa, ia adalah jelmaan dewa dan juga titisan dewa langit. "
                + "Karena sumpahnya sendiri, Dayang Sumbi akhirnya menikahi Tumang. Dari pernikahan itu, "
                + "mereka dikaruniai seorang anak laki-laki yang diberi nama Sangkuriang. "
                + "Sangkuriang tumbuh menjadi anak yang cerdas dan kuat. Namun, ia tidak tahu bahwa Tumang, "
                + "anjing peliharaan ibunya, adalah ayah kandungnya sendiri.\n\n"
                + "Suatu hari, Dayang Sumbi menyuruh Sangkuriang pergi berburu ke hutan untuk mencari daging rusa. "
                + "Namun, di hutan Sangkuriang gagal mendapatkan rusa. Karena takut pulang tanpa hasil, "
                + "ia malah membunuh Tumang, dan membawa pulangnya sebagai hasil buruan. "
                + "Dayang Sumbi sangat marah dan sedih saat tahu daging yang dibawa Sangkuriang adalah daging Tumang. "
                + "Dalam kemarahannya, ia memukul kepala Sangkuriang hingga berdarah. Sangkuriang pun kabur dari rumah dan mengembara.\n\n"
                + "Bertahun-tahun kemudian, Sangkuriang tumbuh menjadi pemuda tampan. "
                + "Dalam pengembaraannya, ia kembali ke tanah asalnya dan bertemu dengan Dayang Sumbi yang tetap muda karena anugerah dewa. "
                + "Mereka tidak saling mengenali, dan Sangkuriang jatuh cinta kepada ibunya sendiri. "
                + "Dayang Sumbi hampir menerima lamaran itu, hingga ia menyadari bekas luka di kepala Sangkuriang.\n\n"
                + "Untuk menggagalkan pernikahan, Dayang Sumbi memberi syarat mustahil: "
                + "Sangkuriang harus membuat danau besar serta perahu raksasa dalam satu malam. "
                + "Dengan bantuan makhluk halus, ia hampir berhasil. Namun Dayang Sumbi menggagalkannya dengan trik: "
                + "ia membentangkan kain sutra merah di langit hingga tampak seperti fajar. "
                + "Sangkuriang yang tertipu pun marah dan menendang perahu ke gunung hingga terbalik. "
                + "Gunung itu kini dikenal sebagai Gunung Tangkuban Perahu.\n\n";

        String pesanMoral = "Pesan Moral:\n"
                + "- Hormatilah orang tua dan jangan melawan nasihat mereka.\n"
                + "- Jangan bertindak tergesa-gesa atau ceroboh dalam menghadapi masalah.\n"
                + "- Setiap kesalahan memiliki akibat. Belajarlah bertanggung jawab atas tindakan sendiri.\n"
                + "- Sumpah dan janji harus dipikirkan dengan hati-hati sebelum diucapkan.";


        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
