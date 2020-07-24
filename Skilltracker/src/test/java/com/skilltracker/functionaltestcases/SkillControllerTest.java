package com.skilltracker.functionaltestcases;

import static com.skilltracker.utilityclasses.TestUtils.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.skilltracker.controller.SkillTrackerController;
import com.skilltracker.dtos.SkillTrackerDTO;
import com.skilltracker.servicesImpl.SkillTrackerServiceImpl;
import com.skilltracker.utilityclasses.MasterData;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@MockitoSettings(strictness = Strictness.LENIENT)
@WebMvcTest(SkillTrackerController.class)
public class SkillControllerTest {

	

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private SkillTrackerServiceImpl skillServiceImpl;

	@Test
	public void testAddSkill() throws Exception {
		when(skillServiceImpl.saveSkill(MasterData.getSkillTrackerDTO()))
		.thenReturn(MasterData.getSkillTrackerDTO());
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/skill-tracker/addSkill")
				.content(MasterData.asJsonString(MasterData.getSkillTrackerDTO()))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);
				
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		
		yakshaAssert(currentTest(), 
		(result.getResponse().getStatus() == HttpStatus.OK.value() ? "true" : "false"), 
		businessTestFile);
	}
	
	
	
	@Test
	public void testViewAll() throws Exception {
		List<SkillTrackerDTO> list = new ArrayList<SkillTrackerDTO>();
		list.add(MasterData.getSkillTrackerDTO());
		when(skillServiceImpl.getAllSkill())
		.thenReturn(list);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/gift-card/viewAllOrders")
				.content(MasterData.asJsonString(MasterData.getSkillTrackerDTO()))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);
				
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		
		yakshaAssert(currentTest(), 
		(result.getResponse().getStatus() == HttpStatus.OK.value() ? "true" : "false"), 
		businessTestFile);
	}
	
	@Test
	public  void testDeleteSkill() throws Exception{
		
		
		when(skillServiceImpl.deleteSkill("1"))
		.thenReturn(MasterData.getSkillTrackerDTO());
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/deleteSkill/1")
				.content(MasterData.asJsonString(MasterData.getSkillTrackerDTO()))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);
				
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		
		yakshaAssert(currentTest(), 
		(result.getResponse().getStatus() == HttpStatus.OK.value() ? "true" : "false"), 
		businessTestFile);
	}
	
	@Test
	public  void testUpdateSkill() throws Exception{
		
		when(skillServiceImpl.updateSkill(MasterData.getSkillTrackerDTO()))
		.thenReturn(MasterData.getSkillTrackerDTO());
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/updateSkill")
				.content(MasterData.asJsonString(MasterData.getSkillTrackerDTO()))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);
				
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		
		yakshaAssert(currentTest(), 
		(result.getResponse().getStatus() == HttpStatus.OK.value() ? "true" : "false"), 
		businessTestFile);
	}

}