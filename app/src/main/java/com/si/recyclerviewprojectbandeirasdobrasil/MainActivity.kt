package com.si.recyclerviewprojectbandeirasdobrasil

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.si.recyclerviewprojectbandeirasdobrasil.activities.ACActivity
import com.si.recyclerviewprojectbandeirasdobrasil.activities.ALActivity
import com.si.recyclerviewprojectbandeirasdobrasil.activities.AMActivity
import com.si.recyclerviewprojectbandeirasdobrasil.activities.APActivity
import com.si.recyclerviewprojectbandeirasdobrasil.activities.BAActivity
import com.si.recyclerviewprojectbandeirasdobrasil.activities.CEActivity
import com.si.recyclerviewprojectbandeirasdobrasil.activities.DFActivity

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private var estados: List<Estados> = emptyList()
    private lateinit var adapter: EstadosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ação para exibir o botão de voltar na ActionBar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Configura o RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.setHasFixedSize(true)

        // Obtém a lista de Estados
        estados = EstadosData.getEstados()

        // Configura o Adapter e o click listener
        adapter = EstadosAdapter(this, estados, onCLickEstado())
        recyclerView.adapter = adapter
    }


    // Função que retorna o listener para os clicks nos estados
    private fun onCLickEstado(): EstadosAdapter.EstadoOnClickListener{
        return object : EstadosAdapter.EstadoOnClickListener {
            override fun onClickEstado(holder: EstadosViewHolder?, idx: Int) {
                val estado = estados[idx]

                if (estado.nome == "Acre") {
                    val intent = Intent(baseContext, ACActivity::class.java)
                    startActivity(intent)
                }

                else if (estado.nome == "Alagoas") {
                    val intent = Intent(baseContext, ALActivity::class.java)
                    startActivity(intent)
                }

                else if (estado.nome == "Maranhão") {
                    val intent = Intent(baseContext, AMActivity::class.java)
                    startActivity(intent)
                }

                else if (estado.nome == "Amapá") {
                    val intent = Intent(baseContext, APActivity::class.java)
                    startActivity(intent)
                }

                else if (estado.nome == "Bahia") {
                    val intent = Intent(baseContext, BAActivity::class.java)
                    startActivity(intent)
                }

                else if (estado.nome == "Ceará") {
                    val intent = Intent(baseContext, CEActivity::class.java)
                    startActivity(intent)
                }

                else if (estado.nome == "Distrito Federal") {
                    val intent = Intent(baseContext, DFActivity::class.java)
                    startActivity(intent)
                }

                Toast.makeText(this@MainActivity, "Estado: ${estado.nome}", Toast.LENGTH_LONG).show()
            }
        }
    }
}
