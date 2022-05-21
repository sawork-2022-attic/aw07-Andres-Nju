package com.micropos.delivery.mapper;

import com.micropos.delivery.model.Entry;
import com.micropos.dto.DeliveryEntryDto;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class DeliveryMapperImpl implements DeliveryMapper {

    @Override
    public Collection<DeliveryEntryDto> toEntryDtos(Collection<Entry> entries) {
        if ( entries == null ) {
            return null;
        }

        Collection<DeliveryEntryDto> collection = new ArrayList<DeliveryEntryDto>( entries.size() );
        for ( Entry entry : entries ) {
            collection.add( toEntryDto( entry ) );
        }

        return collection;
    }

    @Override
    public Collection<Entry> toEntries(Collection<DeliveryEntryDto> entryDtos) {
        if ( entryDtos == null ) {
            return null;
        }

        Collection<Entry> collection = new ArrayList<Entry>( entryDtos.size() );
        for ( DeliveryEntryDto deliveryEntryDto : entryDtos ) {
            collection.add( toEntry( deliveryEntryDto ) );
        }

        return collection;
    }
}
