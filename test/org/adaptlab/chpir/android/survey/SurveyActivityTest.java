package org.adaptlab.chpir.android.survey;

import org.adaptlab.chpir.android.survey.SurveyActivity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
public class SurveyActivityTest {
	private SurveyActivity activity;
	
	@Before
	public void setUp() {
		activity = Robolectric.buildActivity(SurveyActivity.class).create().get();
	}

    @Test
    public void shouldCreateSurveyFragementType() throws Exception {
    	assertThat(activity.createFragment(), instanceOf(SurveyFragment.class));
    }
}