package com.example.myliterasi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17); // Pastikan layout ada di res/layout

        // Ambil referensi TextView dan ImageView
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);
        ImageView imageViewKuraKelinci = findViewById(R.id.imageViewKuraKelinci);

        // Set gambar dari drawable
        imageViewKuraKelinci.setImageResource(R.drawable.kura_kelinci); // Pastikan gambar ada di res/drawable

        // Isi cerita
        String cerita = "Di sebuah hutan yang lebat, hiduplah seekor kelinci yang lincah dan baik hati. "
                + "Berbeda dengan kebanyakan kelinci lainnya, ia tidak sombong atau suka membanggakan kecepatannya. "
                + "Ia selalu membantu teman-temannya dan peduli pada semua penghuni hutan.\n\n"
                + "Di sisi lain, ada seekor kura-kura yang berjalan lambat. Meskipun begitu, ia rajin bekerja dan tidak pernah mengeluh. "
                + "Namun, karena jalannya yang lambat, ia sering kesulitan membawa barang-barang berat ke rumahnya.\n\n"
                + "Suatu hari, kura-kura pergi ke kebun buah di tepi hutan untuk mengumpulkan makanan. "
                + "Ia sangat senang karena berhasil mengumpulkan banyak buah segar. Namun, saat hendak pulang, ia kesulitan membawa sekeranjang penuh buah itu karena terlalu berat.\n\n"
                + "Melihat kura-kura yang kelelahan, kelinci segera melompat mendekatinya.\n\n"
                + "\"Kura-kura, biar aku bantu membawakan buahmu,\" kata kelinci dengan senyum hangat.\n\n"
                + "Kura-kura menghela napas lega. \"Terima kasih, Kelinci. Aku memang lambat, tapi aku harus membawa semua ini ke rumahku. "
                + "Kalau tidak, aku tidak punya persediaan makanan untuk beberapa hari ke depan.\"\n\n"
                + "Tanpa ragu, kelinci mengambil keranjang buah itu dan melompat dengan lincah. Dalam waktu singkat, ia sudah sampai di rumah kura-kura. "
                + "Tak hanya itu, ia juga membantu menyusun buah-buah itu agar lebih rapi di tempat penyimpanan.\n\n"
                + "Kura-kura sangat bersyukur atas kebaikan kelinci. Ia kemudian menawarkan beberapa buah sebagai tanda terima kasih. "
                + "Namun, kelinci menolaknya dengan lembut.\n\n"
                + "\"Aku membantumu bukan untuk mendapatkan imbalan, Kura-kura. Aku hanya ingin membantu karena kita adalah teman,\" kata kelinci.\n\n"
                + "Sejak saat itu, kura-kura dan kelinci menjadi sahabat baik. Mereka sering berbagi makanan, bermain bersama, dan saling membantu. "
                + "Persahabatan mereka mengajarkan hewan-hewan lain di hutan bahwa kebaikan dan persahabatan jauh lebih penting daripada kecepatan atau kekuatan.";

        // Isi pesan moral
        String pesanMoral = "Pesan Moral:\nKebaikan hati lebih berharga daripada kecepatan atau kekuatan. "
                + "Membantu sesama tanpa mengharapkan balasan akan membuat dunia menjadi tempat yang lebih indah dan penuh kebahagiaan.";

        // Menampilkan teks di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
