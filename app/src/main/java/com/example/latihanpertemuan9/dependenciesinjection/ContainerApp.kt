package com.example.latihanpertemuan9.dependenciesinjection

import android.content.Context
import com.example.latihanpertemuan9.data.database.KrsDatabase
import com.example.latihanpertemuan9.repository.LocalRepositoryMhs
import com.example.latihanpertemuan9.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}