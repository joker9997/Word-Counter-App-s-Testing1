package com.example.finaltry;
import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Test
    public void testWordCountFunctionality() {
        try (ActivityScenario<MainActivity> ignored = ActivityScenario.launch(MainActivity.class)) {
            onView(ViewMatchers.withId(R.id.editTextInput))
                    .perform(ViewActions.typeText("Hello world"), ViewActions.closeSoftKeyboard());
            onView(withId(R.id.spinner))
                    .perform(ViewActions.click());
            Espresso.onData(withText(R.string.count_words))
                    .perform(ViewActions.click());
            onView(withId(R.id.buttonCount))
                    .perform(ViewActions.click());
            onView(withId(R.id.textViewResult))
                    .check(matches(withText("Result: 2")));
        }
    }
}