package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Represents order list item.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListItem {

  @JsonProperty("s")
  private String symbol;

  @JsonProperty("i")
  private Long orderId;

  @JsonProperty("c")
  private String clientOrderId;

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public String getClientOrderId() {
    return clientOrderId;
  }

  public void setClientOrderId(String clientOrderId) {
    this.clientOrderId = clientOrderId;
  }

  @Override
  public String toString() {
    return "ListItem{" +
        "symbol='" + symbol + '\'' +
        ", orderId=" + orderId +
        ", clientOrderId='" + clientOrderId + '\'' +
        '}';
  }
}
