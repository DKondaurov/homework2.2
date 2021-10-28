package pro.sky.java.course1;

public abstract class Transport implements ServiceTransport{
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void check() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }
}

