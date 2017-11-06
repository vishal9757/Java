package com.avalia.learning.java.flightsimulation;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimulationTest {
	Simulation s;

	@Before
	public void setUp() throws Exception {
		s = new Simulation();
		s.read("C:\\flight");
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testSearch() {

		List<Flight> flights = s.search("LHR", "PEK", "fare");
		List<Flight> expected = new ArrayList<>();
		expected.add(new Flight("BA111,LHR,PEK,30-10-2010,2340,12.5,1200"));
		expected.add(new Flight("LH451,LHR,PEK,30-11-2010,1130,12.0,1400"));
		assertEquals(expected, flights);
	}

	@Test
	public void testSearchByDuration() {

		List<Flight> flights = s.search("LHR", "PEK", "duration");
		List<Flight> expected = new ArrayList<>();
		expected.add(new Flight("LH451,LHR,PEK,30-11-2010,1130,12.0,1400"));
		expected.add(new Flight("BA111,LHR,PEK,30-10-2010,2340,12.5,1200"));
		assertEquals(expected, flights);
	}

	@Test
	public void testSearchByFare1() {

		List<Flight> flights = s.search("BOM", "LHR", "fare");
		List<Flight> expected = new ArrayList<>();
		expected.add(new Flight("AF544,BOM,LHR,10-12-2010,1150,8.1,950"));
		// expected.add(new Flight("LH451,LHR,PEK,30-11-2010,1130,12.0,1400"));
		assertEquals(expected, flights);
	}

}
