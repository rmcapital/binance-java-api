package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * Order or trade report update event.
 * <p>
 * This event is embedded as part of a user data update event.
 *
 * @see UserDataUpdateEvent
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ListUpdateEvent {

  @JsonProperty("e")
  private String eventType;

  @JsonProperty("E")
  private Long eventTime;

  @JsonProperty("s")
  private String symbol;

  @JsonProperty("g")
  private String orderListId;

  @JsonProperty("c")
  private ContingencyType contingencyType;

  /**
   * List Status Type
   */
  @JsonProperty("l")
  private OCOStatus listStatus;

  /**
   * List Order Status
   */
  @JsonProperty("L")
  private OCOOrderStatus listOrderStatus;


  @JsonProperty("C")
  private String listClientOrderId;


  /**
   * Reason why the order was rejected.
   */
  @JsonProperty("r")
  private OrderRejectReason orderRejectReason;


  /**
   * Transaction Time
   */
  @JsonProperty("T")
  private Long transactionTime;


  @JsonProperty("O")
  private List<ListItem> listItems;


  public String getOrderListId() {
    return orderListId;
  }

  public void setOrderListId(String orderListId) {
    this.orderListId = orderListId;
  }

  public ContingencyType getContingencyType() {
    return contingencyType;
  }

  public void setContingencyType(ContingencyType contingencyType) {
    this.contingencyType = contingencyType;
  }

  public OCOStatus getListStatus() {
    return listStatus;
  }

  public void setListStatus(OCOStatus listStatus) {
    this.listStatus = listStatus;
  }

  public OCOOrderStatus getListOrderStatus() {
    return listOrderStatus;
  }

  public void setListOrderStatus(OCOOrderStatus listOrderStatus) {
    this.listOrderStatus = listOrderStatus;
  }

  public String getListClientOrderId() {
    return listClientOrderId;
  }

  public void setListClientOrderId(String listClientOrderId) {
    this.listClientOrderId = listClientOrderId;
  }

  public OrderRejectReason getOrderRejectReason() {
    return orderRejectReason;
  }

  public void setOrderRejectReason(OrderRejectReason orderRejectReason) {
    this.orderRejectReason = orderRejectReason;
  }

  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Long getEventTime() {
    return eventTime;
  }

  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public Long getTransactionTime() {
    return transactionTime;
  }

  public void setTransactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
  }


  public List<ListItem> getListItems() {
    return listItems;
  }

  public void setListItems(List<ListItem> listItems) {
    this.listItems = listItems;
  }


  @Override
  public String toString() {
    return "ListUpdateEvent{" +
        "eventType='" + eventType + '\'' +
        ", eventTime=" + eventTime +
        ", symbol='" + symbol + '\'' +
        ", orderListId='" + orderListId + '\'' +
        ", contingencyType=" + contingencyType +
        ", listStatus=" + listStatus +
        ", listOrderStatus=" + listOrderStatus +
        ", listClientOrderId='" + listClientOrderId + '\'' +
        ", orderRejectReason=" + orderRejectReason +
        ", transactionTime=" + transactionTime +
        ", listItems=" + listItems +
        '}';
  }
}
