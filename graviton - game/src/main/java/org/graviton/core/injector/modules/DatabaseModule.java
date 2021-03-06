package org.graviton.core.injector.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.graviton.database.AbstractDatabase;
import org.graviton.database.GameDatabase;
import org.graviton.database.LoginDatabase;
import org.graviton.database.entity.EntityFactory;
import org.graviton.database.repository.*;

/**
 * Created by Botan on 04/11/2016 : 22:12
 */
public class DatabaseModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(AbstractDatabase.class).annotatedWith(Names.named("database.game")).to(GameDatabase.class).asEagerSingleton();
        bind(AbstractDatabase.class).annotatedWith(Names.named("database.login")).to(LoginDatabase.class).asEagerSingleton();

        bind(PlayerRepository.class).asEagerSingleton();
        bind(AccountRepository.class).asEagerSingleton();
        bind(GameMapRepository.class).asEagerSingleton();
        bind(CommandRepository.class).asEagerSingleton();
        bind(ArtificialIntelligenceRepository.class).asEagerSingleton();
        bind(GuildRepository.class).asEagerSingleton();

        bind(EntityFactory.class).asEagerSingleton();
    }
}
