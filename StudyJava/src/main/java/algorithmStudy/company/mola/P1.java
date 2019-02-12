package algorithmStudy.company.mola;

import java.text.SimpleDateFormat;
import java.util.*;

class MovieNight {
    public static Boolean canViewAll(Collection<Movie> movies) {
        movies.stream()
                .sorted(Comparator.comparing(Movie::getStart))
                .reduce((m1, m2) -> m1.getEnd().compareTo(m2.getStart()) > 0 ? m1 : m2);



        return true;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
        movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));

        System.out.println(MovieNight.canViewAll(movies));
    }
}

class Movie {
    private Date start, end;

    public Movie(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}

public class P1 {
}

