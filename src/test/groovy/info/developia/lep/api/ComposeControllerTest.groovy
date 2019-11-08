package info.developia.lep.api

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class ComposeControllerTest extends Specification{

    @Inject
    @Client("/composes")
    RxHttpClient client

    void "/composes/all controller should return all composes"(){
        when:
        HttpRequest request = HttpRequest.GET('/all')
        def response = client.toBlocking().retrieve(request)
        then:
        response
    }

}
