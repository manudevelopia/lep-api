package info.developia.lep.api.service


import javax.inject.Singleton

@Singleton
class ComposeServiceImpl implements ComposeService {

    private final info.developia.lep.api.repository.ComposeRepository composeRepository

    ComposeServiceImpl(info.developia.lep.api.repository.ComposeRepository composeRepository) {
        this.composeRepository = composeRepository
    }

    @Override
    def getAll() {
        return composeRepository.getAll()
    }
}
