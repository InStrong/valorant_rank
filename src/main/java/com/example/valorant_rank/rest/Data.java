package com.example.valorant_rank.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "currenttier",
        "currenttierpatched",
        "ranking_in_tier",
        "mmr_change_to_last_game",
        "elo",
        "name",
        "tag"
})
@lombok.Data
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("currenttier")
    private Integer currenttier;
    @JsonProperty("currenttierpatched")
    private String currenttierpatched;
    @JsonProperty("ranking_in_tier")
    private Integer rankingInTier;
    @JsonProperty("mmr_change_to_last_game")
    private Integer mmrChangeToLastGame;
    @JsonProperty("elo")
    private Integer elo;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tag")
    private String tag;

}
