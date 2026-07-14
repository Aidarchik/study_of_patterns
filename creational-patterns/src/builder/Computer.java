package builder;

import java.sql.ConnectionBuilder;

public class Computer {
    public Computer(Builder builder) {
        System.out.println(builder.toString());;
    }

    public static class Builder {
        private String cpu;
        private int ram;
        private boolean graphicsCardEnabled;

        public Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.graphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "cpu='" + cpu + '\'' +
                    ", ram=" + ram +
                    ", graphicsCardEnabled=" + graphicsCardEnabled +
                    '}';
        }
    }
}
