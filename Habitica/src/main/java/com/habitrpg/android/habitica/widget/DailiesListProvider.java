package com.habitrpg.android.habitica.widget;

import android.content.Context;
import android.content.Intent;

import com.magicmicky.habitrpgwrapper.lib.models.tasks.Task;

public class DailiesListProvider extends TaskListProvider {
    public DailiesListProvider(Context context, Intent intent) {
        super(context, intent, Task.TYPE_DAILY);
    }
}

