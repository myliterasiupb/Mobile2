package com.example.myliterasi;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        // Menghubungkan TextView dengan ID di layout XML
        TextView textViewCerita = findViewById(R.id.textViewCerita);
        TextView textViewPesanMoral = findViewById(R.id.textViewPesanMoral);

        // Teks cerita Nabi Adam A.S yang baru
        String cerita = "Nabi Adam A.S adalah manusia pertama yang diciptakan oleh Allah SWT. Allah menciptakan Adam dari tanah liat yang dibentuk dengan sempurna. Setelah tubuhnya terbentuk, Allah meniupkan ruh ke dalamnya. Dengan ruh itu, Adam menjadi hidup dan diberikan akal serta ilmu pengetahuan.\n\n"
                + "Allah mengajarkan kepada Nabi Adam nama-nama benda dan makhluk yang ada di dunia. Pengetahuan ini menjadi bukti keistimewaan Adam dibandingkan dengan makhluk lainnya. Allah pun menunjukkan keunggulan Adam kepada para malaikat.\n\n"
                + "Sujudnya Malaikat dan Penolakan Iblis\n"
                + "Allah memerintahkan seluruh malaikat untuk sujud kepada Adam sebagai bentuk penghormatan. Semua malaikat taat, namun Iblis yang termasuk golongan jin menolak. Iblis merasa lebih mulia karena ia diciptakan dari api, sedangkan Adam dari tanah.\n\n"
                + "Karena kesombongannya, Iblis dikutuk dan diusir dari surga. Namun, Iblis bersumpah untuk menggoda Adam dan keturunannya agar sesat dari jalan Allah hingga Hari Kiamat.\n\n"
                + "Kehidupan Nabi Adam dan Hawa di Surga\n"
                + "Allah menempatkan Adam di surga, tempat yang sangat indah dan penuh kenikmatan. Agar tidak kesepian, Allah menciptakan Hawa dari tulang rusuk Adam. Mereka hidup bahagia di surga dan bebas menikmati semua isi surga, kecuali satu pohon yang dilarang untuk didekati atau dimakan buahnya.\n\n"
                + "Namun, Iblis datang menggoda mereka. Ia membisikkan bahwa jika mereka memakan buah dari pohon itu, mereka akan hidup abadi seperti malaikat. Setelah beberapa kali dibujuk, akhirnya Adam dan Hawa tergoda dan memakan buah dari pohon terlarang itu.\n\n"
                + "Turun ke Bumi\n"
                + "Karena melanggar larangan Allah, Adam dan Hawa diturunkan ke bumi. Allah tidak murka selamanya, karena setelah mereka menyesal dan memohon ampun, Allah menerima taubat mereka. Di bumi, Adam dan Hawa hidup sebagai manusia pertama dan mulai menjalani kehidupan seperti manusia pada umumnya.\n\n"
                + "Menjadi Nabi Pertama\n"
                + "Nabi Adam tidak hanya menjadi manusia pertama, tapi juga nabi pertama. Ia menerima wahyu dari Allah untuk mengajarkan kebaikan, menyembah Allah, dan menjauhi larangan-Nya. Adam dan Hawa memiliki banyak anak yang kemudian menjadi nenek moyang seluruh manusia di dunia.\n\n"
                + "Anak Nabi Adam dan Peristiwa Qabil dan Habil\n"
                + "Dua anak Nabi Adam yang terkenal adalah Qabil dan Habil. Mereka diperintahkan untuk mempersembahkan kurban kepada Allah. Habil mempersembahkan hewan terbaik miliknya, sementara Qabil memberikan hasil panen yang buruk. Allah menerima kurban Habil dan menolak kurban Qabil.\n\n"
                + "Karena iri hati, Qabil membunuh Habil, menjadikannya pembunuhan manusia pertama di bumi. Nabi Adam sangat sedih atas kejadian ini dan semakin giat mengajarkan kepada anak-anaknya tentang pentingnya iman dan akhlak.\n\n"
                + "Wafatnya Nabi Adam A.S\n"
                + "Nabi Adam hidup selama sekitar 960 tahun. Ia menyaksikan anak-cucunya berkembang biak dan menyebar ke berbagai penjuru bumi. Ketika ajalnya tiba, Allah memerintahkan malaikat untuk mencabut ruhnya. Ia wafat dengan tenang sebagai hamba Allah yang taat.\n\n"
                + "Nabi Adam A.S dimakamkan di bumi, dan kisahnya menjadi pelajaran besar bagi seluruh umat manusia. Ia adalah bapak seluruh manusia dan contoh bagi kita dalam hal ketaatan, kesabaran, dan taubat.";

        // Teks pesan moral
        String pesanMoral = "Pesan Moral:\n"
                + "- Taatlah kepada perintah Allah.\n"
                + "- Jangan sombong seperti Iblis.\n"
                + "- Allah Maha Pengampun bagi yang bertaubat.";

        // Menampilkan teks cerita dan pesan moral di TextView
        textViewCerita.setText(cerita);
        textViewPesanMoral.setText(pesanMoral);
    }
}
