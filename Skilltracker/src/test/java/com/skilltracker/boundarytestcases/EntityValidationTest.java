package com.skilltracker.boundarytestcases;

import static com.skilltracker.utilityclasses.TestUtils.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.junit4.SpringRunner;
import com.skilltracker.dtos.SkillTrackerDTO;
import com.skilltracker.utilityclasses.MasterData;

@RunWith(SpringRunner.class)
public class EntityValidationTest {

	private Validator validator;

	@Before
	public void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void testSkillTrackerSuccess() throws Exception {

		SkillTrackerDTO details = MasterData.getSkillTrackerDTO();
		Set<ConstraintViolation<SkillTrackerDTO>> violations = validator.validate(details);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);
	}

	@Test
	public void testSkillNameLength() throws Exception {

		SkillTrackerDTO skill = MasterData.getSkillTrackerDTO();
		skill.setSkillName("Java");
		Set<ConstraintViolation<SkillTrackerDTO>> violations = validator.validate(skill);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

	}

	@Test
	public void testRemarkNameLength() throws Exception {
		SkillTrackerDTO skill = MasterData.getSkillTrackerDTO();
		skill.setRemarks("Good");
		Set<ConstraintViolation<SkillTrackerDTO>> violations = validator.validate(skill);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

	}

	@Test
	public void testSkillName() throws Exception {
		SkillTrackerDTO skill = MasterData.getSkillTrackerDTO();
		skill.setSkillName("Java");
		Set<ConstraintViolation<SkillTrackerDTO>> violations = validator.validate(skill);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);
	}

	@Test
	public void testSkillType() throws Exception {
		SkillTrackerDTO skill = MasterData.getSkillTrackerDTO();
		skill.setSkilltype("Spring");
		Set<ConstraintViolation<SkillTrackerDTO>> violations = validator.validate(skill);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);
	}

}