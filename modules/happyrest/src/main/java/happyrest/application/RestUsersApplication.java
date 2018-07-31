package happyrest.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@ApplicationPath("/users")
@Component(
		immediate = true,
		property= {"jaxrs.application=true"},
		service = Application.class)
public class RestUsersApplication extends Application {

    @Reference
    private RestUserResource restUserResource;

    @Override
    public Set<Object> getSingletons() {
        super.getSingletons();
        return new HashSet<>(Collections.singletonList(restUserResource));
    }

}
