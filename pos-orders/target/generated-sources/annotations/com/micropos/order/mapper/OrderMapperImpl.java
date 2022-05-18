package com.micropos.order.mapper;

import com.micropos.dto.OrderDto;
import com.micropos.order.model.Order;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Collection<OrderDto> toOrderDtos(Collection<Order> orders) {
        if ( orders == null ) {
            return null;
        }

        Collection<OrderDto> collection = new ArrayList<OrderDto>( orders.size() );
        for ( Order order : orders ) {
            collection.add( toOrderDto( order ) );
        }

        return collection;
    }

    @Override
    public Collection<Order> toOrders(Collection<OrderDto> orderDtos) {
        if ( orderDtos == null ) {
            return null;
        }

        Collection<Order> collection = new ArrayList<Order>( orderDtos.size() );
        for ( OrderDto orderDto : orderDtos ) {
            collection.add( toOrder( orderDto ) );
        }

        return collection;
    }
}
