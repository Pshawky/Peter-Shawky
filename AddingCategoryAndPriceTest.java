package org.gnucash.android.ui.account;


import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.gnucash.android.R;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class AddingCategoryAndPriceTest {

    @Rule
    public ActivityTestRule<AccountsActivity> mActivityTestRule = new ActivityTestRule<>(AccountsActivity.class);

    @Test
    public void addingCategoryAndPriceTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn_save), withText("Next"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction viewPager = onView(
                allOf(withId(R.id.pager),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        viewPager.perform(swipeLeft());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btn_save), withText("Next"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction viewPager2 = onView(
                allOf(withId(R.id.pager),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        viewPager2.perform(swipeLeft());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btn_save), withText("Next"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction viewPager3 = onView(
                allOf(withId(R.id.pager),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        viewPager3.perform(swipeLeft());

        DataInteraction appCompatCheckedTextView = onData(anything())
                .inAdapterView(allOf(withId(android.R.id.list),
                        childAtPosition(
                                withClassName(is("android.widget.LinearLayout")),
                                1)))
                .atPosition(1);
        appCompatCheckedTextView.perform(click());

        DataInteraction appCompatCheckedTextView2 = onData(anything())
                .inAdapterView(allOf(withId(android.R.id.list),
                        childAtPosition(
                                withClassName(is("android.widget.LinearLayout")),
                                1)))
                .atPosition(1);
        appCompatCheckedTextView2.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btn_save), withText("Next"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction viewPager4 = onView(
                allOf(withId(R.id.pager),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        viewPager4.perform(swipeLeft());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.btn_save), withText("Done"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction button = onView(
                allOf(withId(android.R.id.button1),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.ScrollView.class),
                                        0),
                                0),
                        isDisplayed()));
        button.check(matches(isDisplayed()));

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(android.R.id.button1), withText("Dismiss"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                3)));
        appCompatButton6.perform(scrollTo(), click());

        ViewInteraction cardView = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.account_recycler_view),
                                childAtPosition(
                                        withId(R.id.fragment_account_list),
                                        0)),
                        0),
                        isDisplayed()));
        cardView.perform(click());

        ViewInteraction cardView2 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.account_recycler_view),
                                childAtPosition(
                                        withId(R.id.fragment_account_list),
                                        0)),
                        0),
                        isDisplayed()));
        cardView2.perform(click());

        ViewInteraction cardView3 = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.account_recycler_view),
                                childAtPosition(
                                        withId(R.id.fragment_account_list),
                                        0)),
                        0),
                        isDisplayed()));
        cardView3.perform(click());

        ViewInteraction tabView = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tab_layout),
                                0),
                        0),
                        isDisplayed()));
        tabView.perform(click());

        ViewInteraction viewPager5 = onView(
                allOf(withId(R.id.pager),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(R.id.drawer_layout),
                                                0)),
                                1),
                        isDisplayed()));
        viewPager5.perform(swipeRight());

        ViewInteraction tabView2 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tab_layout),
                                0),
                        0),
                        isDisplayed()));
        tabView2.perform(click());

        ViewInteraction tabView3 = onView(
                allOf(childAtPosition(
                        childAtPosition(
                                withId(R.id.tab_layout),
                                0),
                        0),
                        isDisplayed()));
        tabView3.perform(click());

        ViewInteraction floatingActionButton = onView(
                allOf(withId(R.id.fab_create_transaction),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(R.id.drawer_layout),
                                                0)),
                                3),
                        isDisplayed()));
        floatingActionButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.input_account_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.name_text_input_layout),
                                        0),
                                0)));
        appCompatEditText.perform(scrollTo(), replaceText("Pizza"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.input_account_name), withText("Pizza"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.name_text_input_layout),
                                        0),
                                0)));
        appCompatEditText2.perform(scrollTo(), click());

        ViewInteraction appCompatSpinner = onView(
                allOf(withId(R.id.input_currency_spinner),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment_account_form),
                                        1),
                                1)));
        appCompatSpinner.perform(scrollTo(), click());

        DataInteraction appCompatCheckedTextView3 = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(68);
        appCompatCheckedTextView3.perform(click());

        ViewInteraction actionMenuItemView = onView(
                allOf(withId(R.id.menu_save), withText("Save"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.toolbar),
                                        2),
                                0),
                        isDisplayed()));
        actionMenuItemView.perform(click());

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.create_transaction),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.v7.widget.CardView")),
                                        0),
                                3),
                        isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction appCompatAutoCompleteTextView = onView(
                allOf(withId(R.id.input_transaction_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment_transaction_form),
                                        0),
                                0)));
        appCompatAutoCompleteTextView.perform(scrollTo(), replaceText("Lunch"), closeSoftKeyboard());

        ViewInteraction calculatorEditText = onView(
                allOf(withId(R.id.input_transaction_amount),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment_transaction_form),
                                        2),
                                1)));
        calculatorEditText.perform(scrollTo(), click());

        ViewInteraction calculatorEditText2 = onView(
                allOf(withId(R.id.input_transaction_amount),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment_transaction_form),
                                        2),
                                1)));
        calculatorEditText2.perform(scrollTo(), replaceText("133,88"), closeSoftKeyboard());

        ViewInteraction actionMenuItemView2 = onView(
                allOf(withId(R.id.menu_save), withText("Save"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.toolbar),
                                        2),
                                0),
                        isDisplayed()));
        actionMenuItemView2.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.input_converted_amount),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.converted_amount_text_input_layout),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("150"), closeSoftKeyboard());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.btn_save), withText("Save"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                1)));
        appCompatButton7.perform(scrollTo(), click());

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
