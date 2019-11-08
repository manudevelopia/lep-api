package info.developia.lep.api.controller


import info.developia.lep.api.model.Compose
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/composes")
class ComposeController {
    private final info.developia.lep.api.service.ComposeService service

    ComposeController(info.developia.lep.api.service.ComposeService service) {
        this.service = service
    }

    @Get("/all")
    @Produces(MediaType.APPLICATION_JSON)
    List<Compose> getAll() {
        return service.getAll()
    }
}
