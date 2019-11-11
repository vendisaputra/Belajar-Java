package com.belajar.Belajar.java.controller;

import com.belajar.Belajar.java.entity.Mahasiswa;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

class MahasiswaControllerTest extends AbstrackTest{
    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
    }
    @Test
    public void getProductsList() throws Exception {
        String uri = "/products";
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Mahasiswa[] productlist = super.mapFromJson(content, Mahasiswa[].class);
        assertTrue(productlist.length > 0);
    }
}