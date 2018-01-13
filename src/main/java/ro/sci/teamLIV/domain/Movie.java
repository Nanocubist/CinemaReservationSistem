package ro.sci.teamLIV.domain;

import java.util.Date;

public class Movie extends AbstractModel {

    public MovieType movieType;
    public MovieGenreType movieGenreType;
    public String movieName;
    public String movieDuration;
    public Date movieDate;


    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public MovieGenreType getMovieGenreType() {
        return movieGenreType;
    }

    public void setMovieGenreType(MovieGenreType movieGenreType) {
        this.movieGenreType = movieGenreType;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(String movieDuration) {
        this.movieDuration = movieDuration;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    @Override
    public String toString() {
        return "Employee [movieName=" + movieName + ", movieDuration=" + movieDuration + ", movieDate=" + movieDate
                + "movieType=" + movieType + "movieGenreType=" + movieGenreType + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
        result = prime * result + ((movieType == null) ? 0 : movieType.hashCode());
        result = prime * result + ((movieDuration == null) ? 0 : movieDuration.hashCode());
        result = prime * result + ((movieDate == null) ? 0 : movieDate.hashCode());
        result = prime * result + ((movieGenreType == null) ? 0 : movieGenreType.hashCode());
        return result;
    }

}
