package Less4hw;

public class name {
    private String title;
    private String model;
    private String number;

    public name(String title, String model, String number) {
        this.title = title;
        this.model = model;
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "name" +
                "title='" + title + '\'' +
                ", model='" + model + '\'' +
                ", number='" + number + '\'' +
                "";
    }
}
