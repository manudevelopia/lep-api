package info.developia.lep.controller

import info.developia.lep.model.Compose
import info.developia.lep.service.ComposeService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/composes")
class ComposeController {
    private final ComposeService service

    ComposeController(ComposeService service) {
        this.service = service
    }

    @Get("/all")
    @Produces(MediaType.APPLICATION_JSON)
    List<Compose> getAll() {
        return service.getAll()
    }
}
