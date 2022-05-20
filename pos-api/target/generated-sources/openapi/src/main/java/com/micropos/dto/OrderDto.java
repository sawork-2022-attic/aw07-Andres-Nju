package com.micropos.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.micropos.dto.OrderItemDto;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * OrderDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-19T15:44:00.865920200+08:00[GMT+08:00]")
public class OrderDto   {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("time")
  private String time;

  @JsonProperty("items")
  @Valid
  private List<OrderItemDto> items = null;

  public OrderDto id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderDto time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  
  @Schema(name = "time", required = false)
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public OrderDto items(List<OrderItemDto> items) {
    this.items = items;
    return this;
  }

  public OrderDto addItemsItem(OrderItemDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "items", required = false)
  public List<OrderItemDto> getItems() {
    return items;
  }

  public void setItems(List<OrderItemDto> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDto order = (OrderDto) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.time, order.time) &&
        Objects.equals(this.items, order.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, time, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

