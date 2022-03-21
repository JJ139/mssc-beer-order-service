package nl.jellejoosten.beer.order.service.web.mappers;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;
import javax.annotation.processing.Generated;
import nl.jellejoosten.beer.order.service.domain.BeerOrder;
import nl.jellejoosten.beer.order.service.domain.BeerOrderLine;
import nl.jellejoosten.beer.order.service.web.model.BeerOrderLineDto;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-21T20:14:18+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class BeerOrderLineMapperImpl implements BeerOrderLineMapper {

    @Override
    public BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line) {
        if ( line == null ) {
            return null;
        }

        UUID id = null;
        Integer version = null;
        OffsetDateTime createdDate = null;
        OffsetDateTime lastModifiedDate = null;
        String upc = null;
        String beerName = null;
        UUID beerId = null;
        Integer orderQuantity = null;

        BeerOrderLineDto beerOrderLineDto = new BeerOrderLineDto( id, version, createdDate, lastModifiedDate, upc, beerName, beerId, orderQuantity );

        return beerOrderLineDto;
    }

    @Override
    public BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto) {
        if ( dto == null ) {
            return null;
        }

        UUID id = null;
        Long version = null;
        Timestamp createdDate = null;
        Timestamp lastModifiedDate = null;
        BeerOrder beerOrder = null;
        UUID beerId = null;
        Integer orderQuantity = null;
        Integer quantityAllocated = null;

        BeerOrderLine beerOrderLine = new BeerOrderLine( id, version, createdDate, lastModifiedDate, beerOrder, beerId, orderQuantity, quantityAllocated );

        return beerOrderLine;
    }
}
