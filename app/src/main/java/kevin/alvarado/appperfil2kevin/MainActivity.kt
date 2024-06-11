package kevin.alvarado.appperfil2kevin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //1- Mandar a llamar a todos los elementos
        val txtNumTicket = findViewById<EditText>(R.id.txtNumTicket)
        val txtTitulo = findViewById<EditText>(R.id.txtTitulo)
        val txtAutor = findViewById<EditText>(R.id.txtAutor)
        val txtDescripcion = findViewById<EditText>(R.id.txtDescripcion)
        val txtEmailAutor = findViewById<EditText>(R.id.txtEmailAutor)
        val txtFechaCreacion = findViewById<EditText>(R.id.txtFechaCreacionTicket)
        val txtEstadoTicket = findViewById<EditText>(R.id.txtEstadoTicket)
        val txtFechaFinalizacion = findViewById<EditText>(R.id.txtFechaFinalTicket)
        val btnAgregar = findViewById<Button>(R.id.btnAgregarTicket)
        val rcvTicket = findViewById<RecyclerView>(R.id.rcvTicket)

        //Asignar un layout al RecyclerView para poder ver los datos
        rcvTicket.layoutManager = LinearLayoutManager(this)


    }
}