package racingcar.domain;

public class Car {
    private final String name;
    private int position;

    private Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public static Car forName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("Car 이름은 5자 이하여야 합니다.");
        }
        return new Car(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }
}
