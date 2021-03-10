package com.dicoding.lampungdistricts

import java.util.*


object DistrictData {
    private val districtName = arrayOf("Bandar Lampung",
            "Metro",
            "Way Kanan",
            "Tulang Bawang Barat",
            "Tulang Bawang",
            "Tanggamus",
            "Pringsewu",
            "Pesisir Barat",
            "Pesawaran",
            "Mesuji",
            "Lampung Utara",
            "Lampung Timur",
            "Lampung Tengah",
            "Lampung Selatan",
            "Lampung Barat")

    private val districtDetail = arrayOf("Kota Bandar Lampung adalah sebuah kota di Indonesia sekaligus ibu kota dan kota terbesar di Provinsi Lampung. Dengan kepadatan 5.332/km2, Bandar Lampung juga merupakan kota terbesar dan terpadat kedua di Pulau Sumatra setelah Medan, serta termasuk salah satu kota besar di Indonesia dan Kota terpadat di luar pulau Jawa.\n" +
            "\n" +
            "Secara geografis, Kota ini merupakan gerbang utama Pulau Sumatra, tepatnya kurang lebih 165 km sebelah barat laut Jakarta, memiliki andil penting dalam jalur transportasi darat dan aktivitas pendistribusian logistik dari Jawa menuju Sumatra maupun sebaliknya.\n" +
            "\n" +
            "Kota Bandar Lampung memiliki luas wilayah daratan 169,21 km² yang terbagi ke dalam 20 Kecamatan dan 126 Kelurahan dengan populasi penduduk 1.166.066[7] jiwa (berdasarkan hasil sensus penduduk 2020). Saat ini kota Bandar Lampung merupakan pusat jasa, perdagangan, dan perekonomian di provinsi Lampung.",
            "Kota Metro adalah salah satu kota di Provinsi Lampung. Berjarak 52 km dari Kota Bandar Lampung (ibu kota provinsi), serta merupakan kota terbesar kedua di provinsi Lampung. Kota ini juga merupakan kota yang memiliki tingkat kemacetan paling rendah di Provinsi Lampung. Kota Metro masuk dalam Daftar 10 kota di Indonesia dengan biaya hidup terendah ke-9 di Indonesia serta urutan kedua di Pulau Sumatra berdasarkan Survey BPS tahun 2017.\n\n Kini, Kota Metro sedang melakukan pembenahan dan pengembangan kota yang lebih maju menuju visi dan misinya sebagai kota pendidikan dan wisata keluarga di Provinsi Lampung dengan memperbaiki sektor pendidikan, keamanan, kebersihan serta meningkatkan fasilitas publik, pengoptimalan ruang terbuka hijau, dan mempercantik tiap sudut kota dengan dibangunnya taman taman kecil. Kota Metro juga merupakan target cetak biru Kementerian Pekerjaan Umum Dan Perumahan Rakyat Republik Indonesia sebagai kawasan strategis dan target pengembangan kota metropolitan setelah Bandar Lampung.",
            "Kabupaten Way Kanan adalah salah satu kabupaten di provinsi Lampung, Indonesia yang merupakan salah satu pemekaran dari Lampung Utara. Kabupaten ini merupakan salah satu kabupaten dari provinsi Lampung yang terjauh dari pusat pemerintah provinsi (Kota Bandar Lampung).",
            "Kabupaten Tulang Bawang Barat adalah salah satu kabupaten di Provinsi Lampung, Indonesia. Kabupaten ini diresmikan oleh Menteri Dalam Negeri Indonesia, Mardiyanto, pada 29 Oktober 2008, sebagai pecahan dari Kabupaten Tulang Bawang.",
            "Kabupaten Tulang Bawang adalah salah satu kabupaten di Provinsi Lampung, Indonesia. Pusat pemerintahannya adalah Kota Menggala. Kabupaten Tulang Bawang memiliki luas wilayah sebesar 3.466,32 Km2. Secara umum wilayah Kabupaten Tulang Bawang berada di dataran rendah. Ketinggian wilayah di Kabupaten Tulang Bawang bervariasi antara 2 Mdpl s/d 44 Mdpl.",
            "Kabupaten Tanggamus adalah salah satu kabupaten di Provinsi Lampung, Indonesia. Ibu kota kabupaten ini terletak di Kota Agung Pusat. Kabupaten Tanggamus diresmikan berdasarkan Undang-Undang Nomor 2 Tahun 1997, tanggal 21 Maret 1997. Kabupaten ini memiliki luas wilayah 4.654,98 Km² dan berpenduduk sebanyak 580.383 jiwa (tahun 2017) dengan kepadatan penduduk 124 jiwa/km². Di bidang pendidikan, Kabupaten Tangamus memiliki sarana dari 20 PAUD/TK, 434 SD/MI, 58 SMP/MTs, 17 SMA/MA, 5 SMK/MK hingga Perguruan Tinggi.",
            "Pringsewu adalah salah satu kabupaten di Provinsi Lampung, Indonesia. Kabupaten ini disahkan menjadi kabupaten dalam Rapat Paripurna DPR tanggal 29 Oktober 2008, sebagai pemekaran dari Kabupaten Tanggamus. Kabupaten ini Terletak 37 kilometer sebelah barat Bandar Lampung, ibu kota provinsi.\n" +
                    "\n" +
                    "Saat ini Pringsewu disetujui menjadi kabupaten tersendiri karena perkembangannya yang bagus, baik dari segi pendapatan daerah, taraf ekonomi maupun pendidikan penduduk. Mata pencaharian yang utama di Pringsewu adalah bertani dan berdagang.",
            "Kabupaten Pesisir Barat merupakan sebuah kabupaten termuda di Provinsi Lampung. Kabupaten Pesisir Barat merupakan hasil pemekaran Kabupaten Lampung Barat, yang disahkan berdasarkan Undang-undang Nomor 22 Tahun 2012 tentang Pembentukan Kabupaten Pesisir Barat Provinsi Lampung pada tanggal 25 Oktober 2012[5] kemudian diresmikan pada tanggal 22 April 2013.",
            "Kabupaten Pesawaran adalah salah satu kabupaten di Provinsi Lampung, Indonesia. Kabupaten ini diresmikan pada tanggal 2 November 2007 berdasarkan Undang-Undang Nomor 33 Tahun 2007 tentang Pembentukan Kabupaten Pesawaran. Semula kabupaten ini merupakan bagian dari Kabupaten Lampung Selatan. Daerah ini kaya akan sumberdaya alam pertanian, perkebunan dan kehutanan. Secara umum memiliki iklim hujan tropis sebagaimana iklim Provinsi Lampung pada umumnya, curah hujan per tahun berkisar antara 2.264 mm sampai dengan 2.868 mm dan hari hujan antara 90 sampai dengan 176 hari/tahun.\n" +
                    "\n" +
                    "Arus angin di Kabupaten Pesawaran bertiup dari Samudra Indonesia dengan kecepatan rata-rata 70 km/hari atau 5,83 km/jam. Sedangkan temperatur udara berkisar antara 26 °C sampai dengan 29 °C dan suhu rata-ratanya adalah 288 °C.",
            "Kabupaten Mesuji adalah salah satu kabupaten di Provinsi Lampung, Indonesia. Mesuji merupakan kabupaten dengan jarak terjauh dari Bandar Lampung, ibu kota Lampung, serta berbatasan langsung dengan Kabupaten Ogan Komering Ilir Provinsi Sumatra Selatan.\n" +
                    "\n" +
                    "Wilayah kabupaten Mesuji merupakan Daerah agraris dimana mata pencaharian pokok penduduknya berada di sektor pertanian. Hal ini dikarenakan daerah terluas merupakan daerah dataran yang cocok dimanfaatkan untuk pertanian.",
            "Kabupaten Lampung Utara adalah salah satu kabupaten di Provinsi Lampung, Indonesia. Ibukota kabupaten terletak di Kotabumi dan jumlah penduduk kabupaten berjumlah 612.100 pada tahun 2019.[2]\n" +
                    "\n" +
                    "Kabupaten ini dulunya adalah kabupaten terluas/terbesar di Provinsi Lampung yang sekarang meliputi Kabupaten Lampung Utara sendiri, Kabupaten Way Kanan, Kabupaten Lampung Barat (yang melahirkan Kabupaten Pesisir Barat), dan Kabupaten Tulang Bawang (yang melahirkan Kabupaten Tulang Bawang Barat dan Kabupaten Mesuji).",
            "Kabupaten Lampung Timur adalah salah satu kabupaten di Provinsi Lampung, Indonesia. Ibu kota kabupaten ini terletak di Sukadana. Kabupaten ini memiliki luas wilayah 5.325,03 km² dan berpenduduk sebesar 1.044.320 jiwa (Statistik 2019).[1] Kabupaten ini memiliki semboyan \"Bumei Tuwah Bepadan\".\n" +
                    "\n" +
                    "Kabupaten ini sebelumnya termasuk dalam Kabupaten Lampung Tengah.",
            "Kabupaten Lampung Tengah adalah kabupaten di Provinsi Lampung dengan ibu kota terletak di Gunung Sugih. Kabupaten ini memiliki luas wilayah 4.789,82 km² dan berpenduduk sebanyak 1.239.096 jiwa (tahun 2015). Lampung Tengah merupakan salah satu kabupaten yang terkurung daratan (land lock) di Provinsi Lampung. Kabupaten ini terletak sekitar 57,85 kilometer dari Kota Bandar Lampung.\n" +
                    "\n" +
                    "Kabupaten ini dulunya merupakan kabupaten terluas kedua di Lampung sampai dengan diundangkannya Undang-undang Nomor 12 tahun 1999 yang memecah kabupaten ini menjadi beberapa daerah lain sehingga luasnya menjadi lebih kecil. Kabupaten Lampung Tengah dulunya meliputi Kabupaten Lampung Tengah, Kabupaten Lampung Timur, dan Kota Metro.[5]\n" +
                    "\n" +
                    "Sebelum tahun 1999, ibu kota Lampung Tengah terletak di Metro yang dimekarkan menjadi kota otonom sendiri. Setelah tahun 1999 pusat pemerintahan Lampung Tengah dipindahkan ke Gunung Sugih.",
            "Kabupaten Lampung Selatan adalah salah satu kabupaten di Provinsi Lampung. Ibu kota kabupaten ini terletak di Kalianda. Kabupaten ini memiliki luas wilayah 2.007,01 km² dan berpenduduk sebanyak 950,844 jiwa.[4] Berdasarkan data Kemendagri dalam Permendagri no.137 Tahun 2017 disebutkan luas wilayah 700,32 km² dan berpenduduk sebanyak 1.269.262 jiwa.[5]\n" +
                    "\n" +
                    "Wilayah Kabupaten Lampung Selatan terletak antara 105° - 105°45' Bujur Timur dan 5°15' - 6° Lintang Selatan. Mengingat letak yang demikian ini daerah Kabupaten Lampung Selatan seperti halnya daerah-daerah lain di Indonesia merupakan daerah tropis.\n" +
                    "\n" +
                    "Kabupaten Lampung Selatan bagian selatan meruncing dan mempunyai sebuah teluk besar yaitu Teluk Lampung. Di Teluk Lampung terdapat sebuah pelabuhan yaitu Pelabuhan Panjang di mana kapal-kapal dalam dan luar negeri dapat merapat. Secara umum pelabuhan ini merupakan faktor yang sangat penting bagi kegiatan ekonomi penduduk Lampung, terutama penduduk Lampung Selatan. Pelabuhan ini sejak tahun 1982 termasuk dalam wilayah Kota Bandar Lampung.",
            "Kabupaten Lampung Barat adalah salah satu kabupaten di provinsi Lampung, Indonesia. Ibu kota kabupaten ini terletak di Liwa. Kabupaten ini dibentuk berdasarkan Undang-Undang Nomor 6 Tahun 1991 tanggal 16 Agustus 1991 yang merupakan hasil pemekaran dari Kabupaten Lampung Utara.\n" +
                    "\n" +
                    "Kabupaten ini dominan dengan perbukitan dengan pantai di sepanjang pesisir barat Lampung. Daerah pegunungan yang merupakan punggung Bukit Barisan, ditempati oleh vulkanik quarter dari beberapa formasi. Daerah ini berada pada ketinggian 50 - > 1000 mdpl. Daerah ini dilalui oleh sesar Semangka, dengan lebar zona sebesar ± 20 Km. Pada beberapa tempat dijumpai beberapa aktivitas vulkanik dan pemunculan panas bumi.[6]")

    private val districtLogo = intArrayOf(R.drawable.balam,
            R.drawable.metro,
            R.drawable.way_kanan,
            R.drawable.tubaba,
            R.drawable.tulang_bawang,
            R.drawable.tanggamus,
            R.drawable.pringsewu,
            R.drawable.pesisir_barat,
            R.drawable.pesawaran,
            R.drawable.mesuji,
            R.drawable.lampura,
            R.drawable.lamtim,
            R.drawable.lamteng,
            R.drawable.lamsel,
            R.drawable.lambar)

    val listData: ArrayList<District>
        get() {
            val list = arrayListOf<District>()
            for (position in districtName.indices) {
                val district = District()
                district.name = districtName[position]
                district.detail = districtDetail[position]
                district.logo = districtLogo[position]
                list.add(district)
            }
            return list
        }
}