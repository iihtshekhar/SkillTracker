package com.skilltracker.exceptiontestcases;

import static com.skilltracker.utilityclasses.TestUtils.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

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
public class ExceptionTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private SkillTrackerServiceImpl skillTrackerServiceImpl;
	
	@Test
	public void testAddSkillException() throws Exception {
		
		SkillTrackerDTO skill = MasterData.getSkillTrackerDTO();
		skill.setSkillName("Java");
		skill.setRemarks("Good");
		when(skillTrackerServiceImpl.saveSkill(MasterData.getSkillTrackerDTO()))
		.thenReturn(MasterData.getSkillTrackerDTO());
		
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/skill-tracker/addSkill")
				.content(MasterData.asJsonString(MasterData.getSkillTrackerDTO()))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);
				
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		
		yakshaAssert(currentTest(), 
		(result.getResponse().getStatus() == HttpStatus.BAD_REQUEST.value() ? "true" : "false"), 
		exceptionTestFile);
	}
	
	@Test
	public  void testDeleteSkillException() throws Exception{
		
		
		when(skillTrackerServiceImpl.deleteSkill("1"))
		.thenReturn(MasterData.getSkillTrackerDTO());
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/deleteSkill/2")
				.content(MasterData.asJsonString(MasterData.getSkillTrackerDTO()))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);
				
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		
		yakshaAssert(currentTest(), 
		(result.getResponse().getStatus() == HttpStatus.NOT_FOUND.value() ? "true" : "false"), 
		exceptionTestFile);
	}
}
