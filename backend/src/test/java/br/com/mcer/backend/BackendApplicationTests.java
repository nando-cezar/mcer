package br.com.mcer.backend;

import br.com.mcer.backend.domain.entities.HistoryLocation;
import br.com.mcer.backend.domain.entities.HistoryLocationBuilder;
import br.com.mcer.backend.domain.entities.HistoryLocationBuilderImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {

    @Test
    void testCreateHistoryLocationWithBuilder(){

        HistoryLocationBuilder historyLocationBuilder = new HistoryLocationBuilderImpl();

        historyLocationBuilder.createNewInstance();

        HistoryLocation historyLocation = historyLocationBuilder.withLatitude(10.0);
        Assertions.assertEquals(10.0, historyLocation.getLatitude());

        historyLocation = historyLocationBuilder.withLongitude(20.0);
        Assertions.assertEquals(20.0, historyLocation.getLongitude());

        historyLocation = historyLocationBuilder.withDescription("My First Location");
        Assertions.assertEquals("My First Location", historyLocation.getDescription());

    }

}
