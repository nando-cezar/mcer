package br.com.mcer.backend;

import br.com.mcer.backend.domain.entities.HistoryLocation;
import br.com.mcer.backend.domain.entities.HistoryLocationBuilder;
import br.com.mcer.backend.domain.entities.HistoryLocationBuilderImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendApplicationTests {
    /*
    @Test
    void testCreateHistoryLocationWithBuilder(){

        HistoryLocationBuilder historyLocationBuilder = new HistoryLocationBuilderImpl();

        historyLocationBuilder.createNewInstance();

        HistoryLocation historyLocation = historyLocationBuilder.withLatitude(10.0);
        Assertions.assertEquals(historyLocation.getLatitude(), 10.0);

        historyLocation = historyLocationBuilder.withLongitude(20.0);
        Assertions.assertEquals(historyLocation.getLongitude(), 20.0);

        historyLocation = historyLocationBuilder.withDescription("My First Location");
        Assertions.assertEquals(historyLocation.getDescription(), "My First Location");

    }
*/
}
