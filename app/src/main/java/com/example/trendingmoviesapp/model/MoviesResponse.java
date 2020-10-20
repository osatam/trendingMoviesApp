package com.example.trendingmoviesapp.model;

import com.example.trendingmoviesapp.util.Constants;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MoviesResponse {

    @SerializedName(Constants.PAGE_NAME)
    private int page;

    @SerializedName(Constants.RESULTS_NAME)
    private List<Movie> results;

    @SerializedName(Constants.TOTAL_RESULTS_NAME)
    private int totalResults;

    @SerializedName(Constants.TOTAL_PAGES_NAME)
    private int totalPages;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
