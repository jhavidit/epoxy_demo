package tech.jhavidit.epoxy_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import tech.jhavidit.epoxy_demo.data.Data

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val controller = HomeController()
        messagesView.setController(controller)
        controller.allMessages = Data.messages
        controller.recentlyActive = Data.recentlyActive
    }
}