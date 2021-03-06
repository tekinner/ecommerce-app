package com.ecommerce.shoppingcart.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCartItemCreateRequest {

    private Integer quantity;
    private Long shoppingCartId;
    private Long productId;
}
