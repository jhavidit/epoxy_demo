package tech.jhavidit.epoxy_demo

import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import kotlinx.android.synthetic.main.view_holder_message_item.view.*
import tech.jhavidit.epoxy_demo.data.Message

@EpoxyModelClass(layout = R.layout.view_holder_message_item)
abstract class MessageItemModel : EpoxyModelWithHolder<MessageItemModel.Holder>() {
    @EpoxyAttribute
    lateinit var message: Message

    override fun bind(holder: Holder) {
        super.bind(holder)
        with(message)
        {
            holder.title.text = username
            holder.content.text = content
        }
    }

    class Holder : EpoxyHolder() {
        lateinit var profileImage: ImageView
        lateinit var title: AppCompatTextView
        lateinit var content: AppCompatTextView
        override fun bindView(itemView: View) {
            profileImage = itemView.message_profile_image
            title = itemView.message_profile_name
            content = itemView.message_content
        }
    }
}