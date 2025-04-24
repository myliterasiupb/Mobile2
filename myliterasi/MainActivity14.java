package com.example.myliterasi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        // Ambil referensi TextView dan ImageView
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        ImageView imageViewCinderella = findViewById(R.id.imageViewCinderella);

        // Set gambar dari drawable
        try {
            imageViewCinderella.setImageResource(R.drawable.princescinderella);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Teks cerita Cinderella
        String cerita = "Dahulu kala, hiduplah seorang gadis baik hati bernama Cinderella. " +
                "Ia tinggal bersama ibu tiri dan dua saudara tirinya yang jahat. " +
                "Sejak ayahnya meninggal, Cinderella diperlakukan seperti pembantu, " +
                "harus melakukan semua pekerjaan rumah dan diperlakukan dengan kasar.\n\n" +

                "Suatu hari, kerajaan mengadakan pesta dansa besar untuk mencari istri bagi sang pangeran. " +
                "Setiap gadis diundang, termasuk Cinderella. Namun, ibu tirinya melarangnya pergi dan merusak gaun yang ingin dipakainya.\n\n" +

                "Saat Cinderella menangis karena kesedihannya, peri baik hati muncul dan membantunya. " +
                "Dengan sihirnya, peri mengubah pakaian Cinderella menjadi gaun indah berkilauan " +
                "dan memberinya sepatu kaca. Ia juga mengubah labu menjadi kereta kencana dan tikus-tikus menjadi kuda. " +
                "Namun, sihir itu hanya akan bertahan hingga tengah malam.\n\n" +

                "Di pesta, semua orang terpesona oleh kecantikan Cinderella, termasuk sang pangeran. " +
                "Mereka berdansa sepanjang malam dan jatuh cinta. Namun, ketika jam berdentang tengah malam, " +
                "Cinderella harus segera pergi sebelum sihirnya hilang. Dalam terburu-buru, ia kehilangan satu sepatu kacanya.\n\n" +

                "Keesokan harinya, pangeran mencari pemilik sepatu kaca itu. " +
                "Setiap gadis di kerajaan mencoba memakainya, tetapi tidak ada yang cocok. " +
                "Ketika Cinderella mencoba, sepatu itu pas sempurna. Pangeran akhirnya menemukan cinta sejatinya.\n\n" +

                "Cinderella dan pangeran pun menikah dan hidup bahagia selamanya. " +
                "Cinderella yang dulu diperlakukan tidak adil akhirnya mendapatkan kehidupan yang bahagia " +
                "karena kebaikan hatinya dan keberaniannya untuk tetap berharap.";

        // Set teks ke TextView
        textViewCerita.setText(cerita);
    }
}
