package info.developia.lep.service

import info.developia.lep.repository.ComposeRepository

import javax.inject.Singleton

@Singleton
class ComposeServiceImpl implements ComposeService {

    private final ComposeRepository composeRepository

    ComposeServiceImpl(ComposeRepository composeRepository) {
        this.composeRepository = composeRepository
    }

    @Override
    def getAll() {
        return composeRepository.getAll()
    }
}
