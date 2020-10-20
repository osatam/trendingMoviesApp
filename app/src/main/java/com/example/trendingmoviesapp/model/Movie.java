package com.example.trendingmoviesapp.model;

import com.example.trendingmoviesapp.util.Constants;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    @SerializedName(Constants.POSTER_PATH_NAME)
    private String posterPath;

    @SerializedName(Constants.ADULT_NAME)
    private boolean adult;

    @SerializedName(Constants.OVERVIEW_NAME)
    private String overview;

    @SerializedName(Constants.RELEASE_DATE_NAME)
    private String releaseDate;

    @SerializedName(Constants.GENRE_IDS_NAME)
    private List<Integer> genreIds = new ArrayList<Integer>();

    @SerializedName(Constants.ID_NAME)
    private Integer id;

    @SerializedName(Constants.ORIGINAL_TITLE_NAME)
    private String originalTitle;

    @SerializedName(Constants.ORIGINAL_LANGUAGE_NAME)
    private String originalLanguage;

    @SerializedName(Constants.TITLE_NAME)
    private String title;

    @SerializedName(Constants.BACKDROP_PATH_NAME)
    private String backDropPath;

    @SerializedName(Constants.POPULARITY_NAME)
    private Double popularity;

    @SerializedName(Constants.VOTE_COUNT_NAME)
    private Integer voteCount;

    @SerializedName(Constants.VIDEO_NAME)
    private Boolean video;

    @SerializedName(Constants.VOTE_AVERAGE_NAME)
    private Double voteAverage;

    public Movie(String posterPath, boolean adult, String overview, String releaseDate, List<Integer> genreIds, Integer id, String originalTitle, String originalLanguage, String title, String backDropPath, Double popularity, Integer voteCount, Boolean video, Double voteAverage) {
        this.posterPath = posterPath;
        this.adult = adult;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.genreIds = genreIds;
        this.id = id;
        this.originalTitle = originalTitle;
        this.originalLanguage = originalLanguage;
        this.title = title;
        this.backDropPath = backDropPath;
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.video = video;
        this.voteAverage = voteAverage;
    }

    String baseImageUrl  = "https://image.tmdb.org/t/p/w500";

    public String getPosterPath() {
        return "https://image.tmdb.org/t/p/w500"+posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBackDropPath() {
        return backDropPath;
    }

    public void setBackDropPath(String backDropPath) {
        this.backDropPath = backDropPath;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getBaseImageUrl() {
        return baseImageUrl;
    }

    public void setBaseImageUrl(String baseImageUrl) {
        this.baseImageUrl = baseImageUrl;
    }
}
