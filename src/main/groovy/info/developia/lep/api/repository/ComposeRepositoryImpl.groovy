package info.developia.lep.api.repository


import javax.inject.Singleton

@Singleton
class ComposeRepositoryImpl implements ComposeRepository {
    @Override
    def getAll() {
        return [
                new info.developia.lep.api.model.Compose(ncas: "ncas1", nce: "nce1", name: "name1", description: "description1"),
                new info.developia.lep.api.model.Compose(ncas: "ncas2", nce: "nce2", name: "name2", description: "description2"),
                new info.developia.lep.api.model.Compose(ncas: "ncas3", nce: "nce3", name: "name3", description: "description3"),
                new info.developia.lep.api.model.Compose(ncas: "ncas4", nce: "nce4", name: "name4", description: "description4"),
                new info.developia.lep.api.model.Compose(ncas: "ncas5", nce: "nce5", name: "name5", description: "description5")
        ]
    }
}
