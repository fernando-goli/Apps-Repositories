package com.fgomes.githubrepository.data.repositories

import com.fgomes.githubrepository.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}