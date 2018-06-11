package com.bignerdranch.android.beatbox.bindable;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.bignerdranch.android.beatbox.bean.Sound;
import com.bignerdranch.android.beatbox.data.BeatBox;

/**
 * 数据绑定
 */
public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }
    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
