package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name="tb_game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId;
    private String title;
    @Column(name="game_year")
    private Integer year;
    private String gender;
    private String plataform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game(){
    }
    public Game(Long gameId, String title, Integer year, String gender, String plataform, String imgUrl, String shortDescription, String longDescription) {
        this.gameId = gameId;
        this.title = title;
        this.year = year;
        this.gender = gender;
        this.plataform = plataform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
    // ORM - mapeamento objeto relacional, mapear objeto game para virar um registro

    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(gameId, game.gameId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId);
    }
}
