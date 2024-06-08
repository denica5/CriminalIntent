package com.example.criminalintent

import androidx.core.os.bundleOf
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isNotChecked
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CrimeDetailFragmentTest {


    @Before
    fun setUp() {

    }

    @After
    fun tearDown() {
    }

    @Test
    fun showsIsSolvedAfterPressCheckButton() {

//        val scenario = launchFragmentInContainer<CrimeDetailFragment>(bundleOf("numbers" to 0))
//        onView(withId(R.id.crime_solved)).perform(click())
//        onView(withId(R.id.crime_solved)).check(matches(isNotChecked()))
    }
}