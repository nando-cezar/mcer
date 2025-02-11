package br.com.mcer.backend.config;

import br.com.mcer.backend.application.gateways.HistoryLocationRepository;
import br.com.mcer.backend.application.usecases.CreateHistoryLocation;
import br.com.mcer.backend.application.usecases.FindHistoryLocation;
import br.com.mcer.backend.infra.gateway.HistoryLocationJpaImpl;
import br.com.mcer.backend.infra.gateway.HistoryLocationMapper;
import br.com.mcer.backend.infra.persistence.HistoryLocationJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HistoryLocationConfig {

    @Bean
    CreateHistoryLocation createHistoryLocation(HistoryLocationRepository repository){
        return new CreateHistoryLocation(repository);
    }

    @Bean
    FindHistoryLocation findHistoryLocation(HistoryLocationRepository repository){
        return new FindHistoryLocation(repository);
    }

    @Bean
    HistoryLocationJpaImpl createHistoryLocationJpa(HistoryLocationJpaRepository repository, HistoryLocationMapper mapper){
        return new HistoryLocationJpaImpl(repository, mapper);
    }

    @Bean
    HistoryLocationMapper createHistoryLocationMapper(){
        return new HistoryLocationMapper();
    }

}
