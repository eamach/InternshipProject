package Model.GitlabAutoSAST.Jobs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {

    private Job job;

    @BeforeEach
    void setUp() {
        job = new Job("job", 1);
    }

    @Test
    void getName() {
        assertEquals("job", job.getName());
    }

    @Test
    void setName() {
        job.setName("diff");
        assertEquals("diff", job.getName());
    }

    @Test
    void getId() {
        assertEquals(1, job.getId());
    }

    @Test
    void setId() {
        job.setId(2);
        assertEquals(2, job.getId());
    }
}