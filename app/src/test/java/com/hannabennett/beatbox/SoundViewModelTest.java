package com.hannabennett.beatbox;

import org.junit.Before;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by HannaBennett on 11/14/17.
 */
public class SoundViewModelTest {
    private BeatBox mBeatBox;
    private Sound mSound;
    private SoundViewModel mSubject;

    @Before
    public void setUp() throws Exception {
        mBeatBox = mock(BeatBox.class);
        mSound = new Sound("assetPath");
        mSubject = new SoundViewModel(mBeatBox);
        mSubject.setSound(mSound);
    }

}