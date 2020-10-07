package me.whiteship.infearnthejavatest;

import me.whiteship.Study;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class StudyTest {

    @Test
    @DisplayName("스터티 만들기")
    void create_new_study(){
        Study study = new Study();
        assertNotNull(study);
        System.out.println("create");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @Test
    @DisplayName("스터디 만들기 ╯°□°）╯")
    void create_new_study_again(){
        System.out.println("create1");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }
}
