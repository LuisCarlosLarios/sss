package com.luxoft.movies.models;

import java.util.List;

public class SearchApiResponse {
    List<SearchArrayObject> titles = null;
    List<SearchArrayObject> names = null;
    List<SearchArrayObject> years = null;

    public List<SearchArrayObject> getTitles() {
        return titles;
    }

    public void setTitles(List<SearchArrayObject> titles) {
        this.titles = titles;
    }

    public List<SearchArrayObject> getNames() {
        return names;
    }

    public void setNames(List<SearchArrayObject> names) {
        this.names = names;
    }

    public List<SearchArrayObject> getYears() {
        return years;
    }

    public void setYears(List<SearchArrayObject> years) {
        this.years = years;
    }
}
