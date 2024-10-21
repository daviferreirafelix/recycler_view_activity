package com.si.recyclerviewprojectbandeirasdobrasil

data class Estados(val nome: String, val img: Int)

object EstadosData{
    fun getEstados(): List<Estados>{
        return listOf(
            Estados("Acre", R.drawable.ac), Estados("Alagoas", R.drawable.al),
            Estados("Amapá", R.drawable.ap), Estados("Amazonas", R.drawable.am),
            Estados("Bahia", R.drawable.ba), Estados("Ceará", R.drawable.ce),
            Estados("Distrito Federal", R.drawable.df), Estados("Espírito Santo", R.drawable.es),
            Estados("Goiás", R.drawable.go), Estados("Maranhão", R.drawable.ma),
            Estados("Mato Grosso", R.drawable.mt), Estados("Mato Grosso do Sul", R.drawable.ms),
            Estados("Minas Gerais", R.drawable.mg), Estados("Paraná", R.drawable.pr),
            Estados("Paraíba", R.drawable.pb), Estados("Pará", R.drawable.pa),
            Estados("Pernambuco", R.drawable.pe), Estados("Piauí", R.drawable.pi),
            Estados("Rio Grande do Norte", R.drawable.rn), Estados("Rio Grande do Sul", R.drawable.rs),
            Estados("Rio de Janeiro", R.drawable.rj), Estados("Rondônia", R.drawable.ro),
            Estados("Roraima", R.drawable.rr), Estados("Santa Catarina", R.drawable.sc),
            Estados("Sergipe", R.drawable.se), Estados("São Paulo", R.drawable.sp),
            Estados("Tocantins", R.drawable.to)
        )
    }
}