package com.micropos.cart.mapper;

import com.micropos.cart.model.Cart;
import com.micropos.dto.CartDto;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class CartMapperImpl implements CartMapper {

    @Override
    public Collection<CartDto> toCartDtos(Collection<Cart> carts) {
        if ( carts == null ) {
            return null;
        }

        Collection<CartDto> collection = new ArrayList<CartDto>( carts.size() );
        for ( Cart cart : carts ) {
            collection.add( toCartDto( cart ) );
        }

        return collection;
    }

    @Override
    public Collection<Cart> toCarts(Collection<CartDto> cartDtos) {
        if ( cartDtos == null ) {
            return null;
        }

        Collection<Cart> collection = new ArrayList<Cart>( cartDtos.size() );
        for ( CartDto cartDto : cartDtos ) {
            collection.add( toCart( cartDto ) );
        }

        return collection;
    }
}
