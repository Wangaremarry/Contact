package mary.dev.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import mary.dev.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaycontacts()
    }
    fun displaycontacts(){
        var contact=Contact("Jessy Maina","0756382655","jessy@gmail.com","4563 Kenyatta Road","https://i.pinimg.com/236x/74/6e/63/746e63c9773463b089c1db4bc7d38a03.jpg")
        var contact1=Contact("Essy Main","0725637430","essy@gmail.com","525 Yoho Street","https://i.pinimg.com/236x/9a/65/94/9a65946ef325188887a5a8b05ce35dfe.jpg")
        var contact2=Contact("Mellisa Wanjiku","0725326543","mellisa@gmail.com","988 Wanu Street","https://i.pinimg.com/236x/52/ea/70/52ea7002cad472e5ca04af6fd4bfbd4c.jpg")
        var contact3=Contact("Eric Kamau","0725769784","eric@gmail.com","867 Sozi Street","https://i.pinimg.com/236x/2a/f2/ec/2af2ec99bf57b591403b4ba4764fef79.jpg")
        var contact4=Contact("Jimmy Wawia","0721456274","jimmy@gmail.com","098 Tom Mboya Street","https://i.pinimg.com/236x/71/ea/e0/71eae0d3ffae5cab20da8860b3116f76.jpg")
        var contact5=Contact("Elvin Mokoa","0789783245","elvin@gmail.com","123 Yolo Street ","https://i.pinimg.com/236x/23/6d/3c/236d3c3f659fc21e4b029f9491b11d5d.jpg")
        var contact6=Contact("Jerusa Wanjiru","0789783245","elvin@gmail.com","123 Yolo Street ","https://i.pinimg.com/236x/57/19/71/5719712d6ca2d75c20732d50d79cc5e9.jpg")
        var contact7=Contact("Melvin Wee","0789783245","elvin@gmail.com","123 Yolo Street ","https://i.pinimg.com/236x/52/34/b0/5234b0c98328a69986b5cb3ad97deae2.jpg")
        var contact8=Contact("Wanda LIz","0789783245","elvin@gmail.com","123 Yolo Street ","https://i.pinimg.com/236x/48/09/90/4809902863149ec09156165311e633e5.jpg")
        var contact9=Contact("Sabs John","0789783245","elvin@gmail.com","123 Yolo Street ","https://i.pinimg.com/236x/14/a4/00/14a400f37ca44acb73036a90a6be77f9.jpg")
        var contact10=Contact("Mark Nga'nga","0789783245","elvin@gmail.com","123 Yolo Street ","https://i.pinimg.com/236x/00/b4/0f/00b40f75c8fed76bc6fd51850486743b.jpg")






        var contactlist= listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        var contactAdapter=ContactRvAdapter(contactlist)
        binding.rvcontacts.layoutManager=LinearLayoutManager(this)
        binding.rvcontacts.adapter=contactAdapter
    }
}