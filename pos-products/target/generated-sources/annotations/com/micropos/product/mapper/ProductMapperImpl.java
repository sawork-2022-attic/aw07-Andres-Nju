package com.micropos.product.mapper;

import com.micropos.dto.ProductDto;
import com.micropos.product.model.Product;
import java.util.ArrayList;
import java.util.Collection;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Collection<ProductDto> toProductsDto(Collection<Product> products) {
        if ( products == null ) {
            return null;
        }

        Collection<ProductDto> collection = new ArrayList<ProductDto>( products.size() );
        for ( Product product : products ) {
            collection.add( toProductDto( product ) );
        }

        return collection;
    }

    @Override
    public Collection<Product> toProducts(Collection<ProductDto> products) {
        if ( products == null ) {
            return null;
        }

        Collection<Product> collection = new ArrayList<Product>( products.size() );
        for ( ProductDto productDto : products ) {
            collection.add( toProduct( productDto ) );
        }

        return collection;
    }

    @Override
    public Product toProduct(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        String id = null;
        String name = null;
        double price = 0.0d;
        String image = null;

        id = productDto.getId();
        name = productDto.getName();
        if ( productDto.getPrice() != null ) {
            price = productDto.getPrice();
        }
        image = productDto.getImage();

        Product product = new Product( id, name, price, image );

        return product;
    }

    @Override
    public ProductDto toProductDto(Product pet) {
        if ( pet == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setId( pet.getId() );
        productDto.setName( pet.getName() );
        productDto.setPrice( pet.getPrice() );
        productDto.setImage( pet.getImage() );

        return productDto;
    }
}
