package cm.horion.financeapp.viewmodel

import androidx.lifecycle.ViewModel
import cm.horion.financeapp.repository.MainRepository

class mainViewModel (
    val repository: MainRepository
): ViewModel(){
    constructor():this(MainRepository())
    fun loadData() = repository.items
}