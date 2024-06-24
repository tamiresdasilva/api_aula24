package com.example.api_aula24.repositories

import com.example.api_aula24.data.datasources.CharacterDataSource
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val CharacterDataSource: CharacterDataSource
) {
    suspend fun fetchCharacters(): List<Character>{

    }
}