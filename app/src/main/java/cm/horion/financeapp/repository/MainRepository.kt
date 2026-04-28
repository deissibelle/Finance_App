package cm.horion.financeapp.repository

import cm.horion.financeapp.domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Restaurant",1000.0,"img1","17 jun 2025 19:15"),
        ExpenseDomain("McDonald",73.12,"img2","11 jun 2025 19:30"),
        ExpenseDomain("Cinema",23.47,"img3","17 mars 2025 19:15"),
        ExpenseDomain("Restaurant",573.12,"img4","20 avril 2025 21:15"),

        )
}