package com.example.valorant_rank.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "data"
})
@lombok.Data
@Generated("jsonschema2pojo")
public class MmrData {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("data")
    private Data data;

}
