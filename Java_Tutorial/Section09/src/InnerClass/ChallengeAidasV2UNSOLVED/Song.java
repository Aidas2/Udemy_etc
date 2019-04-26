package InnerClass.ChallengeAidasV2UNSOLVED;

public class Song {
    private String name;
    private double duration;

    public Song(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + this.name + '\'' +
                ", duration=" + this.duration +
                '}';
    }
}
