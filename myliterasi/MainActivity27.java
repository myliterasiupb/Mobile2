package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        String cerita = "Pada zaman dahulu, hiduplah seorang janda tua bersama putrinya yang baik hati dan rajin bernama Bawang Putih. "
                + "Suami sang janda telah lama meninggal, sehingga Bawang Putih tumbuh sebagai anak yang mandiri dan penuh kasih. "
                + "Mereka hidup sederhana dan damai di sebuah desa kecil.\n\n"
                + "Beberapa tahun kemudian, sang janda menikah kembali dengan seorang perempuan yang juga seorang janda dan memiliki seorang anak perempuan bernama Bawang Merah. "
                + "Berbeda dengan Bawang Putih, Bawang Merah adalah gadis yang pemalas, sombong, dan manja. "
                + "Setelah pernikahan itu, kehidupan Bawang Putih berubah drastis. "
                + "Ibu tirinya sangat pilih kasih dan memperlakukan Bawang Putih seperti pembantu. "
                + "Setiap hari, Bawang Putih harus mengerjakan seluruh pekerjaan rumah: mencuci, memasak, menyapu, dan mengambil air ke sungai. "
                + "Sementara Bawang Merah hanya duduk bermalas-malasan dan dimanjakan ibunya.\n\n"
                + "Meski diperlakukan tidak adil, Bawang Putih tetap tabah, sabar, dan tidak pernah mengeluh. "
                + "Suatu hari, Bawang Putih diminta ibunya mencuci baju di sungai. "
                + "Tanpa sengaja, salah satu pakaian ibunya hanyut terbawa arus. "
                + "Bawang Putih pun berjalan menyusuri sungai untuk mencari pakaian tersebut. "
                + "Di tengah perjalanan, ia bertemu dengan seorang nenek tua yang tinggal di sebuah gubuk. "
                + "Nenek itu bersedia membantu mencari pakaian yang hanyut dengan syarat Bawang Putih harus membantunya lebih dulu. "
                + "Dengan tulus dan ikhlas, Bawang Putih membantu sang nenek membersihkan rumah, memasak, dan menemani nenek berbincang.\n\n"
                + "Setelah selesai, sang nenek memberikan dua buah labu sebagai hadiah dan mempersilakan Bawang Putih memilih salah satu. "
                + "Bawang Putih memilih labu yang lebih kecil karena merasa cukup dan tidak ingin rakus. "
                + "Ia lalu pulang ke rumah dengan membawa labu itu. "
                + "Sesampainya di rumah, ibunya dan Bawang Merah penasaran dan membelah labu tersebut. "
                + "Betapa terkejutnya mereka, karena di dalam labu kecil itu berisi emas, permata, dan benda-benda berharga lainnya.\n\n"
                + "Melihat hal itu, ibu tiri dan Bawang Merah menjadi iri dan berniat mendapatkan hal yang sama. "
                + "Keesokan harinya, mereka mengikuti jejak Bawang Putih ke rumah nenek tua itu. "
                + "Namun berbeda dengan Bawang Putih, mereka bersikap kasar dan tidak tulus dalam membantu. "
                + "Sang nenek tetap memberikan labu dan membiarkan mereka memilih. "
                + "Karena serakah, mereka memilih labu yang paling besar. "
                + "Namun, saat labu itu dibelah, bukan emas yang keluar, melainkan ular, kalajengking, dan binatang berbisa lainnya. "
                + "Ibu tiri dan Bawang Merah sangat ketakutan dan menyesal.\n\n"
                + "Setelah kejadian itu, mereka sadar akan kesalahan mereka dan meminta maaf kepada Bawang Putih. "
                + "Dengan hati yang mulia, Bawang Putih memaafkan mereka. "
                + "Sejak saat itu, mereka hidup rukun dan harmonis, serta tidak membeda-bedakan satu sama lain.\n\n";


        String pesanMoral = "Pesan Moral:\n"
                + "- Kebaikan, kesabaran, dan ketulusan hati akan selalu membawa kebahagiaan dan berkah.\n"
                + "- Keserakahan dan kejahatan akan membawa celaka bagi diri sendiri.\n"
                + "- Jangan mudah iri dengan keberhasilan orang lain, karena kita tidak tahu perjuangan di baliknya.\n"
                + "- Memaafkan dan membuka hati adalah kunci untuk hidup damai dan bahagia.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
