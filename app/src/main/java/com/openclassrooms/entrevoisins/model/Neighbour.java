package com.openclassrooms.entrevoisins.model;

import java.util.Objects;
import java.util.Random;

import static com.openclassrooms.entrevoisins.service.DummyNeighbourGenerator.DUMMY_NEIGHBOURS_RANDOM;

/**
 * Model object representing a Neighbour
 */
public class Neighbour {

    /** Identifier */
    private Integer id;

    /** Full name */
    private String name;

    /** Avatar */
    private String avatarUrl;

    private String adress;

    private String number;

    private String website;

    private String description;

    private boolean favorite;

    /**
     * Constructor
     * @param id
     * @param name
     * @param avatarUrl
     */
    public Neighbour(Integer id, String name, String avatarUrl, String adress, String number, String website, String description, Boolean favorite) {
        this.id = id;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.adress = adress;
        this.number = number;
        this.website = website;
        this.description = description;
        this.favorite = favorite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neighbour neighbour = (Neighbour) o;
        return Objects.equals(id, neighbour.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static Neighbour generateRandom()
    { return DUMMY_NEIGHBOURS_RANDOM.get(new Random ().nextInt(DUMMY_NEIGHBOURS_RANDOM.size())); }

}