package com.example.tigapuluhharisehat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tigapuluhharisehat.model.ChatMessage

class ListChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_chat)

        // Daftar percakapan
        val chatList = listOf(
            ChatMessage("User", "Apa makanan sehat?", "10:00 AM"),
            ChatMessage("Ahli Gizi", "Sayur, buah, dan protein tanpa lemak.", "10:01 AM"),
            ChatMessage("User", "Boleh makan nasi?", "10:02 AM"),
            ChatMessage("Ahli Gizi", "Boleh, tapi pilih nasi merah atau quinoa.", "10:03 AM"),
            ChatMessage("User", "Apakah saya bisa makan daging?", "10:05 AM"),
            ChatMessage("Ahli Gizi", "Tentu, pilih daging tanpa lemak seperti dada ayam atau ikan.", "10:06 AM"),
            ChatMessage("User", "Bagaimana dengan camilan? Boleh makan kue?", "10:07 AM"),
            ChatMessage("Ahli Gizi", "Kue tidak disarankan, lebih baik pilih camilan sehat seperti kacang atau yogurt rendah lemak.", "10:08 AM"),
            ChatMessage("User", "Apakah buah juga bisa menyebabkan kenaikan berat badan?", "10:10 AM"),
            ChatMessage("Ahli Gizi", "Buah sehat, namun konsumsi dalam jumlah yang wajar. Pilih buah rendah gula seperti apel atau beri.", "10:12 AM"),
            ChatMessage("User", "Bolehkah saya makan makanan cepat saji?", "10:15 AM"),
            ChatMessage("Ahli Gizi", "Makanan cepat saji bisa sesekali, tetapi jangan terlalu sering. Cobalah makan yang lebih bergizi dan seimbang.", "10:16 AM"),
            ChatMessage("User", "Bagaimana cara menjaga keseimbangan dalam diet?", "10:20 AM"),
            ChatMessage("Ahli Gizi", "Penting untuk makan berbagai jenis makanan: protein, karbohidrat, lemak sehat, serta banyak sayur dan buah.", "10:22 AM"),
            ChatMessage("User", "Apa yang dimaksud dengan lemak sehat?", "10:25 AM"),
            ChatMessage("Ahli Gizi", "Lemak sehat adalah lemak yang berasal dari sumber alami seperti alpukat, kacang, dan ikan berlemak.", "10:27 AM"),
            ChatMessage("User", "Apakah saya harus menghindari makanan manis sepenuhnya?", "10:30 AM"),
            ChatMessage("Ahli Gizi", "Tidak perlu menghindarinya sepenuhnya, tetapi konsumsilah dengan bijak dan dalam jumlah yang terbatas.", "10:32 AM"),
            ChatMessage("User", "Bagaimana cara mengatur porsi makan?", "10:35 AM"),
            ChatMessage("Ahli Gizi", "Cobalah makan dalam porsi kecil, lebih sering dalam sehari, dan hindari makan berlebihan.", "10:37 AM"),
            ChatMessage("User", "Apakah saya harus mengurangi konsumsi garam?", "10:40 AM"),
            ChatMessage("Ahli Gizi", "Ya, mengurangi konsumsi garam penting untuk menjaga tekanan darah dan kesehatan jantung.", "10:42 AM"),
            ChatMessage("User", "Bolehkah saya makan sambal?", "10:45 AM"),
            ChatMessage("Ahli Gizi", "Sambal bisa, tetapi perhatikan jumlah garam dan gula di dalamnya. Cobalah buat sambal sendiri di rumah.", "10:47 AM"),
            ChatMessage("User", "Boleh minum jus buah?", "10:50 AM"),
            ChatMessage("Ahli Gizi", "Jus buah bisa, tapi sebaiknya pilih jus tanpa tambahan gula dan lebih baik makan buah utuh untuk mendapatkan seratnya.", "10:52 AM"),
            ChatMessage("User", "Apakah diet keto efektif?", "10:55 AM"),
            ChatMessage("Ahli Gizi", "Diet keto bisa efektif untuk beberapa orang, tetapi tidak cocok untuk semua orang. Konsultasikan dengan ahli gizi terlebih dahulu.", "10:57 AM"),
            ChatMessage("User", "Apa yang harus saya makan sebelum dan sesudah olahraga?", "11:00 AM"),
            ChatMessage("Ahli Gizi", "Sebelum olahraga, makan karbohidrat kompleks seperti oatmeal, dan setelah olahraga, makan protein untuk pemulihan otot.", "11:02 AM"),
            ChatMessage("User", "Bagaimana jika saya merasa lapar di malam hari?", "11:05 AM"),
            ChatMessage("Ahli Gizi", "Cobalah makan camilan sehat seperti buah atau segenggam kacang, daripada makanan berat yang mengandung banyak kalori.", "11:07 AM"),
            ChatMessage("User", "Apakah saya perlu suplemen untuk diet sehat?", "11:10 AM"),
            ChatMessage("Ahli Gizi", "Jika dietmu sudah seimbang, kamu mungkin tidak memerlukannya. Suplemen bisa dipertimbangkan jika ada kekurangan gizi tertentu.", "11:12 AM")
        )


        // Setup RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewChat)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ChatAdapter(chatList)
        recyclerView.adapter = adapter
    }
}
