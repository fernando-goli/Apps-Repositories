package com.fgomes.githubrepository.domain

import com.fgomes.githubrepository.core.UseCase
import com.fgomes.githubrepository.data.model.Repo
import com.fgomes.githubrepository.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}