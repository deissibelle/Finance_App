package cm.horion.financeapp.viewmodel

import androidx.lifecycle.ViewModel
import cm.horion.financeapp.repository.MainRepository

class MainViewModel (
    val repository: MainRepository
): ViewModel(){
    constructor():this(MainRepository())
    fun loadData() = repository.items
}