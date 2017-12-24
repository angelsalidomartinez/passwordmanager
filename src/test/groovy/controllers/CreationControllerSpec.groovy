import com.manager.credentials.controllers.management.CreationController
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.ResultActions
import org.springframework.web.context.WebApplicationContext
import spock.lang.Specification

class CreationControllerSpec extends Specification {

    private MockMvc mockMvc
    private WebApplicationContext webApplicationContext

    def "return Http code 400 if credential object is null" (){
        setup:
        this.mockMvc =  MockMvcBuilders.standaloneSetup(new CreationController())
                .apply(sharedHttpSession())
                .build();
        given:

        when:
          ResultActions resultActions =  mockMvc.perform(null)
        then:
           resultActions
    }

}