package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {

    @Test
    void shouldBuildComputerWithCorrectCpu() {
        Computer computer = new Computer.Builder()
                .setCPU("Intel i9")
                .build();

        String actualCpu = computer.getCpu();

        assertEquals("Intel i9", actualCpu);
    }
}