package com.example.tigapuluhharisehat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListMakananActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_makan)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val makananList = listOf(
            MakananSehat("Oatmeal Buah Madu", "Membantu melancarkan pencernaan dan sumber energi sehat.", R.drawable.oatmeal_buah_madu),
            MakananSehat("Sup Ayam Bening", "Meningkatkan imunitas dan menjaga keseimbangan cairan tubuh.", R.drawable.sup_ayam_bening),
            MakananSehat("Nasi Merah Ayam Panggang", "Kaya serat dan protein rendah lemak.", R.drawable.nasi_merah_ayam_panggang),
            MakananSehat("Smoothie Pisang Selai", "Sumber kalium dan energi cepat.", R.drawable.smoothie_pisang_selai),
            MakananSehat("Tumis Brokoli Wortel", "Mengandung antioksidan dan vitamin C tinggi.", R.drawable.tumis_brokoli_wortel),
            MakananSehat("Pepes Tahu", "Protein nabati tinggi tanpa minyak.", R.drawable.pepes_tahu),
            MakananSehat("Salad Tuna", "Mengandung omega-3 yang baik untuk jantung.", R.drawable.salad_tuna),
            MakananSehat("Granola Yogurt", "Meningkatkan kesehatan pencernaan dan kaya probiotik.", R.drawable.granola_yogurt),
            MakananSehat("Tahu Kukus Sayur", "Rendah kalori dan kaya serat.", R.drawable.tahu_kukus_sayur),
            MakananSehat("Telur Dadar Sayur", "Protein hewani dengan tambahan vitamin dari sayur.", R.drawable.telur_dadar_sayur),
            MakananSehat("Sup Jagung Manis", "Meningkatkan daya tahan tubuh dan sumber energi.", R.drawable.sup_jagung_manis),
            MakananSehat("Tempe Panggang", "Sumber protein nabati dan probiotik.", R.drawable.tempe_panggang),
            MakananSehat("Sup Kacang Merah", "Kaya zat besi dan serat tinggi.", R.drawable.sup_kacang_merah),
            MakananSehat("Sandwich Alpukat", "Lemak sehat dan serat baik untuk jantung.", R.drawable.sandwich_alpukat),
            MakananSehat("Bubur Ayam Sehat", "Makanan ringan dan hangat untuk pencernaan.", R.drawable.bubur_ayam_sehat),
            MakananSehat("Pancake Oat Madu", "Energi tinggi dan bebas gula tambahan.", R.drawable.pancake_oat_madu),
            MakananSehat("Sup Tomat & Roti", "Vitamin A dan antioksidan tinggi.", R.drawable.sup_tomat_roti),
            MakananSehat("Salmon Panggang Lemon", "Asam lemak omega-3 dan vitamin D.", R.drawable.salmon_panggang_lemon),
            MakananSehat("Tumis Kangkung Tahu", "Zat besi dan protein yang baik.", R.drawable.tumis_kangkung_tahu),
            MakananSehat("Nasi Jagung Lauk", "Kaya serat dan vitamin B kompleks.", R.drawable.nasi_jagung_lauk),
            MakananSehat("Sayur Asem Sehat", "Menyegarkan dan membantu detoks tubuh.", R.drawable.sayur_asem_sehat),
            MakananSehat("Roti Gandum Telur", "Karbohidrat kompleks dan protein seimbang.", R.drawable.roti_gandum_telur),
            MakananSehat("Sup Wortel Labu", "Vitamin A tinggi dan baik untuk mata.", R.drawable.sup_wortel_labu),
            MakananSehat("Chicken Wrap Sehat", "Mudah dibawa dan kaya protein.", R.drawable.chicken_wrap_sehat),
            MakananSehat("Nasi Merah Telur Sayur", "Menu lengkap dan seimbang.", R.drawable.nasi_merah_telur_sayur),
            MakananSehat("Smoothie Stroberi Chia", "Antioksidan tinggi dan kaya serat.", R.drawable.smoothie_stroberi_chia),
            MakananSehat("Salad Tahu", "Makanan ringan dengan protein nabati.", R.drawable.salad_tahu),
            MakananSehat("Capcay Rebus", "Sayuran lengkap dan rendah lemak.", R.drawable.capcay_rebus),
            MakananSehat("Oatmeal Asin", "Kaya serat dengan rasa gurih sehat.", R.drawable.oatmeal_asin),
            MakananSehat("Sate Tempe Kukus", "Alternatif sate sehat bebas lemak.", R.drawable.sate_tempe_kukus)
        )

        // Memperbaiki pemanggilan MakananAdapter
        val adapter = MakananAdapter(
            context = this,
            makananList = makananList,
            onItemClick = { makanan: MakananSehat ->
                // Handle item click di sini
                println("Makanan yang dipilih: ${makanan.nama}")
            }
        )

        recyclerView.adapter = adapter
    }
}
