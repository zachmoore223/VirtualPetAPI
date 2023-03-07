package com.wcci.virtualPetAPI.restControllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wcci.virtualPetAPI.entities.Shelter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD) // reset the database for each test
@AutoConfigureMockMvc
class ShelterControllerTest {
    @Autowired
    private MockMvc mvc;

    //test zero shelters equals "[]"
    @Test
    public void getShelters() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/shelter").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("[]")));
    }

    //test adding 1 shelter
    @Test
    public void addShelter() throws Exception {
        final Shelter tester = new Shelter("Test Shelter");
        mvc.perform(MockMvcRequestBuilders.post("/api/shelter")
                        .accept(MediaType.APPLICATION_JSON) // I'm expecting JSON back because I'm a program and want recordized date
                        .contentType(MediaType.APPLICATION_JSON) // I'm a program and sending you JSON-encoded data
                        .content(getJsonContent(tester)))
                .andExpect(status().isOk());
    }

    private static String getJsonContent(Object o) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(o);
    }

}