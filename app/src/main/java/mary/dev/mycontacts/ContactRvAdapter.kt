package mary.dev.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import mary.dev.mycontacts.databinding.ContactListItemBinding

class ContactRvAdapter(var contactlist:List<Contact>):RecyclerView.Adapter<ContacViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContacViewHolder {
        var binding =ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContacViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContacViewHolder, position: Int) {
        val context=holder.itemView.context
        var currentContact = contactlist.get(position)
        val contactBinding = holder.binding
        contactBinding.tvname.text = currentContact.name
        contactBinding.tvphonenumber.text = currentContact.phonenumber
        contactBinding.tvemail.text = currentContact.email
        contactBinding.tvaddress.text = currentContact.address

            Picasso.get()
                .load(currentContact.image)
                .resize(300,300)
                .centerCrop()
                .placeholder(R.drawable.ic_baseline_contact_phone_24)
                .into(contactBinding. imgcontact)

        contactBinding.cvcontact.setOnClickListener {
            val intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("Name",currentContact.name)
            intent.putExtra("PHONE_NUMBER",currentContact.phonenumber)
            intent.putExtra("Email",currentContact.email)
            intent.putExtra("Address",currentContact.address)
            intent.putExtra("Image",currentContact.image)
            context.startActivity(intent)
        }
        holder.binding.imgcontact.setOnClickListener {
            Toast.
            makeText(context,"You have to click on the face",Toast.LENGTH_LONG)
                .show()
        }
    }
    override fun getItemCount(): Int {
       return contactlist.size
    }
}
class ContacViewHolder(var binding:ContactListItemBinding):RecyclerView.ViewHolder(binding.root){


}
