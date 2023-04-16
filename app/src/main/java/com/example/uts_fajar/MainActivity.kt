package com.example.uts_fajar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val videoView = findViewById<VideoView>(R.id.video_view)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.trailer1)

        videoView.setVideoURI(uri)
        videoView.setOnCompletionListener {
            videoView.start()

        }

        videoView.start()






        val animeList = listOf<Anime>(
            Anime(
                R.drawable.film1,
                nameanime = "Your Name",
                descanime = "Film ini menceritakan tentang dua orang remaja, Taki dan Mitsuha, yang tiba-tiba menukar tubuh mereka secara ajaib dan saling mengalami kehidupan satu sama lain. Mereka berusaha untuk memahami apa yang sedang terjadi pada mereka dan membangun hubungan yang unik di antara mereka.\n" +
                        "\n" +
                        "Namun, ketika sebuah bencana alam mengancam kota tempat tinggal Mitsuha, Taki melakukan perjalanan ke masa lalu untuk mencoba mencegah bencana tersebut. Film ini menggabungkan unsur fantasi, petualangan, dan romansa yang menyentuh hati, dengan visual animasi yang indah dan musik yang menyayat hati."
            ),
            Anime(
                R.drawable.film2,
                nameanime = "Spritted Away",
                descanime = " kisah tentang seorang gadis bernama Chihiro yang tersesat di dunia lain yang penuh dengan roh-roh dan makhluk ajaib. Setelah orangtuanya berubah menjadi babi oleh kutukan, Chihiro harus mencari jalan pulang dan menghadapi berbagai rintangan di dalam dunia tersebut. Dalam petualangannya, ia bertemu dengan Haku, seorang anak laki-laki yang membantunya. Akankah Chihiro dapat menemukan jalan keluar dari dunia ajaib tersebut dan mengembalikan orangtuanya ke bentuk semula?"
            ),
            Anime(
                R.drawable.film3,
                nameanime = "Kimetsu No Yiaba",
                descanime = "kisah tentang Tanjirou Kamado yang bergabung dengan Demon Slayer Corps untuk mencari obat yang bisa mengembalikan adiknya, Nezuko, yang diubah menjadi iblis menjadi manusia. Mereka bertarung melawan iblis yang semakin kuat dan menemukan musuh terakhir yang bertanggung jawab atas semua kejadian buruk. Akhirnya, Tanjirou dan teman-temannya bertarung sampai titik darah penghabisan untuk menyelamatkan dunia dari kekuatan jahat."
            ),
            Anime(
                R.drawable.film4,
                nameanime = "Her Blue sky",
                descanime = "Her Blue Sky adalah sebuah film anime Jepang yang mengisahkan tentang seorang remaja bernama Aoi, yang hidup di kota kecil dan memiliki bakat dalam musik. Suatu hari, sahabatnya, seorang anak laki-laki bernama Akatsuki, datang mengunjunginya setelah lama tak bertemu. Namun, Akatsuki ternyata telah menjadi hantu dan terperangkap di dunia manusia.\n" +
                        "\n" +
                        "Aoi dan adiknya, Akane, memutuskan untuk membantu Akatsuki untuk menyelesaikan urusannya di dunia manusia agar ia dapat kembali ke dunia roh. Namun, Aoi dan Akatsuki justru mulai merasa tertarik satu sama lain, meskipun mereka hidup di dunia yang berbeda. Sementara itu, Akane juga menghadapi masalahnya sendiri dan mencoba menemukan jalannya sendiri.\n" +
                        "\n" +
                        "Dalam perjalanan mereka, Aoi, Akane, dan Akatsuki belajar tentang kebahagiaan, kehilangan, dan bagaimana melanjutkan hidup meskipun ada banyak rintangan yang harus dihadapi. Akhirnya, mereka semua menemukan arti sebenarnya dari cinta, persahabatan, dan keluarga dalam perjalanan mereka untuk menemukan kedamaian dan bahagia di dunia mereka masing-masing."
            ),
            Anime(
                R.drawable.film5,
                nameanime = "Naruto The Movie 10",
                descanime = "Naruto dan rekannya mengejar dan menghadapi Akatsuki yang melarikan diri dari pertempuran. Setelah itu, Naruto dan Sakura berhadapan dengan Tobi yang membuat mereka terperangkap dalam teknik Gentei Tsukuyomi. Di dalamnya, Naruto dikenal sebagai Menma dan mengetahui bahwa orang tua Minato dan Kushina masih hidup. Mereka kemudian ikut dalam misi untuk mengambil gulungan Red Moon, di mana Kushina terluka ketika melindungi Naruto."
            ),
            Anime(
                R.drawable.film6,
                nameanime = "Boruto The Movie",
                descanime = "Boruto: Naruto the Movie mengisahkan tentang putra Naruto, Boruto Uzumaki, yang berusaha memenangkan perhatian ayahnya yang selalu sibuk dengan tugas sebagai Hokage. Boruto bertemu dengan Sasuke Uchiha dan meminta bantuan padanya untuk menjadi lebih kuat. Namun, ketika sebuah ancaman muncul yang mengancam keamanan desa, Boruto dan rekan-rekannya harus bekerja sama untuk menghadapi musuh tersebut. Mereka akhirnya mengungkap sebuah konspirasi yang melibatkan bekas anggota akatsuki bernama Momoshiki Otsutsuki dan Kinshiki Otsutsuki, yang berusaha mengambil chakra Naruto. Boruto harus menunjukkan keberanian dan keterampilannya untuk melindungi desa dan keluarganya."
            ),
            Anime(
                R.drawable.film7,
                nameanime = "Boku No Hero The Movie",
                descanime = "Boku No Hero Academia The Movie mengisahkan tentang Deku dan teman-temannya dari UA High School yang menerima undangan untuk menghadiri acara khusus di pulau buatan manusia. Namun, ketika pulau tersebut tiba-tiba diserang oleh penjahat super yang memiliki kekuatan manipulasi quirk, Deku dan teman-temannya harus bekerja sama untuk menyelamatkan seluruh penduduk pulau dan mengungkap konspirasi di balik serangan tersebut. Mereka akhirnya berhadapan dengan musuh tangguh yang menguji kemampuan dan tekad mereka. Deku harus menunjukkan kemampuan baru yang diperolehnya untuk melindungi orang-orang yang dicintainya dan mengatasi rintangan yang menghadang."
            ),
            Anime(
                R.drawable.film8,
                nameanime = "Boku No Hero The Movie 2",
                descanime = "Boku No Hero Academia The Movie 2: Heroes Rising mengisahkan tentang Kelas 1-A dari UA High School yang dikirim ke sebuah pulau terpencil untuk melakukan kegiatan pahlawan sebagai bagian dari praktikum. Di sana, mereka bertemu dengan penduduk setempat yang meminta bantuan mereka untuk melindungi pulau dari serangan penjahat super yang kuat. Saat situasi semakin memburuk, Izuku Midoriya dan Katsuki Bakugo harus bekerja sama dengan teman-teman mereka untuk melawan penjahat super tersebut. Mereka akhirnya menemukan bahwa penjahat super tersebut memiliki kekuatan yang sangat besar dan bahkan melebihi kapasitas mereka sebagai pahlawan. Dalam pertempuran yang sangat sulit, Deku dan Bakugo harus menunjukkan kemampuan dan tekad mereka untuk menyelamatkan pulau dan semua penduduknya."
            ),
            Anime(
                R.drawable.film9,
                nameanime = "Tonikaku Kawaii",
                descanime = "Tonikaku Kawaii mengisahkan tentang Nasa Yuzaki, seorang siswa cerdas yang bertemu dengan seorang gadis misterius bernama Tsukasa pada malam hari. Setelah menghabiskan waktu bersama, mereka berdua sepakat untuk menikah. Namun, Nasa tidak tahu apa-apa tentang Tsukasa selain nama aslinya dan tidak tahu bagaimana untuk menghubunginya lagi. Beberapa tahun kemudian, mereka secara tidak sengaja bertemu lagi dan Nasa mengajak Tsukasa untuk tinggal bersamanya. Tsukasa setuju dan mereka mulai menjalani kehidupan pernikahan mereka yang unik, sambil menghadapi berbagai rintangan dan cobaan dalam perjalanan mereka bersama."
            ),
            Anime(
                R.drawable.film10,
                nameanime = "No Game No Life Movie",
                descanime = "No Game No Life: Zero adalah prekuel dari seri anime No Game No Life yang mengisahkan tentang dunia fantasi yang dikuasai oleh permainan. Cerita berpusat pada legenda Raja yang telah memerintah sebelumnya dan diakhiri dengan kehancuran dunia tersebut. Seorang pemuda bernama Riku bertekad untuk menyelamatkan rasnya yang hampir punah, dan di tengah perjalanannya, ia bertemu dengan seorang android bernama Shuvi. Meskipun Shuvi tidak memiliki pengalaman dalam permainan, ia memiliki kemampuan yang luar biasa dalam menghitung kemungkinan dan mengevaluasi strategi permainan. Riku dan Shuvi bekerja sama untuk mengalahkan dewa permainan yang ingin menguasai dunia tersebut. Namun, apakah usaha mereka akan berhasil atau hanya mengakhiri kehancuran yang sudah pasti?"
            ),
            Anime(
                R.drawable.film11,
                nameanime = "Tate no Yuusha no Nariagari",
                descanime = "Tate no Yuusha no Nariagari, juga dikenal sebagai The Rising of the Shield Hero, mengisahkan tentang Naofumi Iwatani, seorang otaku yang tiba-tiba dipanggil ke dunia fantasi sebagai Pahlawan Shield. Naofumi dan tiga Pahlawan lainnya diberikan tugas untuk melindungi dunia tersebut dari serangan monster. Namun, Naofumi dijebak dan dituduh melakukan kejahatan yang ia tidak lakukan, dan ia ditinggalkan sendirian dan dihina oleh masyarakat setempat. Tanpa teman atau dukungan, Naofumi memutuskan untuk menjadi lebih kuat dan berjuang sendirian. Dia bertemu dengan seorang budak wanita bernama Raphtalia, yang ia beli dan latih menjadi partner pertempurannya. Mereka berdua berjuang melawan monster dan musuh lainnya sambil mencari cara untuk membersihkan nama baik Naofumi dan membuktikan bahwa ia tidak bersalah. Sementara itu, misteri tentang asal mula dunia tersebut mulai terungkap, dan Naofumi menemukan bahwa tugasnya jauh lebih besar dari yang ia pikirkan awalnya."
            ),
            Anime(
                R.drawable.film12,
                nameanime = "Kamisama ni Natta Hi",
                descanime = "\"Kamisama ni Natta Hi\" atau \"The Day I Became a God\" adalah anime yang mengisahkan tentang seorang gadis misterius bernama Hina yang mengklaim dirinya sebagai dewi yang mampu meramalkan akhir dunia dalam waktu tiga bulan lagi. Hina kemudian bertemu dengan seorang remaja bernama Yota Narukami yang sebenarnya tengah mencari makna hidupnya. Dalam perjalanan mereka, Hina dan Yota bertemu dengan berbagai karakter unik, menyelesaikan masalah, dan menemukan makna dalam hidup mereka masing-masing. Namun, meskipun mereka berusaha untuk mengubah masa depan yang tak terhindarkan, waktu terus berjalan menuju akhir dunia yang tak terelakkan."
            ),
            Anime(
                R.drawable.film13,
                nameanime = "Sword Art Online movie 3",
                descanime = "Sword Art Online Movie 3, yang berjudul \"Sword Art Online: Alicization - War of Underworld\", adalah lanjutan dari seri Sword Art Online. Cerita dimulai setelah peristiwa Alicization di mana Kirito terjebak dalam permainan virtual yang sangat realistis yang disebut Underworld. Dalam movie ini, Kirito terbangun dari koma setelah bertarung di Underworld dan mengetahui bahwa Alice, seorang teman baiknya dari Underworld, diculik oleh pihak yang tidak dikenal. Kirito dan teman-temannya kemudian melakukan pencarian untuk menyelamatkan Alice dan menghentikan konflik besar yang terjadi di Underworld. Selama perjalanan mereka, mereka menemukan bahwa mereka sedang dipantau oleh musuh yang sangat kuat dan harus menghadapi banyak rintangan untuk mencapai tujuan mereka."
            ),
            Anime(
                R.drawable.film14,
                nameanime = "Doraemon Movie 3",
                descanime = "Doraemon Movie 3 atau \"Doraemon: Nobita and the Steel Troops\" mengisahkan tentang Nobita yang mendapat perangkat ajaib dari Doraemon yang dapat membuat mainan hidup. Namun, mainan yang dihidupkan oleh Nobita tiba-tiba diambil oleh robot jahat dari masa depan yang ingin menguasai dunia. Nobita dan teman-temannya kemudian bertemu dengan P-Man, seorang pahlawan dari masa depan, dan mencoba untuk menghentikan rencana jahat dari robot tersebut. Mereka mengalami petualangan yang berbahaya dan menghadapi banyak rintangan dalam usaha mereka untuk menyelamatkan masa depan dari kehancuran yang ditimbulkan oleh robot jahat tersebut. Akankah Nobita dan teman-temannya berhasil mengalahkan robot jahat dan menyelamatkan masa depan? Saksikanlah dalam Doraemon Movie 3."
            ),
            Anime(
                R.drawable.film15,
                nameanime = "Doraemon Movie 4",
                descanime = "Doraemon Movie 4, yang berjudul \"Doraemon: Nobita's Dinosaur\", bercerita tentang seorang anak bernama Nobita yang bertemu dengan seekor dinosaurus bernama Piisuke yang telah hidup selama ribuan tahun di dalam gua. Piisuke kemudian membawa Nobita kembali ke masa lalu, di mana mereka bertemu dengan dinosaurus dan mengalami petualangan yang menyenangkan. Namun, Nobita dan Piisuke kemudian menemukan bahwa masa depan Piisuke terancam oleh bencana alam yang mengancam habitat dinosaurus. Mereka kemudian mencoba untuk mencegah bencana tersebut dan menyelamatkan Piisuke dari kepunahan. Saksikanlah petualangan seru Nobita dan Piisuke dalam Doraemon Movie 4 ini."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_anime)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AnimeAdapter(this, animeList) {
            val intent = Intent(this, DetailAnimeActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)


        }



    }



}