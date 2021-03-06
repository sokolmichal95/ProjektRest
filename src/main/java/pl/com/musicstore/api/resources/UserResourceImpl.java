package pl.com.musicstore.api.resources;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.musicstore.api.database.Database;
import pl.com.musicstore.api.database.PostgresqlDB;

@RestController
@RequestMapping("/users")
@Component
public class UserResourceImpl extends UserResource {

    private static final Database DATABASE = new PostgresqlDB();

    @Override
    protected Database getDatabase() {
        return DATABASE;
    }
}
