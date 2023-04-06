package Task3;

public class Pleyer implements Playeble, Recodable{
    @Override
    public void play() {
        System.out.println("Game is started");
    }

    @Override
    public void pause() {
        System.out.println("Game on pause");
    }

    @Override
    public void stop() {
        System.out.println("Game stop");
    }

    @Override
    public void record() {
        System.out.println("Game recording...");
    }
}
