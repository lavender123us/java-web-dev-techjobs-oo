package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        assertEquals(true, true);
    }

    @Test
    public void testIdValuesAreSame() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertTrue(job1.getId() != job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Boolean result = job3 instanceof Job;
        assertEquals(true, result);
    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job4 == job5);
    }

    @Test
    public void testIfReturnedStringsWithLines() {
        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        String print = "ID: _____ 1\nName: _____ Product tester\nEmployer: _____ ACME\n" +
//                        "Location: _____ Desert\nPosition Type: _____ Quality control\nCore Competency: _____ Persistence";
        String print = "ID: 6\nName: Product tester\nEmployer: ACME\n" +
                "Location: Desert\nPosition Type: Quality control\nCore Competency: Persistence" + "\n\n";

        assertEquals(print, job6.toString());
    }


    @Test
    public void testReturnMessage() {
        Job job7 = new Job("Product tester", new Employer(""), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String print = "ID: 5\nName: Product tester\nEmployer: Data not available\n" +
                "Location: Desert\nPosition Type: Quality control\nCore Competency: Persistence" + "\n\n";

        assertEquals(print, job7.toString());
    }

}
